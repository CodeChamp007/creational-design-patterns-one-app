package com.example.productCustomizer.prototype;

import java.util.HashMap;
import java.util.Map;

public class TemplateRegistry {

    public static final Map<String, DocumentTemplate> templates = new HashMap<>();

    static {
        templates.put("invoice", new DocumentTemplate("Invoice", "Billing Details", "Company Name"));
        templates.put("resume", new DocumentTemplate("Resume", "Work Experience", "Contact Info"));
        templates.put("proposal", new DocumentTemplate("Proposal", "Project Outline", "Client Signature"));
    }

    public static  DocumentTemplate getTemplate(String type) {
        DocumentTemplate template = templates.get(type);
        return template != null ? template.clone() : null;
    }
}
