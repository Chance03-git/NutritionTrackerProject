package com.example.project5

import android.app.Application

class BitFitApplication : Application() {
    // Your application setup code (e.g., database setup) goes here
    val db by lazy { AppDatabase.getInstance(this) }
}

