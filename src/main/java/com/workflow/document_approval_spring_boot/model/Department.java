package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToOne
    @JoinColumn(name = "head_id")
    private User head;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getHead() {
        return head;
    }

    public void setHead(User head) {
        this.head = head;
    }
}

