package br.dev.leonardo.ecoimpact_prjct.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.leonardo.ecoimpact_prjct.R

@Composable
fun HomeScreen (modifier: Modifier = Modifier){
    Box (
        modifier =
        Modifier.background(color = Color(0xFF2196F3))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Text(
                "EcoImpact",
                fontSize=32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 60.dp)
            )
            Image(painter = painterResource(R.drawable.saveplants),
                contentDescription = "",
            )
            Text("Calcule seu impacto sustentável  por entregas feitas!",
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 60.dp),
            )
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF32BB37)
                ),
                modifier = Modifier.padding(top = 60.dp)
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
private fun  HomeScreenPreview(){
    HomeScreen()
}