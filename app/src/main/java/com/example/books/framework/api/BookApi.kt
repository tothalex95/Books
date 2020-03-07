package com.example.books.framework.api

import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApi {

    companion object {
        private const val BASE_URL = "https://www.googleapis.com"

        fun create(converterFactory: Converter.Factory): BookApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(converterFactory)
                .build()
                .create(BookApi::class.java)
        }
    }

    @GET("/books/v1/volumes")
    suspend fun findByQuery(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int,
        @Query("startIndex") startIndex: Int
    )

}