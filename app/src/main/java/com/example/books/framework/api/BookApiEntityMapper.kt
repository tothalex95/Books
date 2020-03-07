package com.example.books.framework.api

import com.example.books.domain.Book
import com.example.books.framework.Mapper
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class BookApiEntityMapper : Mapper<BookSearchResponse.BookApiEntity, Book> {

    override fun mapToModel(entity: BookSearchResponse.BookApiEntity): Book {
        return Book(
            title = entity.volumeInfo.title,
            subtitle = entity.volumeInfo.subtitle,
            authors = entity.volumeInfo.authors,
            averageRating = entity.volumeInfo.averageRating,
            description = entity.volumeInfo.description,
            pageCount = entity.volumeInfo.pageCount,
            publisher = entity.volumeInfo.publisher,
            publishedDate = LocalDate.parse(
                entity.volumeInfo.publishedDate,
                DateTimeFormatter.ofPattern("yyyy-MM-dd")
            )
        )
    }

    override fun mapToEntity(model: Book): BookSearchResponse.BookApiEntity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}