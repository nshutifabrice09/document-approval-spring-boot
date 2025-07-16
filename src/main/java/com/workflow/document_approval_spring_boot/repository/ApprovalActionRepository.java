package com.workflow.document_approval_spring_boot.repository;

import ch.qos.logback.core.joran.action.AppenderAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalActionRepository extends JpaRepository <AppenderAction, Long> {
}
