package com.example.shoppinglist

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.shoppinglist.screens.HomeScreen
import com.example.shoppinglist.screens.ProfileScreen
import com.example.shoppinglist.screens.SettingScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingScreen() }
    }
}