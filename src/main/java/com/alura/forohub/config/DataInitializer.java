package com.alura.forohub.config;

import com.alura.forohub.model.Usuario;
import com.alura.forohub.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UsuarioRepository usuarioRepository) {
        return args -> {
            if (usuarioRepository.findByUsername("admin").isEmpty()) {
                // encriptamos la contraseña con BCrypt
                String encryptedPassword = new BCryptPasswordEncoder().encode("admin123");
                usuarioRepository.save(new Usuario("admin", encryptedPassword));
            }
        };
    }
}
