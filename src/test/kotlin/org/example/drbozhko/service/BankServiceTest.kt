package org.example.drbozhko.service

import io.mockk.mockk
import io.mockk.verify
import org.example.drbozhko.dao.BankDAO
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val bankDAO: BankDAO = mockk(relaxed = true)
    private val bankService = BankService(bankDAO)
    
    @Test
    fun `should call its data source to get banks`(){
        //when
        bankService.getBanks()
        
        //then
        verify (exactly = 1){ bankDAO.getBanks() }
        
    }
        
}