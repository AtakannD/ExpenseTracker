package com.atakandalkiran.expensetracker.di

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ExpenseTrackerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object {
        private lateinit var application: Application

        fun getAppContext(): Context {
            return application.applicationContext
        }
    }
}