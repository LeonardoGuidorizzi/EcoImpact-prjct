package br.dev.leonardo.ecoimpact_prjct.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.leonardo.ecoimpact_prjct.R

@Composable
fun SelectVehicleScreen (modifier: Modifier = Modifier){
    Box (
        modifier = Modifier
            .background(color = Color(0xFF2196F3))
            .fillMaxSize()
            .padding(top = 100.dp)


    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp), // Padding lateral opcional
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text("Selecione o seu transporte:",
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 60.dp),
            )

            Spacer(modifier = modifier.height(32.dp))


            var transporteSelecionado by remember {
                mutableStateOf( -1)
            }


            Row(verticalAlignment = Alignment.CenterVertically ,
            ) {
                RadioButton(
                    selected = transporteSelecionado == 0,
                    onClick = {transporteSelecionado = 0},
                    colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.Gray)
                )
                Text("Carro",
                    fontSize = 16.sp,
                    color = Color.White)
            }

            Row(verticalAlignment = Alignment.CenterVertically ,
            ) {
                RadioButton(
                    selected = transporteSelecionado == 1,
                    onClick = {transporteSelecionado = 1},
                    colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.Gray)
                )
                Text("Caminhão",
                    fontSize = 16.sp,
                    color = Color.White)
            }

            Spacer(modifier = modifier.height(50.dp))

            Image(painter = painterResource(R.drawable.saveplants),
                contentDescription = "Imagem de mãos segurando uma árvore",
            )

            Spacer(modifier = modifier.height(50.dp))

            Button(onClick = {},
                modifier = Modifier.padding(horizontal = 30.dp).width(250.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF42CB3F))
            ) {
                Text("Próximo")

            }

        }





    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SelectVehiclePreview() {
    SelectVehicleScreen()
}