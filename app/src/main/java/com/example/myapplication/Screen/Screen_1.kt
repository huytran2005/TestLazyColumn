package com.example.myapplication.Screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.R

@Composable
fun MainScreen1(navController: NavController, content1: String, content2: String){
        Column (
            verticalArrangement= Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Logo()
            Content(navController,content1,content2)

        }
}

@Composable
fun Logo() {
    Image(
        painterResource(id = R.drawable.logojetpackcompose),
        contentDescription = "Logo",
        Modifier.padding(top = 159.dp, end = 80.dp, start = 80.dp),
    )
}

@Composable
fun Content(navController: NavController, content1: String, content2: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 16.dp)

    ) {
        Text(content1, textAlign = TextAlign.Center)
        Text(content2, textAlign = TextAlign.Center)
        ChangeFrame2(navController)
    }

}

@Composable
fun ChangeFrame2(navController: NavController) {
    Button(
        onClick = { navController.navigate("screen2") },
        modifier = Modifier
            .padding(top = 115.dp)
            .fillMaxWidth()
            .height(52.2.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFF2196F3))
    )

    {
        Text(text = "PUSH", color = Color.White)
    }
}
