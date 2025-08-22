package com.example.appedney.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appedney.ui.theme.AppEdneyTheme
import com.example.appedney.ui.theme.Cor1
import com.example.appedney.ui.theme.Cor2
import com.example.appedney.ui.theme.CorText

@Composable
fun appBar(texto: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Column(
            modifier = modifier
                .height(100.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = modifier
                    .height(100.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Cor1,
                                Cor2
                            )
                        )
                    )
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(
                    texto,
                    modifier = modifier.offset(y = (-25).dp),
                    color = CorText,
                    fontWeight = FontWeight.Normal,
                    fontSize = 48.sp,
                )
            }
        }
    }
}

@Preview
@Composable
fun appBarPreview(modifier: Modifier = Modifier) {
    AppEdneyTheme {
        appBar("Início")
    }
}