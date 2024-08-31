package com.example.nsccassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.simulateHotReload
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nsccassignment.ui.theme.NSCCAssignmentTheme

class Details_screen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         }
    }
}


@Preview(showBackground = true)
@Composable
fun detail() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF001529))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(color = Color(0xFF001f3d))
        ) {
            Row(
                modifier = Modifier.padding(vertical = 10.dp)
            ) {

                Icon(
                    imageVector = Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier.size(45.dp)
                )
                Text(
                    text = "Details",
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
        }
        Spacer(modifier = Modifier.size(45.dp))
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ez_details_image),
                contentDescription = "An Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)

            )
        }
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(14.5.dp))
                .background(Color(0xFF000035))
                .align(Alignment.CenterHorizontally)
                .border(width = 4.dp, color = Color(0xFF20a7bd))
        ) {
            Column() {
                Row {
                    Text(
                        text = "Muskan PG",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 25.dp)
                    )

                    Text(
                        text = "5000",
                        color = Color(0xFF20a7bd),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                }
                Text(
                    text = "0.2 km to college",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(horizontal = 30.dp)
                )
                Row {
                    Text(
                        text = "Room available :",
                        color = Color(0xFF20a7bd),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                    Text(
                        text = "34/100",
                        fontSize = 18.sp,
                        color = Color.White
                    )

                }
            }
        }
        Text(
            text = "Address",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 35.dp)
                .padding(top = 15.dp)
        )
        Text(
            text = "23 ,B-4,sector 5,Muradnagar",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 35.dp)
        )

        Spacer(modifier = Modifier.size(25.dp))

        Text(
            text = "Facilities",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 35.dp)
        )

        Spacer(modifier = Modifier.size(10.dp))
        Row {
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 20.dp)
                    .background(Color(0xFF20a7bd))
                    .clip(RoundedCornerShape(14.5.dp))
            ) {
                Text(
                    text = "AC",
                    color = Color.White
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 30.dp)
                    .background(Color(0xFF20a7bd))
                    .clip(RoundedCornerShape(14.5.dp))
            ) {
                Text(
                    text = "Cooler",
                    color = Color.White
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 30.dp)
                    .background(Color(0xFF20a7bd))
                    .clip(RoundedCornerShape(14.5.dp))
            ) {
                Text(
                    text = "Wifi",
                    color = Color.White
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 30.dp)
                    .background(Color(0xFF20a7bd))
                    .clip(RoundedCornerShape(14.5.dp))
            ) {
                Text(
                    text = "Mattress",
                    color = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "About",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 35.dp)
        )
        Text(
            text = "Nestled in the city of sunshine, Hyatt Regency Harare The Meikles offers iconic architecture, charm,luxury,and easy access to major attractions.",
            fontSize = 15.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 15.dp)
                .padding(end = 15.dp)
        )
        Spacer(modifier = Modifier.size(20.dp))
        Row {
            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .width(180.dp)
                    .height(45.dp)
                    .padding(start = 35.dp)
                    .border(
                        width = 3.dp,
                        color = Color(0xFF20a7bd),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Row(horizontalArrangement = Arrangement.Start) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart, contentDescription = "",
                        tint = Color(0xFF20a7bd)
                    )
                    Text(
                        text = "Reserve",
                        fontSize = 20.sp,
                        color = Color(0xFF20a7bd)
                    )
                }
            }
            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .width(180.dp)
                    .height(45.dp)
                    .padding(start = 35.dp)
                    .border(
                        width = 3.dp,
                        color = Color(0xFF20a7bd),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Row(horizontalArrangement = Arrangement.Start) {
                    Icon(
                        imageVector = Icons.Filled.Favorite, contentDescription = "",
                        tint = Color(0xFF20a7bd)
                    )
                    Text(
                        text = "Like it !",
                        fontSize = 20.sp,
                        color = Color(0xFF20a7bd)
                    )
                }


            }
        }
    }
}