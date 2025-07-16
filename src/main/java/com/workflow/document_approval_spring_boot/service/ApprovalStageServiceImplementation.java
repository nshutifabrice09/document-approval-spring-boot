package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalStage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalStageServiceImplementation implements ApprovalStageService{
    @Override
    public List<ApprovalStage> approvalStageList() {
        return null;
    }

    @Override
    public ApprovalStage getApprovalStageById(Long id) {
        return null;
    }

    @Override
    public ApprovalStage saveApprovalStage(ApprovalStage approvalStage, Long workflowId) {
        return null;
    }

    @Override
    public ApprovalStage updateApprovalStage(Long id, ApprovalStage approvalStage) {
        return null;
    }

    @Override
    public void removeApprovalStage(Long id) {

    }
}
