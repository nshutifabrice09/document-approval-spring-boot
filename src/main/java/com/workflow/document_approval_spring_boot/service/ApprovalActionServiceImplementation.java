package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalAction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalActionServiceImplementation implements ApprovalActionService{
    @Override
    public List<ApprovalAction> approvalActionsList() {
        return null;
    }

    @Override
    public ApprovalAction getApprovalActionById(Long id) {
        return null;
    }

    @Override
    public ApprovalAction saveApprovalAction(ApprovalAction approvalAction, Long documentId, Long stageId, Long actionByUserId) {
        return null;
    }

    @Override
    public ApprovalAction updateApprovalAction(Long id, ApprovalAction approvalAction) {
        return null;
    }

    @Override
    public void removeApprovalAction(Long id) {

    }
}
