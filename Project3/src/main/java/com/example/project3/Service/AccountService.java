package com.example.project3.Service;

import com.example.project3.ApiResponse.ApiException;
import com.example.project3.DTOin.Accountin;
import com.example.project3.Model.Account;
import com.example.project3.Model.Customer;
import com.example.project3.Repository.AccountRepository;
import com.example.project3.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
    
    public void createAccount(Integer id ,Accountin accountin){
        Customer customer = customerRepository.findCustomerById(id);
        Account account = new Account();
        if (customer == null){
            throw new ApiException("Customer not found");
        }
        account.setAccountNumber(accountin.getAccountNumber());
        account.setBalance(accountin.getBalance());
        account.setCustomer(customer);
        accountRepository.save(account);
    }



    public void deposit(Integer id , Double deposit){
        Account account = accountRepository.findAccountById(id);
        account.setBalance(account.getBalance() + deposit);
        accountRepository.save(account);
    }

    public void withdraw(Integer id , Double withdraw){
        Account account = accountRepository.findAccountById(id);
        account.setBalance(account.getBalance() - withdraw);
        accountRepository.save(account);
    }

    public void
    
    

   
    
}
