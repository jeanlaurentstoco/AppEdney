package com.example.appedney.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.appedney.R
import com.example.appedney.ui.theme.Laranja
import com.example.appedney.ui.theme.LaranjaClaro
import androidx.navigation.NavController


@Composable
fun NavegacaoInferior(modifier: Modifier = Modifier, navController: NavController) {
    Surface(modifier = modifier, shape = RoundedCornerShape(24.dp)) {
        Column(modifier = modifier) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Laranja,
                                LaranjaClaro
                            )
                        )
                    )
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Spacer(modifier = Modifier.weight(0.1f)) // borda esquerda

                    IconButton(onClick = {
                        navController.navigate("TelaInicio")
                    }, modifier = Modifier.size(76.dp)) {
                        AsyncImage(
                            model = R.drawable.home,
                            contentDescription = null,
                            modifier = Modifier
                                .size(76.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop,
                            placeholder = painterResource(id = R.drawable.home)
                        )
                    }

                    Spacer(modifier = Modifier.weight(1f)) // espaçamento entre imagens

                    IconButton(
                        onClick = {
                            navController.navigate("TelaInicio")
                        },
                        modifier = Modifier.size(76.dp)
                    ) {
                        AsyncImage(
                            model = R.drawable.ensaios,
                            contentDescription = null,
                            modifier = Modifier
                                .size(76.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop,
                            placeholder = painterResource(id = R.drawable.ensaios)
                        )
                    }

                    Spacer(modifier = Modifier.weight(1f)) // espaçamento entre imagens

                    IconButton(onClick = {
                        navController.navigate("TelaInicio")
                    }, modifier = Modifier.size(76.dp)) {
                        AsyncImage(
                            model = R.drawable.graficos,
                            contentDescription = null,
                            modifier = Modifier
                                .size(76.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop,
                            placeholder = painterResource(id = R.drawable.graficos)
                        )
                    }

                    Spacer(modifier = Modifier.weight(0.1f)) // borda direita
                }
            }
        }
    }
}

