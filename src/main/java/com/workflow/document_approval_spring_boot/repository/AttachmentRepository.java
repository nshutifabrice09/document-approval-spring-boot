package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
