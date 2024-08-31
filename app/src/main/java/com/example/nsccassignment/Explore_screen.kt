package com.example.nsccassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           }
    }
}


@Preview(showBackground = true)
@Composable
fun mean() {
    val search = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF001529))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(color = Color(0xFF001f3d))
        ) {
            Column {
                Row(
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ez_person_image),
                        contentDescription = "Random Image",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .clip(shape = CircleShape)
                            .padding(horizontal = 5.dp)
                            .align(Alignment.Top)
                            .shadow(
                                elevation = 1.dp,
                                shape = CircleShape,
                                clip = true
                            )

                    )
                    Text(
                        text = "Explore",
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(horizontal = 100.dp)
                            .align(Alignment.Top)
                    )
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Heart Icon",
                        tint = Color.White,
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_shopping_bag_24),
                        contentDescription = "Shopping bag",
                        tint = Color.White,
                        modifier = Modifier
                            .size(20.dp)
                    )

                }
                Row {


                    OutlinedTextField(
                        value = search.value,
                        onValueChange = { search.value = it },
                        placeholder = {
                            Text(
                                text = "  Ghaziabad...",
                                color = Color.Gray
                            )
                        },
                        leadingIcon = { Icons.Filled.Lock },

                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .width(290.dp)
                            .height(50.dp)
                            .padding(horizontal = 20.dp)
                            .background(Color.White)
                            .border(
                                width = 3.dp,
                                color = Color(0xFF20a7db),
                                shape = RoundedCornerShape(8.dp)
                            )
                    )
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 10.dp, vertical = 10.dp)
                            .background(Color(0xFF20a7db))
                            .height(30.dp)
                    ) {
                        Row {
                            Text(
                                text = "Filter",
                                fontSize = 15.sp,
                                color = Color.White
                            )
                            androidx.compose.material3.Icon(
                                painter = painterResource(id = R.drawable.baseline_sort_24),
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.size(30.dp))

        Box(
            modifier = Modifier
                .width(335.dp)
                .height(300.dp)
                .clip(RoundedCornerShape(14.5.dp))
                .background(Color(0xFF00004d))
                .align(Alignment.CenterHorizontally)
                .border(width = 3.dp, color = Color(0xFF20a7bd), shape = RoundedCornerShape(14.dp))

        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.ez_details_image),
                    contentDescription = "An Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp))
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    Text(
                        text = "ABC PG",
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 30.dp)
                    )
                    Text(
                        text = "9000",
                        color = Color(0xFF20a7bd),
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 70.dp)
                    )
                }
                Row {
                    Text(
                        text = "PG",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(horizontal = 40.dp)
                    )
                    Text(
                        text = "/Per Month",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(horizontal = 70.dp)
                    )
                }
                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "",
                        tint = Color(0xFF20a7bd),
                        modifier = Modifier.size(30.dp)
                            .padding(start = 10.dp)
                    )
                    Text(
                        text = "0.2 km to College",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(horizontal = 15.dp)
                    )
                    Text(
                        text = "Boys",
                        fontSize = 16.sp,
                        color = Color(0xFF20a7bd),
                        modifier = Modifier.padding(horizontal = 40.dp)
                    )
                }
            }


        }
        Spacer(modifier = Modifier.size(30.dp))

        Box(
            modifier = Modifier
                .width(335.dp)
                .height(300.dp)
                .clip(RoundedCornerShape(14.5.dp))
                .background(Color(0xFF00004d))
                .align(Alignment.CenterHorizontally)
                .border(width = 3.dp, color = Color(0xFF20a7bd), shape = RoundedCornerShape(14.dp))

        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.ez_details_image),
                    contentDescription = "An Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)

                )
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    Text(
                        text = "XYZ PG",
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 30.dp)
                    )
                    Text(
                        text = "7500",
                        color = Color(0xFF20a7bd),
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 70.dp)
                    )
                }
                Row {
                    Text(
                        text = "PG",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(horizontal = 40.dp)
                    )
                    Text(
                        text = "/Per Month",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(horizontal = 70.dp)
                    )
                }
                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "",
                        tint = Color(0xFF20a7bd),
                        modifier = Modifier.size(30.dp)
                            .padding(start = 10.dp)
                    )
                    Text(
                        text = "0.3 km to College",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(horizontal = 15.dp)
                    )
                    Text(
                        text = "Boys",
                        fontSize = 16.sp,
                        color = Color(0xFF20a7bd),
                        modifier = Modifier.padding(horizontal = 40.dp)
                    )
                }
            }


        }
    }
}
