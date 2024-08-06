package com.sprintboot.banking_system.service.impl;

import org.springframework.stereotype.Service;

import com.sprintboot.banking_system.dto.AccountDto;
import com.sprintboot.banking_system.entity.Account;
import com.sprintboot.banking_system.repo.AccountRepo;
import com.sprintboot.banking_system.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepo accountRepo;
    

    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }
    @Override
    public AccountDto createAccountDto(Account account) {
        // TODO Auto-generated method stub
        return null;
    }
}
