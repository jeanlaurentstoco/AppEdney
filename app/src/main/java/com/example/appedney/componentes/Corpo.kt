package com.example.appedney.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appedney.ui.theme.Preto
import com.example.appedney.ui.theme.fundo
import com.example.appedney.ui.theme.fundobt
import com.example.appedney.ui.theme.fundobt2
import com.example.appedney.ui.theme.fundobt3
import com.example.appedney.ui.theme.fundobt4

@Composable
fun body(navController: NavController, modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Column(modifier = modifier.fillMaxSize()) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(color = fundo)
                    .fillMaxWidth(),
            ) {
                Column {
                    Spacer(Modifier.weight(1f))
                    Row {
                        Spacer(Modifier.weight(1f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Dados e Evolução")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt, // Background color
                                contentColor = Color.White,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Dados e Evolução", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(0.2f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Médias")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt2, // Background color
                                contentColor = Color.White,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Médias", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(1f))
                    }
                    Spacer(Modifier.weight(0.1f))
                    ////////////////////////////////////////////////////////////////////////////////
                    Row {
                        Spacer(Modifier.weight(1f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Etiquetas")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt, // Background color
                                contentColor = Color.White,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Etiquetas", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(0.2f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Fases")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt3, // Background color
                                contentColor = Preto,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Fases", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(1f))
                    }
                    Spacer(Modifier.weight(0.1f))
                    ////////////////////////////////////////////////////////////////////////////////
                    Row {
                        Spacer(Modifier.weight(1f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Acomp. Prensagem")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt, // Background color
                                contentColor = Color.White,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Acomp. Prensagem", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(0.2f))
                        Button(
                            shape = RoundedCornerShape(24.dp),
                            onClick = {
                                navController.navigate("Gráficos")
                            },
                            modifier = modifier
                                .width(251.dp)
                                .height(84.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = fundobt4, // Background color
                                contentColor = Preto,  // Text/content color
                                //disabledContainerColor = Color.LightGray, // Disabled background
                                //disabledContentColor = Color.Gray // Disabled text/content
                            )
                        ) {
                            Text(
                                "Gráficos", modifier = modifier, fontSize = 24.sp
                            )
                        }
                        Spacer(Modifier.weight(1f))
                    }
                    Spacer(Modifier.weight(1f))
                }
                NavegacaoInferior(modifier = Modifier.align(Alignment.BottomCenter))
            }
        }
    }
}