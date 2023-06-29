import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.navigation.Navigation



Button(
onClick = {
    private fun navigateToSignInPage() {
    val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    navController.navigate(R.id.signinFragment)
}

    val button = findViewById<Button>(R.id.your_button_id)
    button.setOnClickListener {
        navigateToSignInPage()
    }

},
modifier = Modifier
.offset(x = 94.dp, y = 596.dp)
.width(187.dp)
.height(45.dp)
.background(color = Color(0xFF4760FF), shape = RoundedCornerShape(size = 36.dp))
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Continue",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}








