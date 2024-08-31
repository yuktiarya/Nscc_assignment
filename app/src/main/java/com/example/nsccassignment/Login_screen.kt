package com.example.nsccassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.OffsetEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nsccassignment.ui.theme.NSCCAssignmentTheme

class Login_screen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun login() {
    val phonenumber = remember {
        mutableStateOf("")
    }
    val passward = remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ez_background_image),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        Column(modifier = Modifier.fillMaxSize()) {

            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                 Image(painter = painterResource(id = R.drawable.ez_logoo),
                     contentDescription = "Logo",
                     modifier = Modifier
                         .width(60.dp)
                         .height(60.dp))

                Text(
                    text = "Ez",
                    color = Color.White,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
            Spacer(modifier = Modifier.size(50.dp))


                 Box(

                     modifier = Modifier
                         .width(300.dp)
                         .height(500.dp)
                         .border(
                             width = 1.5.dp,
                             color = Color.White,
                             shape = RoundedCornerShape(8.dp)
                         )
                         .align(Alignment.CenterHorizontally)

                 )


             {
                Column {
                    Text(
                        text = "Log In",
                        color = Color(0xFF20a7bd),
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = "Phone Number",
                        fontSize = 17.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.size(4.dp))
                    OutlinedTextField(
                        value = phonenumber.value,
                        onValueChange = { phonenumber.value = it },
                        placeholder = { Text(text = "+91 00000 00000",
                            color = Color.White) },

                        leadingIcon = { Icons.Filled.Phone },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        modifier = Modifier
                            .width(290.dp)
                            .height(50.dp)
                            .align(Alignment.CenterHorizontally)

                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Text(
                        text = "Password",
                        fontSize = 17.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.size(4.dp))
                    OutlinedTextField(
                        value = passward.value,
                        onValueChange = { passward.value = it },
                        placeholder = { Text(text = "  *********",
                            color = Color.White) },
                        leadingIcon = { Icons.Filled.Lock },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .width(290.dp)
                            .height(50.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.size(20.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .width(210.dp)
                            .align(Alignment.CenterHorizontally)

                    ) {
                        Text(text = "Login")
                    }

                    Spacer(modifier = Modifier.size(20.dp))
                    Text(
                        text = "Not registered yet? Sign Up",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier
                            .clickable { }
                            .align(Alignment.CenterHorizontally))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Divider(
                            color = Color.White,
                            thickness = 1.dp,

                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "or",
                            modifier = Modifier.padding(horizontal = 8.dp),
                            color = Color.White,
                            fontSize = 15.sp
                        )
                        Divider(
                            color = Color.White,
                            thickness = 1.dp,
                            modifier = Modifier.weight(1f)
                        )
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    OutlinedButton(
                        onClick = { },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                           Image(painter = painterResource(id = R.drawable.google1),
                               contentDescription = "Google Logo",
                               modifier = Modifier
                                   .width(25.dp)
                                   .height(25.dp))
                            Text(
                                text = "Sign in with Google Account",
                                fontSize = 17.sp,
                                color = Color.White
                            )
                        } }
                }

            }
        }
    }
}








