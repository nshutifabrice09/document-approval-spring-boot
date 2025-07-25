package com.workflow.document_approval_spring_boot.service;

import com.workflow.document_approval_spring_boot.model.Attachment;
import com.workflow.document_approval_spring_boot.model.Document;
import com.workflow.document_approval_spring_boot.model.User;
import com.workflow.document_approval_spring_boot.repository.AttachmentRepository;
import com.workflow.document_approval_spring_boot.repository.DocumentRepository;
import com.workflow.document_approval_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImplementation implements AttachmentService{

    private final AttachmentRepository attachmentRepository;
    private final DocumentRepository documentRepository;
    private final UserRepository userRepository;

    @Autowired
    public AttachmentServiceImplementation(AttachmentRepository attachmentRepository, DocumentRepository documentRepository, UserRepository userRepository) {
        this.attachmentRepository = attachmentRepository;
        this.documentRepository = documentRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Attachment> attachmentList() {
        return attachmentRepository.findAll();
    }

    @Override
    public Attachment getAttachmentById(Long id) {
        return attachmentRepository.findAttachmentById(id);
    }

    @Override
    public Attachment saveAttachment(Attachment attachment, Long documentId, Long uploadedBy) {
        Document document = documentRepository.findDocumentById(documentId);
        User user = userRepository.findUserById(uploadedBy);
        attachment.setDocument(document);
        attachment.setUploadedBy(user);
        return attachmentRepository.save(attachment);
    }

    @Override
    public Attachment updateAttachment(Long id, Attachment attachment) {
        Attachment existAttachment = attachmentRepository.findAttachmentById(id);
        if(existAttachment != null){
            existAttachment.setFileType(attachment.getFileType());
            existAttachment.setFileType(attachment.getFileType());
            existAttachment.setSize(attachment.getSize());
            existAttachment.setUploadedAt(attachment.getUploadedAt());
            return attachmentRepository.save(existAttachment);
        }
        return null;
    }

    @Override
    public void removeAttachment(Long id) {
        attachmentRepository.deleteById(id);
    }
}
