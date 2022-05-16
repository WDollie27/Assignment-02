package za.ac.cput.mp2.assignment02

// Name: Waseem Dollie
// Student no: 216040566

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


//This code is for the TopAppBar
@Composable
fun Get(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "MPII - Assignment 03 - Practical 02" +
                        " ",
                color = Color.White)},
            backgroundColor = Color(0xFF000000)) },
        content = {Screen.SecondActivity},
        backgroundColor = Color(0xFFEDEAE0),
    )
}


@Composable
fun Name() {
    Text(
// Name text
        text = "Name and Surname: Waseem Dollie",

// Creating a background for the text
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .padding(vertical = 50.dp)
            .height(100.dp)
            .background(Color(0xFFEEDC82))
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun Course() {
    Text(
// Course text
        text = "Course of study: Applications Development",

// Creating a background for the text
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 170.dp)
            .padding(horizontal = 15.dp)
            .width(380.dp)
            .height(100.dp)
            .background(Color(0xFFEEDC82))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun Department() {
    Text(
// Department text
        text = "Department: Information and Communications Technology",

// Creating a background for the text
        modifier = Modifier
            .fillMaxWidth()

            .padding(vertical = 274.dp)
            .padding(horizontal = 14.dp)
            .width(381.dp)
            .height(100.dp)
            .background(Color(0xFFEEDC82))
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun StudentNumber() {
    Text(
// Student Number text
        text = "Student Number: 216040566",

// Creating a background for the text
        modifier = Modifier
            .fillMaxWidth()

            .padding(horizontal = 14.dp)
            .padding(vertical = 100.dp)
            .padding(top = 278.dp)
            .width(381.dp)
            .height(100.dp)
            .background(Color(0xFFEEDC82))
            .wrapContentSize(Alignment.Center),
        )
}

@Composable
fun ModuleButton(navController: NavController){
//Creating a column so that the information and button can be in the center
    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(vertical = 120.dp)
            .padding(horizontal = 100.dp),

        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )

//Creating a button
    {
        Button(
//Coding to select the screen that the page needs to navigate to
            onClick = {navController.navigate(route=Screen.ThirdActivity.route)},
            Modifier
                .width(150.dp)
                .height(55.dp)
                .background(Color(0xFFEEDC82)),

        )
        {
            Icon(
                imageVector = Icons.Filled.List,
                contentDescription = "", Modifier.size(30.dp)
            )
            Spacer(
                Modifier.size(ButtonDefaults.IconSpacing)
            )
            // Text of the button
            Text(
                text = "Current Modules",
                fontSize = 15.sp,
            )
        }
    }
}

@Composable
//Allows the button to go back to the MainActivity
fun BackButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(vertical = 50.dp)
            .padding(horizontal = 130.dp),


        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Button(
//Using popBackstack to go back to the Welcome Screen that called the JourneyScreen
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




