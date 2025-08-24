package com.example.appedney.telas

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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
import com.example.appedney.ui.theme.Fundobt5

@Composable
fun CriarPacote(navController: NavController, modifier: Modifier = Modifier) {
    Surface {
        Column {
            appBar("Criar Pacote")
            body(Preenchimento = { FormularioCriarPacote(navController) })
        }
    }
}


@Composable
fun FormularioCriarPacote(navController: NavController, modifier: Modifier = Modifier) {
    var pacote by rememberSaveable() { mutableStateOf("") }
    var furo by rememberSaveable() { mutableStateOf("") }
    var amostra by rememberSaveable() { mutableStateOf("") }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.weight(1f))
        OutlinedTextField(
            value = pacote,
            onValueChange = { pacote = it },
            label = { Text("Nome do Pacote") },
            placeholder = { Text("Nome do Pacote") },
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
            value = furo,
            onValueChange = { furo = it },
            label = { Text("Furo") },
            placeholder = { Text("Furo") },
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
            label = { Text("Amostra") },
            placeholder = { Text("Amostra") },
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
        Button(
            shape = RoundedCornerShape(24.dp),
            onClick = {
                val pacoteSafe = Uri.encode(pacote)
                val furoSafe = Uri.encode(furo)
                val amostraSafe = Uri.encode(amostra)
                navController.navigate("AdicionarEnsaios/$pacoteSafe/$furoSafe/$amostraSafe")
            },
            modifier = modifier
                .width(251.dp)
                .height(84.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Fundobt5, // Background color
                contentColor = Color.White,  // Text/content color
                //disabledContainerColor = Color.LightGray, // Disabled background
                //disabledContentColor = Color.Gray // Disabled text/content
            )
        ) {
            Text(
                "Continuar", modifier = modifier, fontSize = 24.sp
            )
        }
        Spacer(Modifier.weight(1f))
    }
}

