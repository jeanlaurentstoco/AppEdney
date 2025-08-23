package com.example.appedney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appedney.ui.theme.AppEdneyTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appedney.telas.CriarPacote
import com.example.appedney.telas.DadosEvolucao
import com.example.appedney.telas.TelaInicio



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppEdneyTheme {
                AppNavHost()
            }
        }
    }
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "TelaInicio"
    ) {
        composable("TelaInicio") { TelaInicio(navController) }
        composable("Dados e Evolução") { DadosEvolucao(navController) }
        composable("Criar Pacote") { CriarPacote(navController) }
    }
}




