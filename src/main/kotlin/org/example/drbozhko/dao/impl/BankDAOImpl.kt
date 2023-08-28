package org.example.drbozhko.dao.impl

import org.example.drbozhko.dao.BankDAO
import org.example.drbozhko.domain.Bank
import org.springframework.stereotype.Repository

@Repository
class BankDAOImpl: BankDAO {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("2", 17.0, 0),
        Bank("3", 0.0, 100),
    )

    override fun getBanks(): Collection<Bank> = banks

    override fun getBank(accountNumber: String): Bank = banks.first { it.getAccountNumber() == accountNumber }
}