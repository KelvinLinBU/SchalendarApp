package com.example.schalendar// MainScreen.kt

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 851.dp)
            .background(color = Color(0xfffc5959))
    ) {
        Text(
            text = "(Login Text Box)",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 56.dp,
                    y = 210.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 54.dp))
        Text(
            text = "Password text field",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 56.dp,
                    y = 275.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 54.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 81.dp,
                    y = 350.dp)
                .requiredWidth(width = 198.dp)
                .requiredHeight(height = 61.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .background(color = Color.White)
                .padding(horizontal = 32.dp,
                    vertical = 16.dp)
        ) {
            Text(
                text = "Sign Up!",
                color = Color.Black,
                lineHeight = 5.em,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 243.dp,
                    y = 526.dp)
                .requiredWidth(width = 181.dp)
                .requiredHeight(height = 159.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 304.dp,
                    y = (-36).dp)
                .requiredWidth(width = 78.dp)
                .requiredHeight(height = 73.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-48).dp,
                    y = (-36).dp)
                .requiredWidth(width = 129.dp)
                .requiredHeight(height = 97.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-75).dp,
                    y = 442.dp)
                .requiredWidth(width = 181.dp)
                .requiredHeight(height = 159.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 240.dp,
                    y = 37.dp)
                .requiredWidth(width = 92.dp)
                .requiredHeight(height = 91.dp)
                .rotate(degrees = 50f)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 76.dp,
                    y = 558.dp)
                .requiredWidth(width = 98.dp)
                .requiredHeight(height = 100.dp)
                .rotate(degrees = 20f)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-10).dp,
                    y = 76.dp)
                .requiredWidth(width = 92.dp)
                .requiredHeight(height = 104.dp)
                .rotate(degrees = 150f)
                .background(color = Color.White))
    }
}

@Preview(widthDp = 393, heightDp = 851)
@Composable
private fun SignUpPreview() {
    SignUpScreen()
}