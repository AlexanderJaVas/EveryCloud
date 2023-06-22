package com.avvaapps.everycloud.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.avvaapps.everycloud.R
import com.avvaapps.everycloud.ui.theme.LightBlue

@Preview(showBackground = true)
@Composable
fun MainCard() {
    Image(
        painter = painterResource(id = R.drawable.main_screen),
        contentDescription = "main_screen_image",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f),
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),

        ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = LightBlue),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(top = 8.dp, start = 8.dp),
                        text = "22 June 2023 15:00",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.White
                    )
                    AsyncImage(
                        model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                        contentDescription = "weather_image",
                        modifier = Modifier
                            .size(35.dp)
                            .padding(top = 3.dp, end = 8.dp)
                    )
                }
            }
        }
    }
}