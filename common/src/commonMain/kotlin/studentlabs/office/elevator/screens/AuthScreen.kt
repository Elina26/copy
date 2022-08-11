package studentlabs.office.elevator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studentlabs.office.elevator.ui.theme.Purple500
//import org.jetbrains.chat.R
import ru.alexgladkov.odyssey.compose.RootController

@Composable
fun AuthScreen(rootController: RootController) {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Purple500)
                .size(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Office Elevator",
                color = Color.White,
                fontSize = 25.sp,
                textAlign = TextAlign.Left)
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .size(70.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "Email:", color = Color.DarkGray) }
            )
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .size(70.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "Password:", color = Color.DarkGray) }
            )
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {}) {
                Text(text = "Authorization", color = Color.White, fontSize = 25.sp)
            }
        }
    }
}