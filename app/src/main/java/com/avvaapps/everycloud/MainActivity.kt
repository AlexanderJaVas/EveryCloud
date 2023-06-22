package com.avvaapps.everycloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.avvaapps.everycloud.screens.MainCard
import com.avvaapps.everycloud.ui.theme.EveryCloudTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EveryCloudTheme {
                MainCard()
            }
        }
    }
}