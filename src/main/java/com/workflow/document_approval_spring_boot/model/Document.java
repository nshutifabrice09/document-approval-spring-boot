package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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
    private String description;
    private String type;
    private String status;
    private String priority;
    private String confidentialityLevel;

    private int version;
    private String fileUrl;

    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate dueDate;

    @ElementCollection
    private List<String> tags;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "document")
    private List<ApprovalAction> approvalActions;

    @OneToMany(mappedBy = "document")
    private List<Comment> comments;

    @OneToMany(mappedBy = "document")
    private List<Attachment> attachments;

    @OneToMany(mappedBy = "document")
    private List<ChangeRequest> changeRequests;

    @OneToMany(mappedBy = "document")
    private List<CustomField> customFields;

    @OneToMany(mappedBy = "document")
    private List<DeadlineExtensionRequest> deadlineRequests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getConfidentialityLevel() {
        return confidentialityLevel;
    }

    public void setConfidentialityLevel(String confidentialityLevel) {
        this.confidentialityLevel = confidentialityLevel;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<ApprovalAction> getApprovalActions() {
        return approvalActions;
    }

    public void setApprovalActions(List<ApprovalAction> approvalActions) {
        this.approvalActions = approvalActions;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(List<ChangeRequest> changeRequests) {
        this.changeRequests = changeRequests;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public List<DeadlineExtensionRequest> getDeadlineRequests() {
        return deadlineRequests;
    }

    public void setDeadlineRequests(List<DeadlineExtensionRequest> deadlineRequests) {
        this.deadlineRequests = deadlineRequests;
    }
}
