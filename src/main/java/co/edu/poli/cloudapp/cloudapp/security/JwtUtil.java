package co.edu.poli.cloudapp.cloudapp.security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {
    private SecretKey key;
    private long validityMs;

    public JwtUtil(@Value("${app.jwt.secret:changeit}") String secrete,
                   @Value("${app.jwt.validityMs:3600000}") long validityMs) {
        this.key = Keys.hmacShaKeyFor(secrete.getBytes());
        this.validityMs = validityMs;
    }

    public String generateToken(String subject){
        Date now = new Date();
        Date exp = new Date(now.getTime() + validityMs);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(now)
                .setExpiration(exp)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims validateTokenAndGetClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
