package za.ac.cput.mp2.assignment02

// Name: Waseem Dollie
// Student no: 216040566

//This is a class that links the MainActivity to the SecondActivity
sealed class Screen(val route: String) {
    object MainActivity: Screen(route = "main_screen")
    object SecondActivity: Screen(route = "second_screen")

}
