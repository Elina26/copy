package studentlabs.office.elevator

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import ru.alexgladkov.odyssey.compose.setupNavigation
import studentlabs.office.elevator.navigation.generateGraph

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setupNavigation(NavigationTree.Screens.Button.name) {
                generateGraph()
            }
        }
    }
}
