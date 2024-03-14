package org.example;

public class TextDocument implements Cloneable{
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public TextDocument clone() {
        try {
            TextDocument clone = (TextDocument) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

            clone.content = this.content;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
