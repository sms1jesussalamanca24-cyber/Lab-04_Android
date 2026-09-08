package com.example.lab04

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFd2e8d4)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Jesus Salamanca", fontSize = 40.sp, fontWeight = FontWeight.Light)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Android Developer Extraordinaire", fontSize = 16.sp,
                color = Color(0xFF006d3b), fontWeight = FontWeight.Bold)
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 48.dp, start = 48.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            HorizontalDivider(color = Color.Gray, thickness = 1.dp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.Phone, contentDescription = "Teléfono", tint = Color(0xFF006d3b))
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "+51 957 998 917", fontSize = 16.sp)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.Share, contentDescription = "Redes", tint = Color(0xFF006d3b))
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "@JesusDev", fontSize = 16.sp)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email",
                    tint = Color(0xFF6200EE)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "sms1jesussalamanca24@gmail.com",
                    fontSize = 18.sp,
                    color = Color(0xFF6200EE),
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}