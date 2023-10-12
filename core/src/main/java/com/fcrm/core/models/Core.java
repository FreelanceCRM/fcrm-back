package com.fcrm.core.models;


import jakarta.persistence.*;

@Entity
public class Core {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String key;

    private String value;

    public Core() {
    }

    public Core(User user, String key, String value) {
        this.user = user;
        this.key = key;
        this.value = value;
    }

    /* ==================================================================== */

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
