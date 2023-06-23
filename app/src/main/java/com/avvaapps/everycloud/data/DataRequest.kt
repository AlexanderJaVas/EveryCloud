package com.avvaapps.everycloud.data

import android.content.Context
import android.util.Log
import androidx.compose.runtime.MutableState
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

const val API_KEY = "5dd172761dfb4d75880184229231906"

fun getData(
    city: String, context: Context, daysList: MutableState<List<WeatherModel>>) {
    val url = "https://api.weatherapi.com/v1/forecast.json?" +
            "key=$API_KEY" +
            "&q=$city" +
            "&days=3" +
            "&aqi=no" +
            "&alerts=no"
    val queue = Volley.newRequestQueue(context)
    val request = StringRequest(
        Request.Method.GET,
        url,
        { response ->
            val list = getWeatherByDays(response)
            daysList.value = list
        },
        { error ->
            Log.d("MyLog, ", "VolleyError: $error")
        }
    )
    queue.add(request)
}

fun getWeatherByDays(response: String): List<WeatherModel> {
    if (response.isEmpty()) return listOf()
    val list = ArrayList<WeatherModel>()
    val mainObject = JSONObject(response)
    val city = mainObject.getJSONObject("location").getString("name")
    val days = mainObject.getJSONObject("forecast").getJSONArray("forecastday")

    for (i in 0 until days.length()) {
        val item = days[i] as JSONObject
        list.add(
            WeatherModel(
                city,
                item.getString("date"),
                "",
                item.getJSONObject("day").getJSONObject("condition").getString("text"),
                item.getJSONObject("day").getJSONObject("condition").getString("icon"),
                item.getJSONObject("day").getString("maxtemp_c"),
                item.getJSONObject("day").getString("mintemp_c"),
                item.getJSONArray("hour").toString()
            )
        )
    }
    list[0] = list[0].copy(
        time = mainObject.getJSONObject("current").getString("last_updated"),
        currentTemperature = mainObject.getJSONObject("current").getString("temp_c")
    )
    return list
}