package com.android.jeepneypass

import android.app.Application

class JeepneyPassApplication: Application() {
    companion object {
        lateinit var instance: Application
//        lateinit var realm : Realm
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

//        val config = RealmConfiguration.create(
//            schema = setOf(ResultRealm::class)
//        )
//        realm  = Realm.open(config)
    }

    override fun onTerminate() {
        super.onTerminate()
//        realm.close()
    }
}