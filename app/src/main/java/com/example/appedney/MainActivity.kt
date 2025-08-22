package com.example.appedney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appedney.ui.theme.AppEdneyTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.appedney.componentes.appBar
import com.example.appedney.ui.theme.Cor1
import com.example.appedney.ui.theme.Cor2
import com.example.appedney.ui.theme.fundo


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppEdneyTheme {
                Surface {
                    Column {
                        appBar("Início")
                        body()
                    }
                }
            }
        }
    }
}

@Composable
fun body(modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Column(modifier = modifier.fillMaxSize()) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(color = fundo)
                    .fillMaxWidth(),
            ) {
                NavegacaoInferior(modifier = Modifier.align(Alignment.BottomCenter))
            }
        }
    }
}

@Preview
@Composable
fun bodyPreview(modifier: Modifier = Modifier) {
    AppEdneyTheme {
        body()
    }
}

@Composable
private fun NavegacaoInferior(modifier: Modifier = Modifier) {
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
                                Cor2,
                                Cor1
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

                    AsyncImage(
                        model = R.drawable.home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(76.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        placeholder = painterResource(id = R.drawable.home)
                    )

                    Spacer(modifier = Modifier.weight(1f)) // espaçamento entre imagens

                    AsyncImage(
                        model = R.drawable.ensaios,
                        contentDescription = null,
                        modifier = Modifier
                            .size(76.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        placeholder = painterResource(id = R.drawable.ensaios)
                    )

                    Spacer(modifier = Modifier.weight(1f)) // espaçamento entre imagens

                    AsyncImage(
                        model = R.drawable.graficos,
                        contentDescription = null,
                        modifier = Modifier
                            .size(76.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        placeholder = painterResource(id = R.drawable.graficos)
                    )

                    Spacer(modifier = Modifier.weight(0.1f)) // borda direita
                }
            }
        }
    }
}

@Preview
@Composable
private fun NavegacaoInferiorPreview() {
    NavegacaoInferior()
}

@Preview
@Composable
fun appBarPreview(modifier: Modifier = Modifier) {
    AppEdneyTheme {
        appBar("Início")
    }
}
