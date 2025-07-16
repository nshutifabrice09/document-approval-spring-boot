package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "policies")
@NoArgsConstructor
@AllArgsConstructor
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyName;
    private String description;
    @Column(length = 1000)
    private String ruleJson;

    @ManyToOne
    @JoinColumn(name = "workflow_id")
    private Workflow appliesToWorkflow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuleJson() {
        return ruleJson;
    }

    public void setRuleJson(String ruleJson) {
        this.ruleJson = ruleJson;
    }

    public Workflow getAppliesToWorkflow() {
        return appliesToWorkflow;
    }

    public void setAppliesToWorkflow(Workflow appliesToWorkflow) {
        this.appliesToWorkflow = appliesToWorkflow;
    }
}
