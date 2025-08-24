package com.example.appedney.telas

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appedney.componentes.appBar
import com.example.appedney.componentes.body
import com.example.appedney.ui.theme.Preto
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

@Composable
fun AdicionarEnsaios(
    navController: NavController,
    pacote: String?,
    cliente: String?,
    prazo: String?,
    modifier: Modifier = Modifier
) {
    Surface {
        Column(modifier = modifier) {
            appBar("Adicionar Ensaios")
            body(
                navController = navController,
                Preenchimento = { BodyAdicionarEnsaios(navController, pacote, cliente, prazo) })
        }
    }
}

@Composable
fun BodyAdicionarEnsaios(
    navController: NavController,
    pacote: String?,
    cliente: String?,
    prazo: String?,
) {
    val listaDeEnsaios = MutableStateFlow<List<Ensaio>>(emptyList())
    var furo by rememberSaveable() { mutableStateOf("") }
    var amostra by rememberSaveable() { mutableStateOf("") }
    var descricao by rememberSaveable() { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Text(
                "$pacote",
                color = Preto,
                fontSize = 24.sp,
            )
            Spacer(Modifier.weight(0.05f))
            Text(
                "$cliente", color = Preto,
                fontSize = 24.sp,
            )
            Spacer(Modifier.weight(0.05f))
            Text(
                "$prazo dias", color = Preto,
                fontSize = 24.sp,
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = furo,
                onValueChange = { furo = it },
                label = { Text("furo") },
                placeholder = { Text("furo") },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color(0xFF000000),
                    unfocusedIndicatorColor = Color.Gray,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray,
                    cursorColor = Color(0xFF000000)
                ),
            )
            Spacer(Modifier.weight(0.05f))
            OutlinedTextField(
                value = amostra,
                onValueChange = { amostra = it },
                label = { Text("amostra") },
                placeholder = { Text("amostra") },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color(0xFF000000),
                    unfocusedIndicatorColor = Color.Gray,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray,
                    cursorColor = Color(0xFF000000)
                ),
            )
            Spacer(Modifier.weight(0.05f))
            OutlinedTextField(
                value = descricao,
                onValueChange = { descricao = it },
                label = { Text("descrição") },
                placeholder = { Text("descrição") },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color(0xFF000000),
                    unfocusedIndicatorColor = Color.Gray,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray,
                    cursorColor = Color(0xFF000000)
                ),
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 16.dp, bottom = 150.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End
            ) {
                FloatingActionButton(
                    onClick = {
                        listaDeEnsaios.update {
                            listaDeEnsaios.value + Ensaio(
                                furo,
                                amostra,
                                descricao
                            )
                        }
                    },
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Adicionar",
                        modifier = Modifier.size(86.dp)
                    )
                }
            }
        }
    }
}

class Ensaio(
    furo: String,
    amostra: String,
    descricao: String?
)