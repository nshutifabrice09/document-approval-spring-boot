package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository <AuditLog, Long> {
    AuditLog findAuditLogById(Long id);
}
