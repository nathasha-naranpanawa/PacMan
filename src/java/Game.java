
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathasha
 */
public class Game {
    
    public Game(){}
    
    HashMap<String,String> players = new HashMap<String,String>(); //table
        
    public void setUpPlayer(HttpServletRequest request,
                     HttpServletResponse response){
        
        String playername = request.getParameter("user");
        
        Player player;
        HttpSession session=request.getSession(false);  
        
        if(session!=null){  
            //if player already exists
        }  
        else{
            session=request.getSession(true);
            player = new Player(session.getId());
            session.setAttribute("name",playername) ;
            session.setAttribute("id",session.getId());
            
            //add player to table
            players.put(player.playerId,"UP");
            
            //add player's position and current direction to the table
        }  
       
    }
    
    //return all player positions' coordinates to UpdateGame servlet
    public void getAllPositions(){}
    
    //update players' current direction
    public void updateDirection(){
        //for each player, request direction and update from Player properties
    }
    
    //update table with current position every 100ms
    public void updatePosition(){
    
        //according to the last direction,update position
    }
    
    
}
