package za.ac.cput.mp2.assignment02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import za.ac.cput.mp2.assignment02.ui.theme.Assignment02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment02Theme {
                GetScaffold()
                AlertDialog()
            }
        }
    }
}

//This code is for the TopAppBar
@Composable
fun GetScaffold(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "MPII - Assignment 02 - Practical 01" +
                        " ",
                color = Color.White)},
            backgroundColor = Color(0xFF000000)) },
        content = {MainContent()},
        backgroundColor = Color(0xFFEDEAE0),
    )
}

//This code is for the Box as well as Text inside the box
@Composable
fun MainContent(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFEEDC82)),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Welcome to my Jetpack Compose Journey")

        }}}


//This code is for the button and the text inside it as well as the picture
@Composable
fun AlertDialog() {
    val openDialog = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { openDialog.value = true },
            Modifier
                .width(150.dp)
                .height(55.dp)
                .background(Color(0xFFEEDC82)),
        )
        {

//This is the code for the + image
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "", Modifier.size(30.dp)
            )
            Spacer(
                Modifier.size(ButtonDefaults.IconSpacing)
            )
            Text(
                text = "Info",
                fontSize = 30.sp,
            )
        }
    }


//This code is to display the AlertDialog text when clicking on the button
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            title = {
                Text(text = "Alert Dialog", fontWeight = FontWeight.Bold, fontSize = 16.sp)

            },
            text = {
                Text(
                    text = "Hello Mobile Development team, Welcome to my Jetpack Compose Journey. My perception of this journey so far has been great. I learnt how to code in Java and now i'm learning how to code in Kotlin using Jetpack Compose.",
                    fontSize = 16.sp
                )
            },

//This is the code for the close button in the Alert Dialog
            confirmButton = {
                TextButton(onClick = {
                    openDialog.value = false
                }) {
                    Text(text = "Close")
                }
            },
        )
    }
}