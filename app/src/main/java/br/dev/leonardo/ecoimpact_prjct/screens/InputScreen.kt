package br.dev.leonardo.ecoimpact_prjct.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputScreen(modifier: Modifier = Modifier) {
    var weight by remember { mutableStateOf("") }
    var distance by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF2196F3)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ) {
            // Title
            Text(
                text = "Informações de Envio",
                fontSize = 30.sp,
                color = Color.White
            )

            // Description
            Text(
                text = "Preencha as informações para realizar o cálculo:",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Form Part
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Weight Input
                Column (
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text("Peso:", fontSize = 18.sp, color = Color.White)
                    TextField(
                        value = weight,
                        onValueChange = { weight = it },
                        placeholder = { Text("ex: 5000 (5kg)") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                }
                Column (
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Text("Unidade de peso:", fontSize = 18.sp, color = Color.White)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF32BB37)),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("G", fontSize = 18.sp, color = Color.White)
                        }
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF32BB37)),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("KG", fontSize = 18.sp, color = Color.White)
                        }
                    }
                }



                // Distance Input

                Column (
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Text("Distância percorrida:", fontSize = 18.sp, color = Color.White)
                    TextField(
                        value = distance,
                        onValueChange = { distance = it },
                        placeholder = { Text("ex: 2000 (2k)") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text("Unidade de distancia:", fontSize = 18.sp, color = Color.White)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF32BB37)),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("KM", fontSize = 18.sp, color = Color.White)
                        }
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF32BB37)),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("MILES", fontSize = 18.sp, color = Color.White)
                        }
                    }
                }

            }

            // Submit Button
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF32BB37)),
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Calcular", fontSize = 22.sp, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInputScreen() {
    InputScreen()
}