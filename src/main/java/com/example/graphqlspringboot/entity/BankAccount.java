package com.example.graphqlspringboot.entity;

import lombok.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BankAccount {
    UUID id;
    String name;
    Currency currency;
}
