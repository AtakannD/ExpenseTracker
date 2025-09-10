package com.atakandalkiran.expensetracker.domain.repository

import com.atakandalkiran.expensetracker.domain.model.ExpenseInfo

interface ExpenseRepository {
    suspend fun getExpenses(): List<ExpenseInfo>

    suspend fun addExpense(expense: ExpenseInfo)

    suspend fun clearExpenses()

    suspend fun deleteExpense(expense: ExpenseInfo)
}