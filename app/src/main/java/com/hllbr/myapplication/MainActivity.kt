package com.hllbr.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hllbr.myapplication.ui.theme.StateManagementComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    androidx.compose.material.Surface(color = Color.DarkGray) {
        Column(modifier = Modifier.fillMaxSize()
            ,verticalArrangement = Arrangement.Center
            ,horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello!",color = Color.White
            ,fontSize = 20.sp
            ,fontStyle = FontStyle.Normal)
            
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = {
                println("Buton Clicked")
            }) {
                /*
                Butonlar içersinede bir composable yerleştirilebilir.
                Butonlar içerisine birden fazla composable yerleştirilebilir.
                 */
                Text(text = "Button")
                Spacer(modifier = Modifier.padding(7.dp))
                Text(text = "Button Test")
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
    /*
    State and Jetpack Composable =

     */
}