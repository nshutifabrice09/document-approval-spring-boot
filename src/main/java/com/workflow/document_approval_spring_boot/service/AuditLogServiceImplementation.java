package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.AuditLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{
    @Override
    public List<AuditLog> auditLogList() {
        return null;
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return null;
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog, Long performedBy) {
        return null;
    }

    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        return null;
    }

    @Override
    public void removeAuditLog(Long id) {

    }
}
