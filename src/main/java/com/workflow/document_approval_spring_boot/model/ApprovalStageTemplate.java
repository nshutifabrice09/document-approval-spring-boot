package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "approvalStage_templates")
@AllArgsConstructor
@NoArgsConstructor
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
