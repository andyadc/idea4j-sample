package com.idea4j.sample.entity;

import com.idea4j.framework.orm.annotation.Entity;
import com.idea4j.framework.orm.annotation.Table;

/**
 * @author andaicheng
 */
@Table(value = "user")
@Entity
public class User {

    private Long id;
    private String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
