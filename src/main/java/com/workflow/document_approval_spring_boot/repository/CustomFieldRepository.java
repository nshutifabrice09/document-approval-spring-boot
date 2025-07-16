package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.CustomField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldRepository extends JpaRepository<CustomField, Long> {
}
