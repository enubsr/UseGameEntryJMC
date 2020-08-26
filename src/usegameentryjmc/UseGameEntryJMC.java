/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usegameentryjmc;

/**
 *
 * @author Enubs
 */
public class UseGameEntryJMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameEntry g1 = new GameEntry("Mike", 1105);
        GameEntry g2 = new GameEntry("Rob", 750);
        GameEntry g3 = new GameEntry("Paul", 720);
        GameEntry g4 = new GameEntry("Anna", 660);
        GameEntry g5 = new GameEntry("Rose", 590);
        GameEntry g6 = new GameEntry("Jack", 510);
        GameEntry g7 = new GameEntry("Jill", 740);
        
        Scoreboard scoreboard = new Scoreboard(10);
        scoreboard.addEntry(g1);
        scoreboard.addEntry(g2);
        scoreboard.addEntry(g3);
        scoreboard.addEntry(g4);
        scoreboard.addEntry(g5);
        scoreboard.addEntry(g6);
        scoreboard.addEntry(g7);
        scoreboard.remove(3);
        System.out.print(scoreboard);
    }

}
