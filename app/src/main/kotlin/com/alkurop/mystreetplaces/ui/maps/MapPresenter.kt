package com.alkurop.mystreetplaces.ui.maps

import com.alkurop.mystreetplaces.ui.navigation.NavigationAction
import io.reactivex.subjects.Subject

interface MapPresenter {
    val viewBus: Subject<MapViewModel>
    val navBus: Subject<NavigationAction>

    fun unsubscribe()
}
