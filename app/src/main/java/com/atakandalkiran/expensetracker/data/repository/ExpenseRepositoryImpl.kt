package com.atakandalkiran.expensetracker.data.repository

import com.atakandalkiran.expensetracker.data.local.ExpensesDatabase
import com.atakandalkiran.expensetracker.domain.model.ExpenseInfo
import com.atakandalkiran.expensetracker.domain.repository.ExpenseRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExpenseRepositoryImpl @Inject constructor(
    private val database: ExpensesDatabase
) : ExpenseRepository {
    override suspend fun getExpenses(): List<ExpenseInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun addExpense(expense: ExpenseInfo) {
        TODO("Not yet implemented")
    }

    override suspend fun clearExpenses() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteExpense(expense: ExpenseInfo) {
        TODO("Not yet implemented")
    }


}