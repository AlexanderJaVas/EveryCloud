package com.avvaapps.everycloud.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.avvaapps.everycloud.ui.theme.LightBlue

@Composable
fun ListItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp),
        colors = CardDefaults.cardColors(containerColor = LightBlue),
        shape = RoundedCornerShape(5.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 8.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Text(
                    text = "12:00",
                    color = Color.White
                )
                Text(
                    text = "Sunny",
                    color = Color.White
                )
            }
            Text(
                text = "25°C",
                color = Color.White,
                style = TextStyle(fontSize = 25.sp)
            )
            AsyncImage(
                model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                contentDescription = "weather_image",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 8.dp)
            )
        }

    }
}