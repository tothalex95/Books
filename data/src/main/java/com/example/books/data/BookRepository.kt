package com.example.books.data

import com.example.books.domain.Book

class BookRepository(
    private val bookDataSource: BookDataSource
) {

    suspend fun findBooksByQuery(
        query: String,
        maxResults: Int,
        startIndex: Int
    ) = bookDataSource.findBooksByQuery(query, maxResults, startIndex)

    suspend fun addFavorite(book: Book) = bookDataSource.addFavorite(book)

    suspend fun findFavorites()  = bookDataSource.findFavorites()

}