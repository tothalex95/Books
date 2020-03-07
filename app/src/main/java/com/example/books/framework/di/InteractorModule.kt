package com.example.books.framework.di

import com.example.books.interactor.AddFavorite
import com.example.books.interactor.BookInteractors
import com.example.books.interactor.GetBooks
import com.example.books.interactor.GetFavorites
import org.koin.dsl.module

val interactorModule = module {
    single { GetBooks(get()) }
    single { AddFavorite(get()) }
    single { GetFavorites(get()) }
    single { BookInteractors(get(), get(), get()) }
}