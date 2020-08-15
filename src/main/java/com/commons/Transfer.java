package com.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transfer {
    private String senderAccount;
    private String recipientAccount;
    private String title;
    private BigDecimal amount;


}
