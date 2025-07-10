package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalStage;

import java.util.List;

public interface ApprovalStageService {
    List<ApprovalStage> approvalStageList();
    ApprovalStage getApprovalStageById(Long id);
    ApprovalStage saveApprovalStage (ApprovalStage approvalStage, Long documentID, Long approverId);
    ApprovalStage updateApprovalStage(Long id, ApprovalStage approvalStage);
    void removeApprovalStage (Long id);
}
