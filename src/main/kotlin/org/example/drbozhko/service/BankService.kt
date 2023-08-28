package org.example.drbozhko.service

import org.example.drbozhko.dao.BankDAO
import org.example.drbozhko.domain.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDAO:BankDAO) {
    fun getBanks(): Collection<Bank> = bankDAO.getBanks()

    fun getBank(accountNumber: String): Bank = bankDAO.getBank(accountNumber)
}