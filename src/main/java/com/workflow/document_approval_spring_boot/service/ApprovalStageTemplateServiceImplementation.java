package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalStageTemplate;
import com.workflow.document_approval_spring_boot.model.Workflow;
import com.workflow.document_approval_spring_boot.repository.ApprovalStageTemplateRepository;
import com.workflow.document_approval_spring_boot.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalStageTemplateServiceImplementation implements ApprovalStageTemplateService{

    private final ApprovalStageTemplateRepository approvalStageTemplateRepository;
    private final WorkflowRepository workflowRepository;

    @Autowired
    public ApprovalStageTemplateServiceImplementation(ApprovalStageTemplateRepository approvalStageTemplateRepository, WorkflowRepository workflowRepository) {
        this.approvalStageTemplateRepository = approvalStageTemplateRepository;
        this.workflowRepository = workflowRepository;
    }

    @Override
    public List<ApprovalStageTemplate> approvalStageTemplateList() {
        return approvalStageTemplateRepository.findAll();
    }

    @Override
    public ApprovalStageTemplate getApprovalStageTemplateById(Long id) {
        return approvalStageTemplateRepository.findApprovalStageTemplateById(id);
    }

    @Override
    public ApprovalStageTemplate saveApprovalStageTemplate(ApprovalStageTemplate approvalStageTemplate, Long workflowId) {
        Workflow workflow = workflowRepository.findWorkflowById(workflowId);
        approvalStageTemplate.setWorkflow(workflow);
        return approvalStageTemplateRepository.save(approvalStageTemplate);
    }

    @Override
    public ApprovalStageTemplate updateApprovalStageTemplate(Long id, ApprovalStageTemplate approvalStageTemplate) {
        ApprovalStageTemplate existApprovalStageTemplate = approvalStageTemplateRepository.findApprovalStageTemplateById(id);
        if(existApprovalStageTemplate != null) {
            existApprovalStageTemplate.setName(approvalStageTemplate.getName());
            existApprovalStageTemplate.setSequence(approvalStageTemplate.getSequence());
            existApprovalStageTemplate.setRoleRequired(approvalStageTemplate.getRoleRequired());
            return approvalStageTemplateRepository.save(existApprovalStageTemplate);
        }
        return null;
    }

    @Override
    public void removeApprovalStageTemplate(Long id) {
        approvalStageTemplateRepository.deleteById(id);
    }
}
