package com.example.productCustomizer.prototype;

public class DocumentTemplate implements Cloneable {
    private String title;
    private String body;
    private String footer;

    public DocumentTemplate(String title, String body, String footer) {
        this.title = title;
        this.body = body;
        this.footer = footer;
    }

    public DocumentTemplate clone() {
        try {
            return (DocumentTemplate) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public String getFullContent() {
        return "Title: " + title + "\nBody: " + body + "\nFooter: " + footer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
