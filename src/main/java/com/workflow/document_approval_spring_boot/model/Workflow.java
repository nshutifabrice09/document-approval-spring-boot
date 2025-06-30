package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;

@Entity
public class Workflow {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "workflow", cascade = CascadeType.ALL)
    private List<ApprovalStageTemplate> stages;
}
