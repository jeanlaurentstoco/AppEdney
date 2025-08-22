package com.example.appedney.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appedney.componentes.appBar
import com.example.appedney.componentes.body


@Composable
fun TelaInicio(navController: NavController, modifier: Modifier = Modifier) {
    Surface {
        Column {
            appBar("Início")
            body(navController)
        }
    }
}


