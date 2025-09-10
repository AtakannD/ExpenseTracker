package com.atakandalkiran.expensetracker.data.mapper

import com.atakandalkiran.expensetracker.data.local.ExpenseInfoEntity
import com.atakandalkiran.expensetracker.domain.model.ExpenseInfo

fun ExpenseInfo.toExpenseInfoEntity() : ExpenseInfoEntity {
    return ExpenseInfoEntity(
        name = name,
        type = type,
        price = price
    )
}

fun ExpenseInfoEntity.toExpenseInfo() : ExpenseInfo {
    return ExpenseInfo(
        name = name,
        type = type,
        price = price
    )
}