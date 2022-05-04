package com.debduttapanda.buttons

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.debduttapanda.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Column(){
                            Row(){
                                Column(){
                                    Button(onClick = {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "Button clicked",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    Button(
                                        onClick = { /*TODO*/ },
                                        shape = CircleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    Button(
                                        onClick = { /*TODO*/ },
                                        shape = RectangleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    Button(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp)
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    Button(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp),
                                        border = BorderStroke(width = 2.dp, color = Color.Cyan)
                                    ) {
                                        Text("Click Me")
                                    }
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(){
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    OutlinedButton(
                                        onClick = { /*TODO*/ },
                                        shape = CircleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    OutlinedButton(
                                        onClick = { /*TODO*/ },
                                        shape = RectangleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    OutlinedButton(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp)
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    OutlinedButton(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp),
                                        border = BorderStroke(width = 2.dp, color = Color.Cyan)
                                    ) {
                                        Text("Click Me")
                                    }
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(){
                                    TextButton(onClick = { /*TODO*/ }) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    TextButton(
                                        onClick = { /*TODO*/ },
                                        shape = CircleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    TextButton(
                                        onClick = { /*TODO*/ },
                                        shape = RectangleShape
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    TextButton(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp)
                                    ) {
                                        Text("Click Me")
                                    }
                                    Spacer(Modifier.height(12.dp))
                                    TextButton(
                                        onClick = { /*TODO*/ },
                                        shape = CutCornerShape(12.dp),
                                        border = BorderStroke(width = 2.dp, color = Color.Cyan)
                                    ) {
                                        Text("Click Me")
                                    }
                                }
                            }
                            Spacer(Modifier.height(12.dp))
                            Row(){
                                Button(
                                    onClick = {  },
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.Red,
                                        backgroundColor = Color.White,
                                    ),
                                    shape = CircleShape
                                ) {
                                    Text("Yes, delete")
                                }
                                Spacer(Modifier.width(12.dp))
                                Button(
                                    onClick = {  },
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        backgroundColor = Color(0xff059400),
                                    ),
                                    shape = CircleShape
                                ) {
                                    Text("No, revert back")
                                }
                            }
                            Spacer(Modifier.height(12.dp))
                            OutlinedButton(
                                onClick = {  },
                                shape = CircleShape,
                                elevation = ButtonDefaults.elevation(
                                    defaultElevation = 6.dp,
                                    pressedElevation = 8.dp,
                                    disabledElevation = 0.dp
                                ),
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Color(0xff059400),
                                    backgroundColor = Color.White
                                )
                            ) {
                                Text("Nice button bro, really cool")
                            }
                        }
                    }
                }
            }
        }
    }
}
