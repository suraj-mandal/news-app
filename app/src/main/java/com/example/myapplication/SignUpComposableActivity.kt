package com.example.myapplication

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class SignUpComposableActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                SignupComposable()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun SignupComposable() {
    return Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier
                        .size(160.dp)
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
                fontSize = 28.sp,
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                )
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
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
                MyUI("Please enter your email address")
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
                MyUI("Please enter your password")
            }
        }
    }
}

@Composable
private fun MyUI(placeholder: String = "Enter Your Name") {
    var value by remember {
        mutableStateOf("")
    }

    BasicTextField(
        value = value,
        onValueChange = { newText ->
            value = newText
        },
        textStyle = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = Color.DarkGray
        ),
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier
                    .padding(start = 15.dp, end = 25.dp) // margin left and right
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color(0x37373733),
                        shape = RoundedCornerShape(50)
                    )
                    .padding(horizontal = 20.dp, vertical = 12.dp), // inner padding
            ) {
                if (value.isEmpty()) {
                    Text(
                        text = placeholder,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0x37373733),
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        ),
                    )
                }
                innerTextField()
            }
        }
    )
}