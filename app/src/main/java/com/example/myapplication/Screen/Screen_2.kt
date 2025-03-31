package com.example.myapplication.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.myapplication.R


@Composable
fun TitleScreen2() {
    Text(
        "LazyColumn",
        color = Color(0xFF2196F3),
        textAlign = TextAlign.Center,
        fontSize = 24.sp
    )

}

@Composable
fun BackScreen2(navController: NavController) {
    Image(
        painter = painterResource(R.drawable.backbutton),
        contentDescription = "Back Button",
        modifier = Modifier.clickable { navController.navigate("screen1") }.size(width = 40.dp, height = 40.dp),
    )
}

@Composable
fun ContentScreen2(i: Int,navController: NavController) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(93.dp)
            .padding(14.dp)
            .clickable { navController.navigate("screen3") },
        shape = RoundedCornerShape(8.dp)

    ) {
        Row(
            Modifier
                .fillMaxSize().background(Color(0xFF2196F3)),
            horizontalArrangement  = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
        Text("$i | The only way to do great work is to love what you do.",
            textAlign = TextAlign.Start,
            modifier = Modifier.width(274.dp).padding(end = 16.dp))
        Image(
            painter = painterResource(R.drawable.moveon),
            contentDescription = "Move on",
            modifier = Modifier.size(width = 37.76819610595703.dp, height = 37.76819610595703.dp)
        )
        }
    }
}

@Composable
fun ContentFrame(i: Int,navController: NavController) {
    LazyColumn (horizontalAlignment = Alignment.CenterHorizontally){
        items(List(i) { it }) { index ->
            ContentScreen2(index+1, navController = navController)
        }
    }
}

@Composable
fun MainScreen2(navController: NavController) {
    Column {
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

        ) {
            BackScreen2(navController)
            Spacer(modifier = Modifier.weight(1f))
            TitleScreen2()
            Spacer(modifier = Modifier.weight(1f))
        }
        ContentFrame(1000000,navController)
    }
}
