package com.sprintboot.banking_system.service;

import com.sprintboot.banking_system.dto.AccountDto;
import com.sprintboot.banking_system.entity.Account;

public interface AccountService {

    // AccountDto getAccount(Account account);
    AccountDto createAccountDto(Account account);
    
}
