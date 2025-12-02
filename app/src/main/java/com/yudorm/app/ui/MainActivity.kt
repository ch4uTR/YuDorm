package com.yudorm.app.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.yudorm.app.ui.screens.LoginScreen
import com.yudorm.app.ui.theme.YUDormTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yudorm.app.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YUDormTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "login"){


                    composable("login"){
                        LoginScreen(
                            onLoginSuccess =  { studentNo -> navController.navigate("home/$studentNo") },
                            onPasswordResetButton = { navController.navigate("login")},
                            onAuthorityLoginButton = {navController.navigate("login")                 },
                            )
                    }

                    composable("home/{studentNo}") { backStackEntry ->
                        val studentNoRetrieved = backStackEntry.arguments?.getString("studentNo")
                        HomeScreen(studentNo =  studentNoRetrieved ?: "")
                    }

                }
            }
        }
    }
}
