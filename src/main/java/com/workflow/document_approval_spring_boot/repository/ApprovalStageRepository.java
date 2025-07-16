package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.ApprovalStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalStageRepository extends JpaRepository <ApprovalStage, Long> {
    ApprovalStage findApprovalStageById(Long id);
}
