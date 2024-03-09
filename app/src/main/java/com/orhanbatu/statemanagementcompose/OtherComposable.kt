package com.orhanbatu.statemanagementcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen(modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            val myString = remember { mutableStateOf("") }

            TextField(value = myString.value, readOnly = false, onValueChange = {

                myString.value = it
                println(myString.value)

            })

            Spacer(modifier = Modifier.padding(10.dp))

            Text(

                text = "Hello Poland",
                modifier = modifier,
                fontSize = 26.sp,
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = {
                println("Button has Clicked")
            }) {
                Text(text = "My")
                Text(text = "Button")

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.img),
                contentDescription = "The palace of culture and science",
                modifier = Modifier
                    .height(350.dp)
                    .width(400.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))

        }
    }
}