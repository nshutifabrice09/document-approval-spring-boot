package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String status;
    private LocalDate dueDate;
    private LocalDate completedAt;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "stage_id")
    private ApprovalStage stage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDate completedAt) {
        this.completedAt = completedAt;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public ApprovalStage getStage() {
        return stage;
    }

    public void setStage(ApprovalStage stage) {
        this.stage = stage;
    }
}