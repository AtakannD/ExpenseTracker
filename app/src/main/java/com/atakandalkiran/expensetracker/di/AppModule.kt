package com.atakandalkiran.expensetracker.di

import android.content.Context
import com.atakandalkiran.expensetracker.data.local.ExpensesDao
import com.atakandalkiran.expensetracker.data.local.ExpensesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object AppModule {

    @Provides
    @Singleton
    fun provideExpenseDatabase(
        @ApplicationContext context: Context
    ): ExpensesDatabase = ExpensesDatabase.getInstance(context)
}