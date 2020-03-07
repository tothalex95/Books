package com.example.books.framework.datasource

import com.example.books.data.BookDataSource
import com.example.books.domain.Book
import com.example.books.framework.api.BookApi
import com.example.books.framework.api.BookApiEntityMapper
import com.example.books.framework.db.BookDao
import com.example.books.framework.db.BookDbEntityMapper

class BookDataSourceImpl(
    private val bookApi: BookApi,
    private val bookApiEntityMapper: BookApiEntityMapper,
    private val bookDao: BookDao,
    private val bookDbEntityMapper: BookDbEntityMapper
) : BookDataSource {

    override suspend fun findBooksByQuery(
        query: String,
        maxResults: Int,
        startIndex: Int
    ): List<Book> {
        return bookApi.findByQuery(query, maxResults, startIndex).items.map {
            bookApiEntityMapper.mapToModel(it)
        }
    }

    override suspend fun addFavorite(book: Book) {
        bookDao.create(bookDbEntityMapper.mapToEntity(book))
    }

    override suspend fun findFavorites(): List<Book> {
        return bookDao.findAll().map { bookDbEntityMapper.mapToModel(it) }
    }

}