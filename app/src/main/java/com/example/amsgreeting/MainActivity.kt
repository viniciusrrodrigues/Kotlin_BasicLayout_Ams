package com.example.amsgreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.amsgreeting.ui.theme.AmsGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmsGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  GreetingImage(message = "2º Novotec Desenvolvimento de Sistemas AMS")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {

    Column (

        modifier = modifier
    ){

        Text(
            text = message,
            fontSize = 35.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun GreetingImage(message: String, modifier: Modifier = Modifier){
 val image = painterResource(R.drawable.imagemdesaudasao)
    Box (modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        GreetingText(
            message = message,
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp)

        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AmsGreetingTheme {
        GreetingImage("2º Novotec Desenvolvimento de Sistemas AMS")
    }
}