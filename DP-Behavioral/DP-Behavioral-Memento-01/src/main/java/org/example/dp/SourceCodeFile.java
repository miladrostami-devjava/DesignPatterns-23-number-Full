package org.example.dp;

public class SourceCodeFile {

    private String content;

    public SourceCodeFile(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //memento :
    public Commit add(){
        return new Commit(content);
    }

    public void rollBack(Commit commit){
        content = commit.getContent();
    }




}
