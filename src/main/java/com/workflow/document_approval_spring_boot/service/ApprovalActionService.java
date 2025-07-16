package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalAction;

import java.util.List;

public interface ApprovalActionService {
    List<ApprovalAction> approvalActionsList();
    ApprovalAction getApprovalActionById(Long id);
    ApprovalAction saveApprovalAction(ApprovalAction approvalAction, Long documentId, Long stageId, Long actionByUserId);
    ApprovalAction updateApprovalAction(Long id, ApprovalAction approvalAction);
    void removeApprovalAction(Long id);
}
