package com.example.appedney.telas

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appedney.componentes.appBar
import com.example.appedney.componentes.body
import com.example.appedney.ui.theme.Fundobt5
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
            Column(Modifier.fillMaxSize()) {
                val ensaios by listaDeEnsaios.collectAsState() // observa o flow

                LazyColumn(modifier = Modifier) {
                    items(ensaios.size) { index ->
                        val ensaio = ensaios[index]
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Fundobt5
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(horizontal = 20.dp)
                                    .padding(vertical = 20.dp)
                            ) {
                                Text(text = "Furo: ${ensaio.furo}",
                                    fontSize = 16.sp,
                                    color = Color.White
                                )
                                Spacer(Modifier.width(15.dp))
                                Text(text = "Amostra: ${ensaio.amostra}",
                                    fontSize = 16.sp,
                                    color = Color.White
                                )
                                Spacer(Modifier.width(15.dp))
                                Text(
                                    text = "Descrição: ${ensaio.descricao ?: "Sem descrição"}",
                                    fontSize = 16.sp,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
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
                            furo = ""
                            amostra = ""
                            descricao = ""
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
}

@Composable
fun ItemEnsaio(
    listaDeEnsaios: MutableStateFlow<List<Ensaio>>,
    modifier: Modifier = Modifier
) {
    val ensaios by listaDeEnsaios.collectAsState() // observa o flow

    LazyColumn(modifier = modifier) {
        items(ensaios.size) { index ->
            val ensaio = ensaios[index]
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Fundobt5
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(vertical = 20.dp)
                ) {
                    Text(text = "Furo: ${ensaio.furo}",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Spacer(modifier.width(15.dp))
                    Text(text = "Amostra: ${ensaio.amostra}",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Spacer(modifier.width(15.dp))
                    Text(
                        text = "Descrição: ${ensaio.descricao ?: "Sem descrição"}",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

class Ensaio(
    val furo: String,
    val amostra: String,
    val descricao: String?
)

@Preview(showBackground = true)
@Composable
private fun ItemEnsaioPreview() {
    // cria lista mockada
    val mockEnsaios = listOf(
        Ensaio("123", "AWE", "Descrição teste A"),
        Ensaio("321", "ACF", "Descrição teste B"),
        Ensaio("456", "RCB", null) // sem descrição
    )

    // transforma em StateFlow só pro preview
    val flow = remember { MutableStateFlow(mockEnsaios) }

    ItemEnsaio(listaDeEnsaios = flow)
}
