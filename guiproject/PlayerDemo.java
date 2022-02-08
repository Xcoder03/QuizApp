
package guiproject;
import guiproject.Players;
import  java.sql.SQLException;



public class PlayerDemo {
    public static void main(String[] args)
    {
        try
        {
		
            Players player = new Players();
            player.setName("James Patterson");
            player.setSex("M");
          

            PlayerRespository.addPlayers(player);
            System.out.println("Player added");
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
        }

    }
    
    
    
}
