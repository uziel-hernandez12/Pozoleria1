package com.example.pozoleria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pozoleria.ui.theme.PozoleriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PozoleriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPresentacion("Android")
                }
            }
        }
    }
}

@Composable
fun GreetingPresentacion(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){

        //imagen
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Column (  verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Image(
                    painter = painterResource(R.drawable.cacahuazintle),
                    contentDescription = "Imagen de la pozoleria",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                )


            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp) // Agregar un margen horizontal
                .padding(bottom = 30.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 340.dp)
                    .padding(horizontal = 25.dp) // Agregar un margen horizontal
                    .padding(bottom = 15.dp), // Agregar un margen inferior
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                // Icono centrado
                Image(
                    painter = painterResource(R.drawable.baseline_place_24),
                    contentDescription = "Place",
                    modifier = Modifier.size(30.dp)
                )
                // Añadir un espacio entre el icono y el texto
                Spacer(modifier = Modifier.width(8.dp))
                // Texto centrado y en negritas
                Text(
                    text = "Suc 1: Zaragoza #213 Zona Centro, Calvillo Ags.",
                    style = TextStyle(
                        //fontWeight = FontWeight.Bold,
                        fontSize = 20.sp, // Tamaño de la fuente
                        fontFamily = FontFamily.SansSerif // Fuente
                    ),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(start = 8.dp) // Añadir un espacio entre el icono y el texto
                )

            }
            Row (
                modifier = Modifier
                    .padding(start = 40.dp)
                    .padding(horizontal = 25.dp)
                    .padding(bottom = 15.dp)
            ){
                Text(
                   text = "Suc 2: Blvd, Rodolfo Landeros #150, Calvillo, Ags",
                   style = TextStyle(
                       //fontWeight = FontWeight.Bold,
                       fontSize = 20.sp, // Tamaño de la fuente
                       fontFamily = FontFamily.SansSerif // Fuente
                   ),
                   textAlign = TextAlign.Justify,
                   modifier = Modifier.padding(start = 8.dp) // Añadir un espacio entre el icono y el texto
               )
            }
            Row (
                modifier = Modifier
                    .padding(start = 40.dp)
                    .padding(horizontal = 25.dp)
                    .padding(bottom = 15.dp)
            ){
                Text(
                    text = "Suc 3: Av. Aguascalientes Sur #436 Local 9-A, Col. España, Ags",
                    style = TextStyle(
                        //fontWeight = FontWeight.Bold,
                        fontSize = 20.sp, // Tamaño de la fuente
                        fontFamily = FontFamily.SansSerif // Fuente
                    ),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(start = 8.dp) // Añadir un espacio entre el icono y el texto
                )
            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp) // Agregar un margen horizontal
                .padding(bottom = 30.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 620.dp)
                    .padding(horizontal = 25.dp) // Agregar un margen horizontal
                    .padding(bottom = 20.dp), // Agregar un margen inferior
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            )   {
                // Icono centrado
                Image(
                    painter = painterResource(R.drawable.baseline_phone_24),
                    contentDescription = "Place",
                    modifier = Modifier.size(30.dp)
                )
                // Añadir un espacio entre el icono y el texto
                Spacer(modifier = Modifier.width(8.dp))
                // Texto centrado y en negritas
                Text(
                    text = "495 956 1635, 495 956 7228 y 449 320 6501",
                    style = TextStyle(
                        //fontWeight = FontWeight.Bold,
                        fontSize = 20.sp, // Tamaño de la fuente
                        fontFamily = FontFamily.SansSerif // Fuente
                    ),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(start = 8.dp) // Añadir un espacio entre el icono y el texto
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 750.dp)
                .padding(horizontal = 25.dp) // Agregar un margen horizontal
                .padding(bottom = 20.dp), // Agregar un margen inferior
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /* Acción para el primer botón */ },
                colors = ButtonDefaults.buttonColors(Color.Red), // Cambiar el color de fondo del botón
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 8.dp)
                    .padding(end = 4.dp )
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_phone_24),
                    contentDescription = "Place",
                    modifier = Modifier.size(24.dp)
                )
                Text("Llamar")
            }
            Button(
                onClick = { /* Acción para el segundo botón */ },

                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 8.dp)
                    .padding(end = 4.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_phone_24),
                    contentDescription = "Place",
                    modifier = Modifier.size(24.dp)
                )
                Text("WhatsApp")
            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PozoleriaTheme {
        GreetingPresentacion("Android")
    }
}