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

    private String stageName;
    private int stageOrder;
    private String requiredRole;
    private String approverType;
    private int deadlineInDays;
    private boolean autoApproveAfterDeadline;
    private String escalationRule;

    @ManyToOne
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

    @OneToMany(mappedBy = "stage")
    private List<ApprovalAction> approvalActions;

}
