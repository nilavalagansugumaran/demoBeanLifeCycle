package com.example.demoBeanLifeCycle;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Data
@Slf4j
@ConditionalOnProperty(name = "braclays.available", havingValue = "true")
public class Braclays implements Bank {


    @Value("${barcley.interest:0.25}")
    private Double interest;

    @Override
    public void deposit(double amount) {
      log.debug("amount {}, interest {}", amount, interest);
      log.debug("Deposit complete at Braclays and maturity amount after 1 year == {}", (amount * interest)/100 + amount);
    }

    @Override
    public String toString(){
        return "BraclaysBank";
    }
}
