package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "approval_stages")
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalStage {
    @Id
    @GeneratedValue
    private Long id;

    private int sequence; // order of stage in workflow

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "approver_id")
    private User approver;

    @Enumerated(EnumType.STRING)
    private StageStatus status; // PENDING, APPROVED, REJECTED

    private String comments;
    private LocalDate reviewedAt;
}
