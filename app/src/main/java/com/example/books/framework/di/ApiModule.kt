package com.example.books.framework.di

import com.example.books.framework.api.BookApi
import com.example.books.framework.api.BookApiEntityMapper
import org.koin.dsl.module
import retrofit2.Converter
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single<Converter.Factory> { GsonConverterFactory.create() }
    single { BookApi.create(get()) }
    single { BookApiEntityMapper() }
}