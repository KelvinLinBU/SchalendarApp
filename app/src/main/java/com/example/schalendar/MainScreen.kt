
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
fun MainScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 393.dp)
            .requiredHeight(height = 851.dp)
            .background(color = Color(0xfffc5959))
    ) {
        Text(
            text = "\n Schalendar",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 34.dp,
                    y = 174.dp)
                .requiredWidth(width = 292.dp)
                .requiredHeight(height = 175.dp))
        Button(
            onClick = { },
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 16.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 81.dp,
                    y = 349.dp)
                .requiredWidth(width = 198.dp)
                .requiredHeight(height = 61.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 198.dp)
                    .requiredHeight(height = 61.dp)
            ) {
                Text(
                    text = "Lets Go!",
                    color = Color.Black,
                    lineHeight = 5.em,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-65).dp,
                    y = (-34).dp)
                .requiredWidth(width = 130.dp)
                .requiredHeight(height = 98.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 283.dp,
                    y = (-25).dp)
                .requiredWidth(width = 155.dp)
                .requiredHeight(height = 139.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-41).dp,
                    y = 484.dp)
                .requiredSize(size = 245.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 15.dp)
                .requiredWidth(width = 92.dp)
                .requiredHeight(height = 104.dp)
                .rotate(degrees = 70f)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 274.9757080078125.dp,
                    y = 517.dp)
                .requiredWidth(width = 164.dp)
                .requiredHeight(height = 56.dp)
                .rotate(degrees = -70f)
                .background(color = Color.White))
        Text(
            text = "The Productivity App",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 55.dp,
                    y = 261.dp)
                .requiredWidth(width = 250.dp)
                .requiredHeight(height = 149.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 231.dp,
                    y = 33.dp)
                .requiredWidth(width = 35.dp)
                .requiredHeight(height = 33.dp)
                .rotate(degrees = 20f)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 301.dp,
                    y = 389.dp)
                .requiredSize(size = 43.dp)
                .rotate(degrees = 50f)
                .background(color = Color.White))
    }
}

@Preview(widthDp = 393, heightDp = 851)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}

