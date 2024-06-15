package com.ChallengeAlura.demo.domain.usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "autorxs")
@Entity(name = "Autorx")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String clave;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
// Method definition
    public String getPassword() {
        return clave;
    }

    @Override
// Method definition
    public String getUsername() {
        return email;
    }

    @Override
// Method definition
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
// Method definition
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
// Method definition
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
// Method definition
    public boolean isEnabled() {
        return true;
    }
}