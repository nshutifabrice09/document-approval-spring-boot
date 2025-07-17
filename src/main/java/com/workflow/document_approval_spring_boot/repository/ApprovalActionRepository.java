package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.ApprovalAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalActionRepository extends JpaRepository <ApprovalAction, Long> {
    ApprovalAction findApprovalActionById(Long id);
}
