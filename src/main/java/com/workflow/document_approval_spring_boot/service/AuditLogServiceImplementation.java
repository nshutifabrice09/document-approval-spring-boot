package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.AuditLog;
import com.workflow.document_approval_spring_boot.repository.AuditLogRepository;
import com.workflow.document_approval_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{
    private final AuditLogRepository auditLogRepository;
    private final UserRepository userRepository;

    @Autowired
    public AuditLogServiceImplementation(AuditLogRepository auditLogRepository, UserRepository userRepository) {
        this.auditLogRepository = auditLogRepository;
        this.userRepository = userRepository;
    }
    
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
