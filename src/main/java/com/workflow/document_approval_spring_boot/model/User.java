package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String password; // hashed
    private String role; // e.g., "CLERK", "MANAGER", "DIRECTOR"
    private String department;

    private boolean active;
}

