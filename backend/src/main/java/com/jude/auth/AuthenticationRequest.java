package com.jude.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
