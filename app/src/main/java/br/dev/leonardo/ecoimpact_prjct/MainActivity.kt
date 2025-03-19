package br.dev.leonardo.ecoimpact_prjct

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.dev.leonardo.ecoimpact_prjct.navigation.AppNavigation
import br.dev.leonardo.ecoimpact_prjct.screens.SelectVehicleScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppNavigation()
        }
    }
}

