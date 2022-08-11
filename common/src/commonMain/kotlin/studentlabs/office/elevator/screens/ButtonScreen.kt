package studentlabs.office.elevator.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studentlabs.office.elevator.ui.theme.Purple500
//import org.jetbrains.chat.R

@Composable
fun ButtonScreen() {
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

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Purple500,
                    contentColor = Color.White
                )) {
                /*Image(
                    modifier = Modifier
                        .size(140.dp),
                    //painter = painterResource(R.drawable.downarrow_121316__1_),
                    contentDescription = null
                )*/
                Image(
                    modifier = Modifier
                        .size(140.dp),
                    //painter = painterResource(R.drawable.downarrow_121316__1_),
                    painter = rememberVectorPainter(Icons.Outlined.KeyboardArrowUp),
                    contentDescription = null
                )
            }
        }
}


