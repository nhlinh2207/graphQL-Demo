package com.example.graphqlspringboot.resolver.impl;

import com.example.graphqlspringboot.entity.BankAccount;
import com.example.graphqlspringboot.entity.Currency;
import com.example.graphqlspringboot.resolver.IBankResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankResolver implements GraphQLQueryResolver, IBankResolver {

    @Override
    public BankAccount bankAccount(UUID id) {
        if (id == null){
            return BankAccount.builder().id(null).name("not exists").currency(Currency.VND).build();
        }
        return BankAccount.builder().id(id).name("abc").currency(Currency.USD).build();
    }
}
