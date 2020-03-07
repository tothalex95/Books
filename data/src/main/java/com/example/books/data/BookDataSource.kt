package com.example.books.data

import com.example.books.domain.Book

interface BookDataSource {

    suspend fun findBooksByQuery(
        query: String,
        maxResults: Int,
        startIndex: Int
    ): List<Book>

    suspend fun addFavorite(book: Book)

    suspend fun findFavorites() : List<Book>

}
