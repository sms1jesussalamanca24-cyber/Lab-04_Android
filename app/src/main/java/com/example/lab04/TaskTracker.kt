package com.example.lab04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskTracker(modifier: Modifier = Modifier) {
    var taskName by rememberSaveable { mutableStateOf("") }
    var completedCount by rememberSaveable { mutableStateOf(0) }
    var pendingCount by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tareas completadas: $completedCount", fontSize = 20.sp)
        Text(text = "Tareas pendientes: $pendingCount", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(12.dp))
        TextField(value = taskName, onValueChange = { taskName = it }, label = { Text("Nombre de tarea") })
        Spacer(modifier = Modifier.height(12.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { if (taskName.isNotBlank()) { completedCount++; taskName = "" } }) { Text("✔ Completada") }
            Button(onClick = { if (taskName.isNotBlank()) { pendingCount++; taskName = "" } }) { Text("⏳ Pendiente") }
        }
    }
}