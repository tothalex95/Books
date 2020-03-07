package com.example.books.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        BookDbEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class BookDatabase : RoomDatabase() {

    companion object {

        private const val DB_NAME = "book.db"

        fun create(context: Context): BookDatabase {
            return Room.databaseBuilder(
                context,
                BookDatabase::class.java,
                DB_NAME
            ).build()
        }

    }

    abstract fun bookDao(): BookDao

}