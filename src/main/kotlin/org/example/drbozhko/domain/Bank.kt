package org.example.drbozhko.domain

data class Bank(
    private val accountNumber: String,
    private val trust: Double,
    private val transactionFee: Int
) {
    fun getAccountNumber(): String {
        return accountNumber
    }

    fun getTrust(): Double {
        return trust
    }

    fun getTransactionFee(): Int {
        return transactionFee
    }
}

