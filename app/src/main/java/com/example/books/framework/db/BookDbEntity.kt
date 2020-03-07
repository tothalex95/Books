package com.example.books.framework.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class BookDbEntity(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    val title: String,
    val subtitle: String?,
    val author: String?,
    val publisher: String?,
    val description: String
)