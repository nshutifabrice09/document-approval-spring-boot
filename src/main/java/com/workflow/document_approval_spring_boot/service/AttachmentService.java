package com.workflow.document_approval_spring_boot.service;


import com.workflow.document_approval_spring_boot.model.Attachment;

import java.util.List;

public interface AttachmentService {
    List<Attachment> attachmentList();
    Attachment getAttachmentById(Long id);
    Attachment saveAttachment(Attachment attachment, Long documentId, Long uploadedBy);
    Attachment updateAttachment(Long id, Attachment attachment);
    void removeAttachment (Long id);
}
