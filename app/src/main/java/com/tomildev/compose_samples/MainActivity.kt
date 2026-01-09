package com.tomildev.compose_samples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tomildev.compose_samples.ui.theme.Compose_samplesTheme
import com.tomildev.compose_samples.views.counters.likeCounter.BasicCounterScreen
import com.tomildev.compose_samples.views.textFields.basic_login.BasicLoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_samplesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //BasicCounterScreen()
                    BasicLoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}