package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.ApprovalStageTemplate;

import java.util.List;

public interface ApprovalStageTemplateService {
    List<ApprovalStageTemplate> approvalStageTemplateList();
    ApprovalStageTemplate getApprovalStageTemplateById(Long id);
    ApprovalStageTemplate saveApprovalStageTemplate(ApprovalStageTemplate approvalStageTemplate, Long workflowId);
    ApprovalStageTemplate updateApprovalStageTemplate(Long id, ApprovalStageTemplate approvalStageTemplate);
    void removeApprovalStageTemplate(Long id);

}
