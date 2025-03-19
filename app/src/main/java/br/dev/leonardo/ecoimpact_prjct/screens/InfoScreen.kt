package br.dev.leonardo.ecoimpact_prjct.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.dev.leonardo.ecoimpact_prjct.R

@Composable
fun InfoScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2196F3))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Sobre o App:",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 60.dp)
            )


            Text(
                text = "Nosso aplicativo tem como objetivo conscientizar empresas " +
                        "e indivíduos sobre o impacto ambiental do transporte " +
                        "terrestre. Através da simulação do consumo energético e " +
                        "da emissão de CO₂ de veículos como carros e caminhões, " +
                        "o app permite que os usuários compreendam melhor os " +
                        "efeitos de suas escolhas de transporte no meio ambiente.",
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                textAlign = TextAlign.Justify,
                lineHeight = 28.sp,
                letterSpacing = 0.5.sp,
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 16.dp)
            )



            Image(painter = painterResource(R.drawable.saveplants),
                contentDescription = "",
            )

            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF32BB37)
                ),
                modifier = Modifier.padding(top = 30.dp)
                    .width(200.dp).height(70.dp)
            ) {
                Text("Começar",
                    fontSize = 30.sp,
                )

            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun InfoScreenPreview() {
    val navController = rememberNavController()
    InfoScreen(navController = navController)
}