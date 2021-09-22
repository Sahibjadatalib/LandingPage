package com.stalib.assignmentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.stalib.assignmentapp.components.DefaultSnackbar
import com.stalib.assignmentapp.components.MyTopAppBar
import com.stalib.assignmentapp.ui.theme.AssignmentAppTheme
import com.stalib.assignmentapp.ui.theme.BlueGrey900

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentAppTheme {
                AssignmentApp()
            }

        }
    }
}

@Composable
fun AssignmentApp() {

    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val systemUiController = rememberSystemUiController()

    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = { scaffoldState.snackbarHostState }
    ) {

        SideEffect {
            systemUiController.setSystemBarsColor(
                color = BlueGrey900
            )
        }

        Box(modifier = Modifier.fillMaxSize()) {

            AppNavGraph(
                navController = navController,
                scaffoldState = scaffoldState
            )

            DefaultSnackbar(
                snackbarHostState = scaffoldState.snackbarHostState,
                onDismiss = { scaffoldState.snackbarHostState.currentSnackbarData?.dismiss() },
                modifier = Modifier.align(Alignment.BottomCenter)
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AssignmentAppTheme {

    }
}