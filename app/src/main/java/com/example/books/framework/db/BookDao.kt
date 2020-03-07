package com.example.books.framework.db

import androidx.room.*

@Dao
interface BookDao {

    @Insert
    suspend fun create(entity: BookDbEntity)

    @Update
    suspend fun update(entity: BookDbEntity)

    @Delete
    suspend fun delete(entity: BookDbEntity)

    @Query("SELECT * FROM books")
    suspend fun findAll(): List<BookDbEntity>

}