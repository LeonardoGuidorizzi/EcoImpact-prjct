package br.dev.leonardo.ecoimpact_prjct.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.dev.leonardo.ecoimpact_prjct.screens.HomeScreen
import br.dev.leonardo.ecoimpact_prjct.screens.SelectVehicleScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home") { HomeScreen(navController)  }
        composable("selectVehicle") { SelectVehicleScreen(navController)  }
    }
}
