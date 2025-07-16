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
}
