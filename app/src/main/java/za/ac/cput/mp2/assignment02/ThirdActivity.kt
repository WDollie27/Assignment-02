package za.ac.cput.mp2.assignment02.ui.theme

// Name: Waseem Dollie
// Student no: 216040566


import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import za.ac.cput.mp2.assignment02.Screen



@Composable
fun Modules(navController: NavController){

//This code is for the TopAppBar
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "MPII - Assignment 03 - Practical 03" +
                                " ",
                        color = Color.White)
                },
                backgroundColor = Color(0xFF000000)
            ) },
        content = { Screen.ThirdActivity},
        backgroundColor = Color(0xFFEDEAE0),
    )

    Column(modifier = Modifier
        .fillMaxSize()
    )

    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

        }
    }


//LazyColumn code so that the screen can scroll
    LazyColumn{
        item{
            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 60.dp)
                    .padding(horizontal = 130.dp),



                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start

            )


            {
                Button(
//Using popBackstack to go back to the previous screen
                    onClick = {navController.popBackStack()},
                    Modifier
                        .width(150.dp)
                        .height(55.dp)
                        .background(Color(0xFFEEDC82)),

                    )
                {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "", Modifier.size(20.dp)
                    )
                    Spacer(
                        Modifier.size(ButtonDefaults.IconSpacing)
                    )
                    // Text of the button
                    Text(
                        text = "back",
                        fontSize = 16.sp,
                    )
                }
            }
        }

//Creating an item to keep information of ADT3 together
        item{
//Cards allow items to be kept together
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(180.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.Center)
                ) {

                    Text("Name:Applications Development Theory 3",
                        color = Color.Black)
                    Text("Type: Theory and Practical",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)

                }
            }}

//Creating an item to keep information of ADP3 together
        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.Center)
                ) {

                    Text("Name: Applications Development Practice 3",  color = Color.Black)
                    Text("Type: Practical",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black) }
            }}

//Creating an item to keep information of Information Systems 3 together
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: Information Systems 3",  color = Color.Black)
                    Text("Type: Theory",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)
                }
            }
        }

//Creating an item to keep information of ICT Electives 3 together
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: ICT Electives 3",  color = Color.Black)
                    Text("Type: Practical",  color = Color.Black)
                    Text("Duration: Semester",  color = Color.Black)

                }
            }
        }

//Creating an item to keep information of Professional Practice 3 together
        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: Professional Practice 3",  color = Color.Black)
                    Text("Type: Theory ",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)

                }}}

//Creating an item to keep information of Project Presentation 3 together
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: Project Presentation 3",  color = Color.Black)
                    Text("Type: Theory",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)
                }
            }


        }

//Creating an item to keep information of Project together
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: Project 3",  color = Color.Black)
                    Text("Type: Practical",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)
                }
            }
        }

//Creating an item to keep information of Project Management 3 together
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFFEEDC82)
                )
            {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xFFEEDC82))
                        .wrapContentSize(Alignment.CenterStart)
                ) {

                    Text("Name: Project Management 3",  color = Color.Black)
                    Text("Type: Theory",  color = Color.Black)
                    Text("Duration: Year-Round",  color = Color.Black)
                }
            }
        }

//Creating a button for the alert dialog
        item {

//Ends a program
                val activity=(LocalContext.current as? Activity)
//Closes the program page
                val openDialog= remember {
                    mutableStateOf(false)
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
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
                            imageVector = Icons.Default.Done,
                            contentDescription = "", Modifier.size(25.dp)
                        )
// Creating a space between the icon and the text of the button
                        Spacer(
                            Modifier.size(ButtonDefaults.IconSpacing)
                        )
                        Text(
                            text = "Goodbye",
                            fontSize = 16.sp,
                        )
                    }
                }



//This code is to display the AlertDialog text when clicking on the button
                    if (openDialog.value) {
                        AlertDialog(
                            onDismissRequest = { openDialog.value = false },
                            title = {
                                Text(text = "AlertDialog", fontWeight = FontWeight.Bold, fontSize = 16.sp)

                            },
                            text = {
                                Text(text = "Leaving Now?", fontSize = 18.sp)
                            },

//This code closes the whole application
                            confirmButton = {
                                TextButton(onClick = {
                                    activity?.finish()
                                }){
                                    Text(text = "Yes")
                                }
                            },

//This code closes the page
                            dismissButton=
                            {
                                TextButton(onClick = { openDialog.value = false}) {
                                    Text("No")

                                }
                            },

                        )}}}
        }









