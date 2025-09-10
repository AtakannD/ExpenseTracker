package com.atakandalkiran.expensetracker.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExpenseInfoEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val type: String,
    val price: String
)