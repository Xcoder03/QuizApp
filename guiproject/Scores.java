/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

/**
 *
 * @author DJ FB
 */
public class Scores {
    private String names;
    private int scores = 0 ;
    
    public  Scores(){
    
  }
    
     public String getName() {
        return names;
    }

    public void setName(String name) {
        this.names = name;
    }
    
    public int getScores(){
      return scores;
    }
    
    public void setScores(int count){
        this.scores = count;
    }
    
       @Override
    public String toString() {
          return String.format("Player: %s%nScores: %d ", names,scores);
    }
    
    

  
    
    
    
    
    
}
