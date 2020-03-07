package com.example.books.interactor

data class BookInteractors(
    val getBooks: GetBooks,
    val addFavorite: AddFavorite,
    val getFavorites: GetFavorites
)