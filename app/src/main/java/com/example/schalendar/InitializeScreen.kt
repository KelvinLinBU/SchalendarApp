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
fun InitializeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 851.dp)
            .background(color = Color(0xfffc5959))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 83.dp)
                .requiredWidth(width = 283.dp)
                .requiredHeight(height = 251.dp)
                .background(color = Color.White))
        Button(
            onClick = { },
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 28.dp,
                    y = 32.dp)
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
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 74.dp,
                    y = 393.dp)
                .requiredWidth(width = 212.dp)
                .requiredHeight(height = 52.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 212.dp)
                    .requiredHeight(height = 52.dp)
            ) {
                Text(
                    text = "Add Photo",
                    color = Color.Black,
                    lineHeight = 7.69.em,
                    style = TextStyle(
                        fontSize = 13.sp))
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 74.dp,
                    y = 468.dp)
                .requiredWidth(width = 212.dp)
                .requiredHeight(height = 52.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .background(color = Color.White)
                .padding(horizontal = 32.dp,
                    vertical = 16.dp)
        ) {
            Text(
                text = "Initialize",
                color = Color.Black,
                lineHeight = 7.69.em,
                style = TextStyle(
                    fontSize = 13.sp))
        }
        Text(
            text = "Photo Preview",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 85.dp,
                    y = 343.dp)
                .requiredWidth(width = 190.dp)
                .requiredHeight(height = 28.dp))
        Text(
            text = "This is placeholder square for image preview maybe put in image with white border?",
            color = Color.Black,
            lineHeight = 5.em,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 108.dp,
                    y = 151.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 68.dp))
        Text(
            text = "Initialize Calendar",
            color = Color.White,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 71.dp,
                    y = 33.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 30.dp))
    }
}

@Preview(widthDp = 393, heightDp = 851)
@Composable
private fun InitializeScreenPreview() {
    InitializeScreen(Modifier)
}