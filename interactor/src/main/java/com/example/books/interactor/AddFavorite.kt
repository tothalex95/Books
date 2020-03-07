package com.example.books.interactor

import com.example.books.data.BookRepository
import com.example.books.domain.Book

class AddFavorite(
    private val bookRepository: BookRepository
) : AbstractInteractor<AddFavorite.Parameter, Unit>() {

    override suspend fun execute(parameter: Parameter) = bookRepository.addFavorite(parameter.book)

    data class Parameter(
        val book: Book
    )

}