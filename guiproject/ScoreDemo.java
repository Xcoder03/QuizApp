/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.sql.SQLException;

/**
 *
 * @author DJ FB
 */
public class ScoreDemo {
    
        public static void main(String[] args)
    {
        try
        {
		
            Scores score = new Scores();
            score.getName();
            score.getScores();
          

            NewScoreRespository.getScore();
            System.out.println("Score added");
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
        }

    }
    
}
