package org.example.drbozhko.dao.impl

import org.example.drbozhko.dao.BankDAO
import org.example.drbozhko.domain.Bank
import org.springframework.stereotype.Repository
import java.lang.IllegalArgumentException

@Repository
class BankDAOImpl : BankDAO {
    val banks = mutableListOf<Bank>(
        Bank("1234", 3.14, 17),
        Bank("2", 17.0, 0),
        Bank("3", 0.0, 100),
    )

    override fun getBanks(): Collection<Bank> = banks

    override fun getBank(accountNumber: String): Bank =
        banks.firstOrNull { it.getAccountNumber() == accountNumber }
            ?: throw java.util.NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.getAccountNumber() == bank.getAccountNumber()}) {
            throw IllegalArgumentException("Bank with account number ${bank.getAccountNumber()} is already exists.")
        }
        banks.add(bank)

        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull {it.getAccountNumber() == bank.getAccountNumber()}
            ?: throw NoSuchElementException("Could not find a bank with account number ${bank.getAccountNumber()}")

        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull {it.getAccountNumber() == accountNumber}
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

        banks.remove(currentBank)

    }
}