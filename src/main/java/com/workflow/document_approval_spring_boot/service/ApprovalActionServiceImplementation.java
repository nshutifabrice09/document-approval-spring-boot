package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalAction;
import com.workflow.document_approval_spring_boot.model.ApprovalStage;
import com.workflow.document_approval_spring_boot.model.Document;
import com.workflow.document_approval_spring_boot.model.User;
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
        return approvalActionRepository.findAll();
    }

    @Override
    public ApprovalAction getApprovalActionById(Long id) {
        return approvalActionRepository.findApprovalActionById(id);
    }

    @Override
    public ApprovalAction saveApprovalAction(ApprovalAction approvalAction, Long documentId, Long stageId, Long actionByUserId) {
        Document document = documentRepository.findDocumentById(documentId);
        ApprovalStage approvalStage = approvalStageRepository.findApprovalStageById(stageId);
        User user = userRepository.findUserById(actionByUserId);
        approvalAction.setDocument(document);
        approvalAction.setStage(approvalStage);
        approvalAction.setActionBy(user);
        return approvalActionRepository.save(approvalAction);
    }

    @Override
    public ApprovalAction updateApprovalAction(Long id, ApprovalAction approvalAction) {
        ApprovalAction existApprovalAction = approvalActionRepository.findApprovalActionById(id);
        if(existApprovalAction != null){
            existApprovalAction.setActionType(approvalAction.getActionType());
            existApprovalAction.setComments(approvalAction.getComments());
            existApprovalAction.setAttachments(approvalAction.getAttachments());
            existApprovalAction.setActionTimestamp(approvalAction.getActionTimestamp());
            return approvalActionRepository.save(existApprovalAction);
        }
        return null;
    }

    @Override
    public void removeApprovalAction(Long id) {
        approvalActionRepository.deleteById(id);
    }
}
