package studentlabs.office.elevator.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studentlabs.office.elevator.ui.theme.Purple500
//import org.jetbrains.chat.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun RatingScreen() {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Purple500)
                .size(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Rating table",
                color = Color.White,
                fontSize = 25.sp,
                textAlign = TextAlign.Left)
        }

        LazyColumn {
            //PERSON 1
            item {
                Row {
                    /*Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        //painter = painterResource(R.drawable.person_1),
                        contentDescription = null
                    )*/
                    Column {
                        Text("Степан Кондратьев", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Программист", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 8;
                        val minutes: Int = 10;
                        Text("            $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }

            //PERSON 2
            item {
                Row {
                    /*Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        //painter = painterResource(R.drawable.person_2),
                        contentDescription = null
                    )*/
                    Column {
                        Text("Виктория Кузьмина", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Дизайнер", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 7;
                        val minutes: Int = 50;
                        Text("           $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 3
            item {
                Row {
                    /*Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        //painter = painterResource(R.drawable.person_3),
                        contentDescription = null
                    )*/
                    Column {
                        Text("Ева Александрова", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Руководитель проектов", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 7;
                        val minutes: Int = 20;
                        Text("             $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            /*//PERSON 4
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_4),
                        contentDescription = null
                    )
                    Column {
                        Text("Никита Поздняков", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Программист", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 6;
                        val minutes: Int = 40;
                        Text("            $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 5
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_5),
                        contentDescription = null
                    )
                    Column {
                        Text("Юрий Калашников", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Тестировщик", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 6;
                        val minutes: Int = 10;
                        Text("             $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 6
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_6),
                        contentDescription = null
                    )
                    Column {
                        Text("Анастасия Смирнова", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Аналитик", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 5;
                        val minutes: Int = 15;
                        Text("         $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 7
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_4),
                        contentDescription = null
                    )
                    Column {
                        Text("Михаил Васильев", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Программист", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 4;
                        val minutes: Int = 55;
                        Text("              $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 8
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_3),
                        contentDescription = null
                    )
                    Column {
                        Text("Марина Шевлякова", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Руководитель проектов", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 5;
                        val minutes: Int = 50;
                        Text("           $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }
            //PERSON 9
            item {
                Row {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.person_1),
                        contentDescription = null
                    )
                    Column {
                        Text("Алексей Лукин", color = Color.DarkGray, fontSize = 20.sp)
                        Text("Программист", color = Color.DarkGray, fontSize = 15.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                    Column {
                        val hours: Int = 4;
                        val minutes: Int = 10;
                        Text("                   $hours:$minutes",
                            color = Color.DarkGray,
                            fontSize = 25.sp)
                    }
                }
                Divider()
            }*/
        }
    }
}