package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.AuditLog;
import com.workflow.document_approval_spring_boot.model.User;
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
        return auditLogRepository.findAll();
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return auditLogRepository.findAuditLogById(id);
    }
    @Override
    public AuditLog saveAuditLog(AuditLog auditLog, Long performedBy) {
        User user = userRepository.findUserById(performedBy);
        auditLog.setPerformedBy(user);
        return auditLogRepository.save(auditLog);
    }

    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        AuditLog existAuditLog = auditLogRepository.findAuditLogById(id);
        if(existAuditLog != null){
            existAuditLog.setEntityType(auditLog.getEntityType());
            existAuditLog.setEntityId(auditLog.getEntityId());
            existAuditLog.setAction(auditLog.getAction());
            existAuditLog.setTimestamp(auditLog.getTimestamp());
            existAuditLog.setDetails(auditLog.getDetails());
            return auditLogRepository.save(existAuditLog);
        }
        return null;
    }

    @Override
    public void removeAuditLog(Long id) {
        auditLogRepository.deleteById(id);
    }
}
