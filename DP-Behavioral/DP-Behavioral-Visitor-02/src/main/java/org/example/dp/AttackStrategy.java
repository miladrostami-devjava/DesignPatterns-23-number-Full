package org.example.dp;

public class AttackStrategy implements DecisionVisitor {
    @Override
    public void visit(NPC npc) {
        System.out.println(npc.getName()+ "is attacking the player!");
    }

    @Override
    public void visit(AttackStrategy attackStrategy) {
        System.out.println("attacking is already done!");
    }

    @Override
    public void visit(DefendStrategy defendStrategy) {
        System.out.println("switching to attack strategy! ");
    }
}
