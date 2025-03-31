package com.example.myapplication.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.R

@Composable
fun BackScreen3(navController: NavController) {
    Image(
        painter = painterResource(R.drawable.backbutton),
        contentDescription = "Back Button",
        modifier = Modifier.clickable { navController.navigate("screen2") }.size(width = 40.dp, height = 40.dp),
    )
}
@Composable
fun BackToRoot(navController: NavController){
    Button(onClick = {navController.navigate("screen1")},
        modifier = Modifier.padding(top = 83.dp).width(296.dp).height(52.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFF2196F3))){
        Text("BACK TO ROOT")
    }
}
@Composable
fun TitleScreen3() {
    Text(
        "Detail",
        color = Color(0xFF2196F3),
        textAlign = TextAlign.Center,
        fontSize = 24.sp
    )
}
@Composable
fun ContentScreen3(content: String) {
    Text(content, textAlign = TextAlign.Center,
        modifier = Modifier.width(336.dp).height(48.dp).padding(start =20.dp, end = 20.dp))
    Image(
        painter = painterResource(R.drawable.contentscreen3),
        contentDescription = "Content",
        modifier = Modifier.
        width(296.dp).
        height(444.dp)

    )
}
@Composable
fun MainScreen3(navController: NavController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

            ) {
            BackScreen3(navController)
            Spacer(modifier = Modifier.weight(1f))
            TitleScreen3()
            Spacer(modifier = Modifier.weight(1f))
        }
        val content="The only way to do great work is to love what you do"
        ContentScreen3(content)
        BackToRoot(navController)
    }

}
