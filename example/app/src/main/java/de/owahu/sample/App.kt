package de.owahu.sample

import android.app.Application
import android.util.Log

/**
 * @author Aleksandar Gotev
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("APP", "de.owahu.sample.App initialized")
    }
}
