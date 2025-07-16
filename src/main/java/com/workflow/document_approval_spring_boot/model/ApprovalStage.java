package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public int getStageOrder() {
        return stageOrder;
    }

    public void setStageOrder(int stageOrder) {
        this.stageOrder = stageOrder;
    }

    public String getRequiredRole() {
        return requiredRole;
    }

    public void setRequiredRole(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    public String getApproverType() {
        return approverType;
    }

    public void setApproverType(String approverType) {
        this.approverType = approverType;
    }

    public int getDeadlineInDays() {
        return deadlineInDays;
    }

    public void setDeadlineInDays(int deadlineInDays) {
        this.deadlineInDays = deadlineInDays;
    }

    public boolean isAutoApproveAfterDeadline() {
        return autoApproveAfterDeadline;
    }

    public void setAutoApproveAfterDeadline(boolean autoApproveAfterDeadline) {
        this.autoApproveAfterDeadline = autoApproveAfterDeadline;
    }

    public String getEscalationRule() {
        return escalationRule;
    }

    public void setEscalationRule(String escalationRule) {
        this.escalationRule = escalationRule;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public List<ApprovalAction> getApprovalActions() {
        return approvalActions;
    }

    public void setApprovalActions(List<ApprovalAction> approvalActions) {
        this.approvalActions = approvalActions;
    }
}
