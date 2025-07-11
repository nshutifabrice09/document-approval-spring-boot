package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "documents")
@AllArgsConstructor
@NoArgsConstructor
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
