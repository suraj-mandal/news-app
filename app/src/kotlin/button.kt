import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun YourScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        val destinationId = R.id.signin

    )

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "start") {
        composable("start") { StartScreen(navController) }
        composable("signin") { SignInScreen() }
        // Add more destinations as needed
    }

    {

        Button(
            onClick = { navController.navigate("signin") },
            modifier = Modifier.padding(top = 56.dp)
        ) {
            Text(
                text = "Continue",
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null
            )
        }

