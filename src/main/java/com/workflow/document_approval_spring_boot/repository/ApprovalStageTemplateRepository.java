package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.ApprovalStageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalStageTemplateRepository extends JpaRepository <ApprovalStageTemplate, Long> {
    ApprovalStageTemplate findApprovalStageTemplateById(Long id);
}
