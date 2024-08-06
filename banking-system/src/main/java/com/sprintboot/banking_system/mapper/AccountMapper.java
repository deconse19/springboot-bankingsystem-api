package com.sprintboot.banking_system.mapper;

import com.sprintboot.banking_system.dto.AccountDto;
import com.sprintboot.banking_system.entity.Account;

public class AccountMapper {   
    
    public static Account mapToAccount(AccountDto accountDto){

        Account account = new Account(
            accountDto.getId(), 
            accountDto.getAcccountHolderName(),
            accountDto.getBalance() 
        );

        return account;
        
    }

    public static AccountDto mapToAccount(Account account){
        AccountDto accountDto = new AccountDto(
            account.getId(),
            account.getAcccountHolderName(),
            account.getBalance()

        );
        return accountDto;
    }

}
