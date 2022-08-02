package com.example.challanges8

import ChallengeChapter8Theme
import SetupNavGraph
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeChapter8Theme(darkTheme = false) {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}