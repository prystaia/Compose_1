package com.example.compose_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_1.ui.theme.Compose_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            NewText()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewText(){
    Row (
        modifier = Modifier
            .background(Color.Gray).fillMaxWidth().fillMaxHeight(0.5f)
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.Top
    ){
        Column (
            modifier = Modifier
                .background(Color.Green).fillMaxWidth(0.5f).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Hello!")
            Text(text = "Everyone!")
            Text(text = "Last element!")
        }
        Column (
            modifier = Modifier
                .background(Color.Red).fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Hello!")
            Text(text = "Everyone!")
            Text(text = "Last element!")
        }
    }

}




//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Compose_1Theme {
//        Greeting("Android")
//    }
//}