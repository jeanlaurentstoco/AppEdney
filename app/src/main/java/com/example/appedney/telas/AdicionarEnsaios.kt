package com.example.appedney.telas

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appedney.componentes.appBar
import com.example.appedney.componentes.body
import com.example.appedney.ui.theme.Preto

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
            body(
                navController = navController,
                Preenchimento = { BodyAdicionarEnsaios(navController, pacote, furo, amostra) })
        }
    }
}

@Composable
fun BodyAdicionarEnsaios(
    navController: NavController,
    pacote: String?,
    furo: String?,
    amostra: String?,
) {
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
                "$furo", color = Preto,
                fontSize = 24.sp,
            )
            Spacer(Modifier.weight(0.05f))
            Text(
                "$amostra", color = Preto,
                fontSize = 24.sp,
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 16.dp, bottom = 150.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            FloatingActionButton(
                onClick = {},
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