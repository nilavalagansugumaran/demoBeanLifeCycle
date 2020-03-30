package com.example.demoBeanLifeCycle;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Slf4j
public class BankService {

    @Autowired
    private List<Bank> banks;

    public void deposit(double amount) {

        log.debug("Avaiable banks {}",banks);
        banks.stream().forEach(b -> b.deposit(amount));
    }
}
