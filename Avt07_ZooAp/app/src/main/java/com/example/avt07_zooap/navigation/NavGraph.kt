package com.example.avt07_zooap.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.avt07_zooap.ui.screens.AnimalScreen
import com.example.avt07_zooap.ui.screens.HomeScreen
import com.example.avt07_zooap.models.animalList

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/${animal.name}")
            })
        }
        composable("animal/{animal}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animal")
            val selectedAnimal = animalList.first { it.name == animalName }
            AnimalScreen(selectedAnimal)
        }
    }
}
