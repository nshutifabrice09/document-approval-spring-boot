package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalAction;
import com.workflow.document_approval_spring_boot.repository.ApprovalActionRepository;
import com.workflow.document_approval_spring_boot.repository.ApprovalStageRepository;
import com.workflow.document_approval_spring_boot.repository.DocumentRepository;
import com.workflow.document_approval_spring_boot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalActionServiceImplementation implements ApprovalActionService{

    private final ApprovalActionRepository approvalActionRepository;
    private final DocumentRepository documentRepository;
    private final ApprovalStageRepository approvalStageRepository;
    private final UserRepository userRepository;

    public ApprovalActionServiceImplementation(ApprovalActionRepository approvalActionRepository, DocumentRepository documentRepository, ApprovalStageRepository approvalStageRepository, UserRepository userRepository) {
        this.approvalActionRepository = approvalActionRepository;
        this.documentRepository = documentRepository;
        this.approvalStageRepository = approvalStageRepository;
        this.userRepository = userRepository;
    }

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
