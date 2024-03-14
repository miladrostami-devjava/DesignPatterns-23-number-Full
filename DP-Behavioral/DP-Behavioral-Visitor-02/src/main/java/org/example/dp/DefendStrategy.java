package org.example.dp;

public class DefendStrategy implements DecisionVisitor{

    @Override
    public void visit(NPC npc) {
        System.out.println("defending strategy the player!");
    }

    @Override
    public void visit(AttackStrategy attackStrategy) {
        System.out.println("switching to defending strategy!");
    }

    @Override
    public void visit(DefendStrategy defendStrategy) {
        System.out.println("defending strategy in done!");
    }
}
