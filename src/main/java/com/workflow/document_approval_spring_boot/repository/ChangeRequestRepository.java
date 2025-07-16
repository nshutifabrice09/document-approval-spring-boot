package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.ChangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRequestRepository extends JpaRepository<ChangeRequest, Long> {
}
