package com.example.myapplication.presentation.sign_in

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.composables.CustomInputField
import com.example.myapplication.states.SignInState

@Composable
fun SignInComposable(
    state: SignInState,
    onSignInClick: () -> Unit
) {

    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let { error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }


    return Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {
        Column() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                    ,
                    contentDescription = "Logo")
            }
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                text = "News Express",
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                )
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    color = Color.DarkGray
                ),
                text = "The best news app on the market"
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, bottom = 8.dp)
            ) {
                Spacer(modifier = Modifier

                    .height(40.dp)
                    .width(3.dp)
                    .background(Color.DarkGray))
                Text(
                    modifier = Modifier.
                    padding(horizontal = 20.dp)
                    ,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 18.67.sp,
                        color = Color.DarkGray
                    ),
                    text = "Sign In"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Email Address",
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, bottom = 4.dp),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 14.sp
                    )
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Spacer(modifier = Modifier.width(5.dp))
//                TextField(
//                    value = "",
//                    onValueChange = {},
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 20.dp, vertical = 4.dp)
//                        .border(BorderStroke(width = 1.dp, color = Color.Black))
//                        .background(Color.Transparent),
////                        .clip(RoundedCornerShape(50))
//                    shape = RoundedCornerShape(50)
//                )
                CustomInputField("Please enter your email address")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 4.dp)
            ) {
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Password",
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, bottom = 4.dp),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 14.sp
                    )
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Spacer(modifier = Modifier.width(5.dp))
                CustomInputField("Please enter your password")
            }

            // Normal sign in button

            Button(
                onClick = { /*TODO: Sign in Normally */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp, top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                ,
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color(0xFFF5F5F5)
                ),


//                colors = ButtonDefaults.buttonColors(
//                    backgroundColor = Color.Transparent
//                )
            ) {

                Text(
                    text = "Sign in",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        color = Color.DarkGray,
                        fontSize = 12.sp
                    ),
                    modifier = Modifier
                        .padding(top = 2.dp, start = 8.dp)
                )
            }

            /* --------- or --------- */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier =
                Modifier
                    .weight(1f)
                    .height(1.dp)
                    .padding(start = 25.dp)
                    .background(color = Color.LightGray)
                )
                Text(
                    text = "or",
                    modifier =  Modifier
                        .padding(horizontal = 12.dp),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        color = Color.LightGray,
                        fontSize = 10.sp
                    )
                )
                Spacer(modifier =
                Modifier
                    .weight(1f)
                    .height(1.dp)
                    .padding(end = 25.dp)
                    .background(color = Color.LightGray)
                )
            }
            // This section will be containing the google button
            Button(
                onClick = onSignInClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp, vertical = 12.dp)
                    .align(Alignment.CenterHorizontally)
                ,
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color(0xFFF5F5F5)
                ),


//                colors = ButtonDefaults.buttonColors(
//                    backgroundColor = Color.Transparent
//                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_icon),
                    contentDescription = "Google Icon",
                    modifier = Modifier
                        .size(18.dp)
                )
                Text(
                    text = "Sign in with ",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        color = Color.DarkGray,
                        fontSize = 12.sp
                    ),
                    modifier = Modifier
                        .padding(top = 2.dp, start = 8.dp)
                )
                Text(
                    text = "Google",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        color = Color.DarkGray,
                        fontSize = 12.sp
                    ),
                    modifier = Modifier
                        .padding(top = 2.dp)
                )
            }
        }
    }
}