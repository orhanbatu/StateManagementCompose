package com.orhanbatu.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

    val myString = remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            SpecialText(string = "TEST")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialText(string = "Android")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialTextField(string = myString.value) {
                //That is how we can put our specific String to database, we can upload it etc.
                myString.value = it
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpecialTextField(string : String, function : (String) -> Unit ) {

    TextField(value = string, onValueChange = function)
}

@Composable
fun SpecialText(string : String) {
    Text (text = string, fontSize = 24.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MainScreen()
}