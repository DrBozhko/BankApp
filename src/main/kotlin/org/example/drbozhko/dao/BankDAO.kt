package org.example.drbozhko.dao

import org.example.drbozhko.domain.Bank

interface BankDAO {
    fun getBanks(): Collection<Bank>
    fun getBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}