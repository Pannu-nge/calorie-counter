package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
