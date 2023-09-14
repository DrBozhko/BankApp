package org.example.drbozhko.service

import org.example.drbozhko.dao.BankDAO
import org.example.drbozhko.domain.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDAO: BankDAO) {
    fun getBanks(): Collection<Bank> = bankDAO.getBanks()

    fun getBank(accountNumber: String): Bank = bankDAO.getBank(accountNumber)
    fun addBank(bank: Bank): Bank = bankDAO.createBank(bank)
    fun updateBank(bank: Bank): Bank = bankDAO.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = bankDAO.deleteBank(accountNumber)
}