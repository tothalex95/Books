package com.example.books.framework.di

import com.example.books.data.BookRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { BookRepository(get()) }
}