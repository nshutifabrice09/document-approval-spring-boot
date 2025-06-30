package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;

@Entity
public class ApprovalStageTemplate {
    @Id
    @GeneratedValue
    private Long id;

    private String name;           // e.g., "Department Head Review"
    private int sequence;
    private String roleRequired;   // e.g., "MANAGER"

    @ManyToOne
    private Workflow workflow;
}
