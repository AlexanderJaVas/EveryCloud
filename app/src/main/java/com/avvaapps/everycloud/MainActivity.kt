package com.avvaapps.everycloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.avvaapps.everycloud.screens.MainCard
import com.avvaapps.everycloud.screens.TabLayout
import com.avvaapps.everycloud.ui.theme.EveryCloudTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EveryCloudTheme {
                Image(
                    painter = painterResource(id = R.drawable.main_screen),
                    contentDescription = "main_screen_image",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.FillBounds
                )
                Column{
                    MainCard()
                    TabLayout()
                }
            }
        }
    }
}