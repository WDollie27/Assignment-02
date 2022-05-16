package za.ac.cput.mp2.assignment02.ui.theme

// Name: Waseem Dollie
// Student no: 216040566

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import za.ac.cput.mp2.assignment02.*

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.MainActivity.route)
    {
//Everything that is displayed on the MainActivity
        composable(Screen.MainActivity.route)
        {
           MainContent()
            GetScaffold()
            AlertDialog()
            StartJourneyButton(navController = navController)
        }
//Everything that is displayed on the SecondActivity
        composable(Screen.SecondActivity.route)
        {
            Get()
            Name()
            Course()
            Department()
            StudentNumber()
            ModuleButton(navController = navController)
            BackButton(navController = navController)
        }
//Everything that is displayed on the ThirdActivity
        composable(Screen.ThirdActivity.route)
        {
            Modules(navController = navController)
        }
    }}



