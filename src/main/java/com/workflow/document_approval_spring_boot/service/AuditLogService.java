package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.AuditLog;

import java.util.List;

public interface AuditLogService {
    List<AuditLog> auditLogList();
    AuditLog getAuditLogById(Long id);
    AuditLog saveAuditLog (AuditLog auditLog, Long performedBy);
    AuditLog updateAuditLog (Long id, AuditLog auditLog);
    void removeAuditLog (Long id);
}
