package com.example.books

import android.app.Application
import com.example.books.framework.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin

class BookApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@BookApp)
            fragmentFactory()
            modules(
                repositoryModule,
                interactorModule,
                dataSourceModule,
                databaseModule,
                apiModule
            )
        }
    }

}