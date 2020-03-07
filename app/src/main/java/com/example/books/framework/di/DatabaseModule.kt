package com.example.books.framework.di

import com.example.books.framework.db.BookDatabase
import com.example.books.framework.db.BookDbEntityMapper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single { BookDbEntityMapper() }
    single { BookDatabase.create(androidContext()) }
    single { get<BookDatabase>().bookDao() }
}