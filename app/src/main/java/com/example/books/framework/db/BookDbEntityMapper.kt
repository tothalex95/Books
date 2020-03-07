package com.example.books.framework.db

import com.example.books.domain.Book
import com.example.books.framework.Mapper
import java.time.LocalDate

class BookDbEntityMapper : Mapper<BookDbEntity, Book> {

    override fun mapToModel(entity: BookDbEntity): Book {
        return Book(
            title = entity.title,
            subtitle = entity.subtitle,
            authors = entity.author?.split("#"),
            publisher = entity.publisher,
            description = entity.description,
            publishedDate = LocalDate.now(),
            pageCount = 0,
            averageRating = 3.0
        )
    }

    override fun mapToEntity(model: Book): BookDbEntity {
        return BookDbEntity(
            id = null,
            title = model.title,
            subtitle = model.subtitle,
            author = model.authors?.joinToString("#"),
            publisher = model.publisher,
            description = model.description
        )
    }

}