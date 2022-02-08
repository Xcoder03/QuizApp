/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DJ FB
 */
public class ScoreRespository {
    
         private static final String DB_URL =  "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Maths_Legend;integratedSecurity=true";
     public static List<Scores> getScore() throws SQLException{
         
        Connection con = DriverManager.getConnection(DB_URL);
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Score");
        List<Scores> scores = new ArrayList<>();
        
        while(resultSet.next())
        {
            Scores score = new Scores();
            score.setName(resultSet.getString("Username"));
            score.setScores(resultSet.getInt("Score"));
           
         

            scores.add(score);
        }
        
           statement.close();
           con.close();

        return scores;
         
     }
     
     
    public static void addScores(Scores score) throws SQLException
    {
        String query = "INSERT INTO Score(Username, Score) "
                + "VALUES(?, ?)";

        try(Connection con = DriverManager.getConnection(DB_URL);
            PreparedStatement statement = con.prepareStatement(query))
        {
            statement.setString(1, score.getName());
            statement.setInt(2, score.getScores());
       
            

            statement.executeUpdate();
        }
    }
    
}
