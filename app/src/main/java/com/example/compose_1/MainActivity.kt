package com.example.compose_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Box (contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                CircleItem()
            }
        }
    }
}


@Composable
private fun CircleItem(){
    val btCounter = remember {
        mutableStateOf(0)
    }
    val scrnColor = remember {
        mutableStateOf(Color.Gray)
    }
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
        .size(100.dp)
        .background(color = scrnColor.value, shape = CircleShape)
            .clickable {
                when(++btCounter.value){
                    10 -> scrnColor.value = Color.Red
                    20 -> scrnColor.value = Color.Green
                }

            }
    ){
        Text(text = btCounter.value.toString(),
            style = androidx.compose.ui.text.TextStyle(color = Color.White, fontSize = 20.sp)
            )
    }
}