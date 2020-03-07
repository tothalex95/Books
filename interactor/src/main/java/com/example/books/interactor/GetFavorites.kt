package com.example.books.interactor

import com.example.books.data.BookRepository
import com.example.books.domain.Book

class GetFavorites(
    private val bookRepository: BookRepository
) : AbstractInteractor<Unit, GetFavorites.Result>() {

    override suspend fun execute(parameter: Unit) = Result(bookRepository.findFavorites())

    data class Result(
        val books: List<Book>
    )

}