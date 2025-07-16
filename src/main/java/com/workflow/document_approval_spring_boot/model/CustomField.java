package com.workflow.document_approval_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "custom_fields")
@NoArgsConstructor
@AllArgsConstructor

public class CustomField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fieldKey;
    private String fieldValue;

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}