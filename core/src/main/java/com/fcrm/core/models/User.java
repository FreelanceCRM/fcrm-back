package com.fcrm.core.models;

import com.fcrm.core.enums.Permissions;
import com.fcrm.core.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String username;

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Getter
    private String email;

    @Getter
    private String password;

    @Getter
    @ElementCollection(targetClass = Roles.class)
    @Enumerated(EnumType.STRING)
    private Set<Roles> roles = new HashSet<>();

    @Getter
    @ElementCollection(targetClass = Permissions.class)
    @Enumerated(EnumType.STRING)
    private Set<Permissions> permissions = new HashSet<>();

    /* ========================================================== */

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
