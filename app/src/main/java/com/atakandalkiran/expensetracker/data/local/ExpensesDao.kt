package com.atakandalkiran.expensetracker.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ExpensesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expenseListEntities: List<ExpenseInfoEntity>)

    @Query("SELECT * FROM ExpenseInfoEntity")
    suspend fun getExpenses(): List<ExpenseInfoEntity>

    @Query("DELETE FROM ExpenseInfoEntity")
    suspend fun clearAllExpenses()

    @Delete
    suspend fun deleteExpense(expense: ExpenseInfoEntity)
}
