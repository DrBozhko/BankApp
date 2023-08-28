package org.example.drbozhko.dao.impl

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BankDAOTest {

    private val bankDAOImpl = BankDAOImpl()

    @Test
    fun `should provide a collection of banks`(){
        //when
        val banks = bankDAOImpl.getBanks()
        
        //then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`(){
        //when
        val banks = bankDAOImpl.getBanks()

        //then
        assertThat(banks).allMatch{ it.getAccountNumber().isNotBlank() }
        assertThat(banks).anyMatch{ it.getTrust() != 0.0 }
        assertThat(banks).anyMatch{ it.getTransactionFee() != 0 }

    }

}