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
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

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

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getRoleRequired() {
        return roleRequired;
    }

    public void setRoleRequired(String roleRequired) {
        this.roleRequired = roleRequired;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }
}
