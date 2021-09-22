package com.stalib.assignmentapp

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

sealed class Screen(val route: String) {
    object welcomeScreen : Screen("welcome")
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    scaffoldState: ScaffoldState
    ) {

    val coroutineScope = rememberCoroutineScope()
    val actions = remember(navController){ MainActions(navController,scaffoldState,coroutineScope) }

    NavHost(
        navController = navController,
        startDestination = Screen.welcomeScreen.route
    ){
        addWelcomeScreen(actions = actions)
    }

}

private fun NavGraphBuilder.addWelcomeScreen(
    actions: MainActions
) {

    composable(
        route = Screen.welcomeScreen.route
    ){
        WelcomeScreen(actions )
    }
}

class MainActions(
    navController: NavController,
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope
){

    val showSnackBar: (String, String) -> Unit = { message, action ->
        coroutineScope.launch {
            scaffoldState.snackbarHostState.showSnackbar(message, action)
        }
    }
}