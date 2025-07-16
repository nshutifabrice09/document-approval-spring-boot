package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "approval_actions")
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actionType;
    private String comments;
    private String attachments;
    private LocalDate actionTimestamp;

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "stage_id")
    private ApprovalStage stage;

    @ManyToOne
    @JoinColumn(name = "action_by_user_id")
    private User actionBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public LocalDate getActionTimestamp() {
        return actionTimestamp;
    }

    public void setActionTimestamp(LocalDate actionTimestamp) {
        this.actionTimestamp = actionTimestamp;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public ApprovalStage getStage() {
        return stage;
    }

    public void setStage(ApprovalStage stage) {
        this.stage = stage;
    }

    public User getActionBy() {
        return actionBy;
    }

    public void setActionBy(User actionBy) {
        this.actionBy = actionBy;
    }
}
