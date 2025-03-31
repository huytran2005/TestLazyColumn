package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Screen.MainScreen1
import com.example.myapplication.Screen.MainScreen2
import com.example.myapplication.Screen.MainScreen3

import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp).background(color = Color.White)) { innerPadding ->
                    val modifier = Modifier.padding(innerPadding)
                    val content1 = "Navigation"
                    val content2 =
                        "Is a framework that simplifies the implementation of navigation between different UI components (activities, fragments, or composables) in an app"
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "screen1") {
                        composable("screen1") { MainScreen1(content1=content1, content2 = content2, navController = navController) }
                        composable("screen2") { MainScreen2(navController) }
                        composable("screen3") { MainScreen3(navController)  }
                    }
                }
            }
        }
    }
}
