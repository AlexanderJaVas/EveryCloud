package com.avvaapps.everycloud.data

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

const val API_KEY = "5dd172761dfb4d75880184229231906"

fun getData(
    city: String, context: Context) {
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
            Log.d("MyLog, ", "Response: $response")
        },
        { error ->
            Log.d("MyLog, ", "VolleyError: $error")
        }
    )
    queue.add(request)
}