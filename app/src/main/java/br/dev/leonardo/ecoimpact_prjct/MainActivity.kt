package br.dev.leonardo.ecoimpact_prjct

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.dev.leonardo.ecoimpact_prjct.screens.HomeScreen
import br.dev.leonardo.ecoimpact_prjct.screens.InfoScreen
import br.dev.leonardo.ecoimpact_prjct.screens.InputScreen
import br.dev.leonardo.ecoimpact_prjct.screens.SelectVehicleScreen
import br.dev.leonardo.ecoimpact_prjct.ui.theme.EcoImpactprjctTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InfoScreen()
        }
    }
}

