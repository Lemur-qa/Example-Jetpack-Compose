package com.example.examplejetpackcompose

import android.os.Bundle
import androidx.compose.foundation.Image
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examplejetpackcompose.ui.theme.ExampleJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        stringResource(R.string.jetpack_compose_tutorial),
                        stringResource(R.string.jetpack_compose_is_a_modern_toolkit),
                        stringResource(R.string.annotation))
                }
            }
        }
    }
}


@Composable
fun Greeting(title: String, subtitle1: String, subtitle2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier,verticalArrangement = Arrangement.Center) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 16.dp
            )
        )
        Text(
            text = subtitle1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                 start = 16.dp,
                 end = 16.dp
            )
        )
        Text(
            text = subtitle2,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                    top = 16.dp
                )//16dp padding (start, end, bottom, and top), and Justify text align.
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExampleJetpackComposeTheme {
        Greeting(
            stringResource(R.string.jetpack_compose_tutorial),
            stringResource(R.string.jetpack_compose_is_a_modern_toolkit),
            stringResource(R.string.annotation))
    }
}