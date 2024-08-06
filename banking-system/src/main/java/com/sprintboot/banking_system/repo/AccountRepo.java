package com.sprintboot.banking_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintboot.banking_system.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
