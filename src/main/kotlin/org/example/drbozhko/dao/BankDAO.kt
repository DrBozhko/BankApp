package org.example.drbozhko.dao

import org.example.drbozhko.domain.Bank

interface BankDAO {
    fun getBanks(): Collection<Bank>
    fun getBank(accountNumber: String): Bank
}