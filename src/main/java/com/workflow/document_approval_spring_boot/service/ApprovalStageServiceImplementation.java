package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalStage;
import com.workflow.document_approval_spring_boot.model.Workflow;
import com.workflow.document_approval_spring_boot.repository.ApprovalStageRepository;
import com.workflow.document_approval_spring_boot.repository.WorkflowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalStageServiceImplementation implements ApprovalStageService{

    private final ApprovalStageRepository approvalStageRepository;
    private final WorkflowRepository workflowRepository;

    public ApprovalStageServiceImplementation(ApprovalStageRepository approvalStageRepository, WorkflowRepository workflowRepository) {
        this.approvalStageRepository = approvalStageRepository;
        this.workflowRepository = workflowRepository;
    }

    @Override
    public List<ApprovalStage> approvalStageList() {
        return approvalStageRepository.findAll();
    }

    @Override
    public ApprovalStage getApprovalStageById(Long id) {
        return approvalStageRepository.findApprovalStageById(id);
    }

    @Override
    public ApprovalStage saveApprovalStage(ApprovalStage approvalStage, Long workflowId) {
        Workflow workflow = workflowRepository.findWorkflowById(workflowId);
        approvalStage.setWorkflow(workflow);
        return approvalStageRepository.save(approvalStage);
    }

    @Override
    public ApprovalStage updateApprovalStage(Long id, ApprovalStage approvalStage) {
        ApprovalStage existApprovalStage = approvalStageRepository.findApprovalStageById(id);
        if(existApprovalStage != null ){
            existApprovalStage.setStageName(approvalStage.getStageName());
            existApprovalStage.setStageOrder(approvalStage.getStageOrder());
            existApprovalStage.setRequiredRole(approvalStage.getRequiredRole());
            existApprovalStage.setApproverType(approvalStage.getApproverType());
            existApprovalStage.setDeadlineInDays(approvalStage.getDeadlineInDays());
            existApprovalStage.setAutoApproveAfterDeadline(approvalStage.isAutoApproveAfterDeadline());
            existApprovalStage.setEscalationRule(approvalStage.getEscalationRule());
            return approvalStageRepository.save(existApprovalStage);
        }
        return null;
    }

    @Override
    public void removeApprovalStage(Long id) {
        approvalStageRepository.deleteById(id);
    }
}
