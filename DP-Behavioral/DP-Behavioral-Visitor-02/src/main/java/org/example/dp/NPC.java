package org.example.dp;

public class NPC {
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void accept(DecisionVisitor visitor){
        visitor.visit(this);
    }
}
