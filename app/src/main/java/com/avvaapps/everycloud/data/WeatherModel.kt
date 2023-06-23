package com.avvaapps.everycloud.data

data class WeatherModel(
    val city: String,
    val time: String,
    val currentTemperature: String,
    val condition: String,
    val icon: String,
    val maxTemperature: String,
    val minTemperature: String,
    val hours: String
)

