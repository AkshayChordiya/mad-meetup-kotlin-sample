package com.akshay.mad

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// TODO: 18. Create object
// In reality, you'll need to pass a actual context rather than null
object BlahDatabase : SQLiteOpenHelper(null, "blah", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

}