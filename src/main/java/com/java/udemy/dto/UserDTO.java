package com.java.udemy.dto;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
  private Integer id;
  private String fullname;
  private String email;
  private Instant createdAt;
  private String password; 

  public UserDTO(Integer id, String fullname, String email, Instant createdAt, String password) {
    this.id = id;
    this.fullname = fullname;
    this.email = email;
    this.createdAt = createdAt;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}