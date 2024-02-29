package com.beslan.composition.presentation

import android.app.Application
import com.beslan.composition.di.DaggerApplicationComponent


class GameApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}