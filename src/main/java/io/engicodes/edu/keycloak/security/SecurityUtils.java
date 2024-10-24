//package io.engicodes.edu.keycloak.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//import org.springframework.stereotype.Component;
//
//import java.security.interfaces.RSAPublicKey;
//
//@Component
//@RequiredArgsConstructor
//public class SecurityUtils {
//    private final RSAPublicKey key;
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        return NimbusJwtDecoder.withPublicKey(this.key).build();
//    }
//}
