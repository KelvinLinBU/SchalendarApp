package com.example.schalendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun ToDoScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color(0xfffc5959))
    ) {
        Button(
            onClick = { },
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 31.dp)
                .requiredWidth(width = 86.dp)
                .requiredHeight(height = 30.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 86.dp)
                    .requiredHeight(height = 30.dp)
            ) {
                Text(
                    text = "Menu",
                    color = Color.Black,
                    lineHeight = 7.69.em,
                    style = TextStyle(
                        fontSize = 13.sp))
            }
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-13).dp,
                    y = 69.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 54.dp)){ }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 108.dp)
                .requiredWidth(width = 321.dp)
                .requiredHeight(height = 384.dp)
                .background(color = Color.White))
        Text(
            text = "This is a scrollable fragment with today’s schedule in it so the user can scroll and see what is on the agenda for the day",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 13.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 89.dp,
                    y = 288.dp)
                .requiredWidth(width = 182.dp)
                .requiredHeight(height = 64.dp))
        Button(
            onClick = { },
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 254.dp,
                    y = 69.dp)
                .requiredWidth(width = 86.dp)
                .requiredHeight(height = 30.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 86.dp)
                    .requiredHeight(height = 30.dp)
            ) {
                Text(
                    text = "Add Task",
                    color = Color.Black,
                    lineHeight = 7.69.em,
                    style = TextStyle(
                        fontSize = 13.sp))
            }
        }
        Text(
            text = "(menu button creates a drop down menu)",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 13.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 7.dp,
                    y = 7.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 54.dp))
        Text(
            text = "To-do List",
            color = Color.White,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 79.dp,
                    y = 30.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 30.dp))
        Text(
            text = "Weather Recommendation",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 35.dp,
                    y = 500.dp)
                .requiredWidth(width = 290.dp)
                .requiredHeight(height = 54.dp))
        Text(
            text = "Its a brisk 40 degrees celsuis and There is a 40% chance of snow..\nWe recommend bundling up for a cold day and wearing the proper snow gear.",
            color = Color.White,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 527.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 79.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 527.dp)
                .requiredWidth(width = 85.dp)
                .requiredHeight(height = 86.dp)
                .background(color = Color.White))
        Text(
            text = "Snow \ncIipart",
            color = Color.Black,
            lineHeight = 7.69.em,
            style = TextStyle(
                fontSize = 13.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 277.dp,
                    y = 555.dp))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun ToDoPreview() {
    ToDoScreen()
}