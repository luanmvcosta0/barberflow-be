package com.barberflow.be.modules.authentication.core.entities;

import java.time.LocalDateTime;

public class User {

  private Long id;
  private String fullName;
  private String email;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public User() {}

  public User(Long id, String fullName, String email, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.password = password;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public Long getId() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }
  
}
