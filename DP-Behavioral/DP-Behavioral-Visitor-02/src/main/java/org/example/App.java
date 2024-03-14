package org.example;

import org.example.dp.AttackStrategy;
import org.example.dp.DecisionVisitor;
import org.example.dp.DefendStrategy;
import org.example.dp.NPC;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NPC enemy= new NPC("attack");
        DecisionVisitor attack = new AttackStrategy();
        DecisionVisitor defend = new DefendStrategy();

        enemy.accept(defend);
        enemy.accept(attack);
        enemy.accept(defend);
        enemy.accept(attack);
    }
}
