package com.example.compose_1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column (modifier = Modifier
                .verticalScroll(rememberScrollState())
            ) {
                ListItem("Ivo", "bobul1")
                ListItem("Ivo1", "bobul2")
                ListItem("Ivo2", "bobul3")
                ListItem("Ivo3", "bobul4")
                ListItem("Ivo4", "bobul5")
                ListItem("Ivo5", "bobul6")
                ListItem("Ivo6", "bobul7")
                ListItem("Ivo7", "bobul8")
            }
        }
    }
}


@Composable
private fun ListItem(name: String, prof: String){
    var counter = remember {
        mutableStateOf(0)
        }
        Card(
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.Unspecified)
                .clickable { Log.d("My log", "Clicked") }
                .clickable {
                    counter.value++
                }
        ) {
            Box(){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color.Unspecified)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.boiler),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(10.dp)
                            .size(84.dp)
                            .clip(CircleShape)
                        )
                    Column(
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    ) {
                        Text(text = counter.value.toString())
                        Text(text = prof)
                    }

                }

            }
        }
}