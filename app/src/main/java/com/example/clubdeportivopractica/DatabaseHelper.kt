package com.example.clubdeportivopractica
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object{
        //DB
        private const val DATABASE_NAME = "UserDatabase.db"
        private const val DATABASE_VERSION = 1

        //User table
        private const val TABLE_USER = "User"
        private const val COLUMN_ID = "id"
        private const val COLUMN_USERNAME = "userName"
        private const val COLUMN_PASSWORD = "password"

        //crear acá las otras tablas
    }
    override fun onCreate(db: SQLiteDatabase?) {
       val createUserTable = "CREATE TABLE $TABLE_USER ($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_USERNAME TEXT, " +
               "$COLUMN_PASSWORD TEXT)"
        db?.execSQL(createUserTable)

       val adminValues = ContentValues().apply {
            put(COLUMN_USERNAME, "admin")
            put(COLUMN_PASSWORD, "1234")

        }
        db?.insert(TABLE_USER, null, adminValues)

    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USER")
        onCreate(db)
    }
    fun validateUser(username: String, password: String): Boolean {
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_USER WHERE $COLUMN_USERNAME = '$username' AND $COLUMN_PASSWORD = '$password'", null)
        val isValid = cursor.count > 0
        cursor.close()
        db.close()
        return isValid
    }



}