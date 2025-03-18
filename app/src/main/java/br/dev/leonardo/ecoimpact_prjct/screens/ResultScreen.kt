package br.dev.leonardo.ecoimpact_prjct.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2196F3)),
        contentAlignment = Alignment.Center
    ){
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Resultado da pesquisa",
                    fontSize = 30.sp,
                    color = Color.White
                )
                Text(
                    text = "Aqui está o resultado das suas informações:",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
            }

            Column (
                modifier = Modifier.padding(top = 30.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp,)
            ){

                Card(modifier = Modifier.height(100.dp).width(370.dp)) {
                    Text(
                        text = "Carbono gerado em gramas:",
                        color = Color.Black,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "g 20.000",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(10.dp, 0.dp)
                    )
                }
                Card(modifier = Modifier.height(100.dp).width(370.dp)) {
                    Text(
                        text = "Carbono gerado em libra:",
                        color = Color.Black,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "lb 44,09",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(10.dp, 0.dp)
                    )
                }
                Card(modifier = Modifier.height(100.dp).width(370.dp)) {
                    Text(
                        text = "Carbono gerado em quilograma:",
                        color = Color.Black,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "kg 20",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(10.dp, 0.dp)
                    )
                }
                Card(modifier = Modifier.height(100.dp).width(370.dp)) {
                    Text(
                        text = "Carbono gerado em megatonelada:",
                        color = Color.Black,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "mt 0,00000002",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(10.dp, 0.dp)
                    )
                }
            }
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF32BB37)
                ),
                modifier = Modifier.padding(top = 60.dp)
                    .width(200.dp).height(70.dp)
            ) {
                Text("Home",
                    fontSize = 30.sp,
                )

            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ResultScreenPreview(){
    ResultScreen()
}





