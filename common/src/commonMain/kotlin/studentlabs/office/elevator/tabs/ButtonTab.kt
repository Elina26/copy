package studentlabs.office.elevator.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Elevator
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.TabConfiguration
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.TabItem

class ButtonTab : TabItem() {

    override val configuration: TabConfiguration
        @Composable
        get() {
            return TabConfiguration(
                title = "Elevator",
                selectedColor = Color.DarkGray,
                unselectedColor = Color.Gray,
                selectedIcon = rememberVectorPainter(Icons.Outlined.Elevator),
                unselectedIcon = rememberVectorPainter(Icons.Outlined.Elevator)
            )
        }
}