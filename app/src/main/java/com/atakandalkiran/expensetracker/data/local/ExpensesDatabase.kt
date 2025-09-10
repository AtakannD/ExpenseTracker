package com.atakandalkiran.expensetracker.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [ExpenseInfoEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ExpensesDatabase: RoomDatabase() {
    abstract val dao: ExpensesDao

    companion object {
        @Volatile
        private var INSTANCE: ExpensesDatabase? = null

        fun getInstance(context: Context): ExpensesDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    ExpensesDatabase::class.java,
                    "expenses_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}