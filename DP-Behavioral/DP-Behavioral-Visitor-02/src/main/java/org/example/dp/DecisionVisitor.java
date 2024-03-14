package org.example.dp;

public interface DecisionVisitor {
    void visit(NPC npc);
    void visit(AttackStrategy attackStrategy);
    void visit(DefendStrategy defendStrategy);


}
