package com.crimsoftltd.tilsitcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.crimsoftltd.tilsitcompose.domain.Model
import com.crimsoftltd.tilsitcompose.ui.theme.TilsitComposeTheme
import com.crimsoftltd.tilsitcompose.ui.theme.TitleViewModel

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TilsitComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(ataComp = List<Model>())
                }
            }
        }
    }
}

@Composable
fun Greeting(dataComp: List<Model> ){

    LazyColumn {
        item (dataComp) {
            Text(
                text = "$dataComp",
                color = Color.White
            )
        }

        // Add 5 items
        items(count = 5) { index ->
            Text(text = "Item: $index",color = Color.Green)
        }

        // Add another single item
        item {
            Text(text = "Last item : 566",color = Color.Blue)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TilsitComposeTheme {

    }
}