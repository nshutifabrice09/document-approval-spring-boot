package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Document {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;

    @Enumerated(EnumType.STRING)
    private DocumentStatus status; // DRAFT, SUBMITTED, APPROVED, REJECTED

    private Integer version;

    @ManyToOne
    private User creator;

    private Integer currentStageIndex; // pointer to current stage

    private LocalDate createdAt;
}
