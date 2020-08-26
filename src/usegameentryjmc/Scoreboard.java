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
public class Scoreboard {

    private GameEntry[] gameEntry;
    private int numOfEntries;

    public Scoreboard(int capacity) {
        gameEntry = new GameEntry[capacity];
    }

    public void addEntry(GameEntry entry) {
        int score = entry.getScore();
        if (numOfEntries < gameEntry.length
                || score > gameEntry[numOfEntries - 1].getScore()) {
            if (numOfEntries < gameEntry.length) {
                numOfEntries++;
            }

            //numOfEntries is already incremented above
            int j = numOfEntries - 1;
            //shift to right if score is lesser than the game entry
            //at specific index
            while (j > 0 && gameEntry[j - 1].getScore() < score) {
                gameEntry[j] = gameEntry[j - 1];
                j--;
            }

            gameEntry[j] = entry;
        }
    }

    public GameEntry remove(int i) throws InvalidGameEntryException {
        GameEntry temp = gameEntry[i];
        if(i > numOfEntries || i < 0){
            throw new InvalidGameEntryException();
        }
        
        int j;
        for(j = i; j < numOfEntries; j++){
            gameEntry[j] = gameEntry[j + 1];
        }
        
        gameEntry[j] = null;
        numOfEntries--;
        return temp;
    }

    @Override
    public String toString(){
        String entries = "";
        for(int g = 0; g < numOfEntries; g++){
            entries += "[" + gameEntry[g].getName() 
                    + ","+ gameEntry[g].getScore() + "]";
        }
        
        return entries;
    }
}
