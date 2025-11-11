package co.edu.poli.cloudapp.cloudapp.restcontrollers;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.cloudapp.cloudapp.security.JwtUtil;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private JwtUtil jwtUtil;


    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/token")
    public ResponseEntity<Map<String, String>> token(@RequestBody Map<String, String> body) {
        String username = body.getOrDefault("username", "testuser");
        String token = jwtUtil.generateToken(username);
        return ResponseEntity.ok(Map.of("token", token));
    }
    

}
