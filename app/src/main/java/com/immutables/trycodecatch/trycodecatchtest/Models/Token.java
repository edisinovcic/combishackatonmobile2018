package com.immutables.trycodecatch.trycodecatchtest.Models;

public class Token
{
    String accessToken;
    String refreshToken;

    public Token (String accessToken, String refreshToken)
    {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
