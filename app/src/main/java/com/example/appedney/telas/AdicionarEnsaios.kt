package com.example.appedney.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appedney.componentes.appBar
import com.example.appedney.componentes.body

@Composable
fun AdicionarEnsaios(
    navController: NavController,
    pacote: String?,
    furo: String?,
    amostra: String?,
    modifier: Modifier = Modifier
) {
    Surface {
        Column(modifier = modifier) {
            appBar("Adicionar Ensaios")
            body(Preenchimento = { Teste(navController, pacote, furo, amostra) })
        }
    }
}

@Composable
fun Teste(
    navController: NavController,
    pacote: String?,
    furo: String?,
    amostra: String?,
) {
    Column {
        Text("$pacote, $furo, $amostra")
    }
}