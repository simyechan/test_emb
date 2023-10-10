package com.example.emb.global.security.jwt;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@Getter
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String secretKey;
    private Long accessExp;
    private Long refreshExp;
    private String header;
    private String prefix;

    public JwtProperties(String secretKey, Long accessExp, Long refreshExp, String header, String prefix) {
        this.secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
        this.accessExp = accessExp;
        this.refreshExp = refreshExp;
        this.header = header;
        this.prefix = prefix;
    }
}
