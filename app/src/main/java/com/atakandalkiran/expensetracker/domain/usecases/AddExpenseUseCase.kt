package com.atakandalkiran.expensetracker.domain.usecases

import com.atakandalkiran.expensetracker.data.repository.ExpenseRepositoryImpl
import com.atakandalkiran.expensetracker.domain.model.ExpenseInfo
import javax.inject.Inject

class AddExpenseUseCase @Inject constructor(
    private val repository: ExpenseRepositoryImpl
) {

    suspend fun addExpense(expense: ExpenseInfo) {
        repository.addExpense(expense)
    }
}