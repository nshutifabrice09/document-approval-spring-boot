package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "change_requests")
@NoArgsConstructor
@AllArgsConstructor
public class ChangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private LocalDate requestedAt;
    private String status;
    private String responseNote;
    private LocalDate resolvedAt;

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "requested_by")
    private User requestedBy;

    @ManyToOne
    @JoinColumn(name = "response_by")
    private User responseBy;

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

    public LocalDate getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(LocalDate requestedAt) {
        this.requestedAt = requestedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponseNote() {
        return responseNote;
    }

    public void setResponseNote(String responseNote) {
        this.responseNote = responseNote;
    }

    public LocalDate getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(LocalDate resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public User getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(User requestedBy) {
        this.requestedBy = requestedBy;
    }

    public User getResponseBy() {
        return responseBy;
    }

    public void setResponseBy(User responseBy) {
        this.responseBy = responseBy;
    }
}