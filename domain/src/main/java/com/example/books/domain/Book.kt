package com.example.books.domain

import java.time.LocalDate

data class Book(
    val title: String,
    val subtitle: String?,
    val authors: List<String>?,
    val publisher: String?,
    val publishedDate: LocalDate?,
    val description: String,
    val pageCount: Int,
    val averageRating: Double
)
