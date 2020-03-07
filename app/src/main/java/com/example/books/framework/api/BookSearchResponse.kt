package com.example.books.framework.api

data class BookSearchResponse(
    val totalItems: Int,
    val items: List<BookApiEntity>
) {

    data class BookApiEntity(
        val id: String,
        val selfLink: String,
        val volumeInfo: VolumeInfo
    )

    data class VolumeInfo(
        val title: String,
        val subtitle: String?,
        val authors: List<String>?,
        val publisher: String,
        val publishedDate: String,
        val description: String,
        val pageCount: Int,
        val averageRating: Double,
        val ratingsCount: Int,
        val imageLinks: ImageLinks
    )

    data class ImageLinks(
        val smallThumbnail: String,
        val thumbnail: String
    )

}