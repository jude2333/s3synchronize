package com.jude.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
