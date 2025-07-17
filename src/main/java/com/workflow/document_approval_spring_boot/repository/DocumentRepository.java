package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository <Document, Long> {
    Document findDocumentById(Long documentId);
}
