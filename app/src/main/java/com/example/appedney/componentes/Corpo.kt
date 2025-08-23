package com.example.appedney.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.appedney.ui.theme.Fundo


@Composable
fun body(Preenchimento: @Composable () -> Unit, modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Column(modifier = modifier.fillMaxSize()) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(color = Fundo)
                    .fillMaxWidth(),
            ) {
                Preenchimento()
                NavegacaoInferior(modifier = Modifier.align(Alignment.BottomCenter))
            }
        }
    }
}