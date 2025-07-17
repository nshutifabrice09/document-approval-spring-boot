package com.workflow.document_approval_spring_boot.repository;

import com.workflow.document_approval_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findUserById(Long actionByUserId);
}
