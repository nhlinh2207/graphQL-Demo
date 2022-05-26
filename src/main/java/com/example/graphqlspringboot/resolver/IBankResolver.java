package com.example.graphqlspringboot.resolver;

import com.example.graphqlspringboot.entity.BankAccount;

import java.util.UUID;

public interface IBankResolver {
    BankAccount bankAccount(UUID id);
}
