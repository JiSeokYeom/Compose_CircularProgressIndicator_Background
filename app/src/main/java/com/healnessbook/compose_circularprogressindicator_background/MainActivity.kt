package com.healnessbook.compose_circularprogressindicator_background

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.healnessbook.compose_circularprogressindicator_background.ui.theme.Compose_CircularProgressIndicator_BackgroundTheme
import com.healnessbook.composecircularprogresslib.CustomCircularProgressIndicatorWithBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_CircularProgressIndicator_BackgroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CustomCircularProgressIndicatorWithBackground(
                        progress = 0.1f,
                        strokeWidth = 10.dp
                    )
                }
            }
        }
    }
}
