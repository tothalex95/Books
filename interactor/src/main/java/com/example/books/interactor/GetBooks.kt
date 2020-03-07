package com.example.books.interactor

import com.example.books.data.BookRepository
import com.example.books.domain.Book

class GetBooks(
    private val bookRepository: BookRepository
) : AbstractInteractor<GetBooks.Parameter, GetBooks.Result>() {

    override suspend fun execute(parameter: Parameter): Result {
        val books = bookRepository.findBooksByQuery(
            parameter.query,
            parameter.maxResults,
            parameter.startIndex
        )
        return Result(books)
    }

    data class Parameter(
        val query: String,
        val maxResults: Int,
        val startIndex: Int
    )

    data class Result(
        val books: List<Book>
    )

}