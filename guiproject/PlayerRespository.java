
package guiproject;
import guiproject.Players;
import java.sql.*;
import java.util.*;

public class PlayerRespository {
     private static final String DB_URL =  "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Maths_Legend;integratedSecurity=true";
     public static List<Players> getPlayer() throws SQLException{
         
        Connection con = DriverManager.getConnection(DB_URL);
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Player");
        List<Players> players = new ArrayList<>();
        
        while(resultSet.next())
        {
            Players player = new Players();
            player.setId(resultSet.getInt("ID"));
            player.setName(resultSet.getString("Name"));
            player.setSex(resultSet.getString("Sex"));
           
         

            players.add(player);
        }
        
           statement.close();
           con.close();

        return players;
         
     }
     
     
    public static void addPlayers(Players player) throws SQLException
    {
        String query = "INSERT INTO Player(Name, Sex) "
                + "VALUES(?, ?)";

        try(Connection con = DriverManager.getConnection(DB_URL);
            PreparedStatement statement = con.prepareStatement(query))
        {
            statement.setString(1, player.getName());
            statement.setString(2, player.getSex());
       
            

            statement.executeUpdate();
        }
    }
    
}
