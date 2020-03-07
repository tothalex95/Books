package com.example.books.framework.di

import com.example.books.data.BookDataSource
import com.example.books.framework.datasource.BookDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<BookDataSource> { BookDataSourceImpl(get(), get(), get(), get()) }
}