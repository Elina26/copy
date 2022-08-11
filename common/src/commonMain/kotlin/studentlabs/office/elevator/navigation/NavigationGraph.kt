package studentlabs.office.elevator.navigation

import ru.alexgladkov.odyssey.compose.RootController
import ru.alexgladkov.odyssey.compose.extensions.bottomNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import studentlabs.office.elevator.NavigationTree

import studentlabs.office.elevator.screens.AuthScreen
import studentlabs.office.elevator.screens.ButtonScreen
import studentlabs.office.elevator.screens.RatingScreen


import studentlabs.office.elevator.tabs.AuthTab
import studentlabs.office.elevator.tabs.ButtonTab
import studentlabs.office.elevator.tabs.RatingTab

fun RootComposeBuilder.generateGraph() {

    bottomNavigation(name = NavigationTree.Screens.Auth.name, tabsNavModel = BottomConfiguration()) {
        tab(ButtonTab()){
            screen(name = NavigationTree.Screens.Button.name) {
                ButtonScreen()
            }
        }
        tab(RatingTab()){
            screen(name = NavigationTree.Screens.Rating.name) {
                RatingScreen()
            }
        }
        tab(AuthTab()){
            screen(name = NavigationTree.Screens.Auth.name) {
                AuthScreen(rootController = RootController())
            }
        }
    }
}
