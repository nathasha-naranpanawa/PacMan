
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
    
    HashMap<Integer,String> players = new HashMap<Integer,String>(); //table
    int playerCount =0;
    
    public void setUpPlayer(HttpServletRequest request,
                     HttpServletResponse response){
        String playername = request.getParameter("user");
        
        
        HttpSession session = request.getSession();
        if (session == null){
            session = request.getSession(true);
            Player player = new Player(session.getId());
            //add player to table
        }        
    }
    
    public void waitForPlayers(HttpServletRequest request,
                     HttpServletResponse response){
        while(playerCount<5){
            setUpPlayer(request,response);
            playerCount++;
            
        }
    
    }
    
    //return all player positions' coordinates to UpdateGame servlet
    public void getAllPositions(){}
    
    //update players' current direction
    public void updateDirection(){
        //for each player, request direction and update
    }
    
    //update table with current position every 100ms
    public void updatePosition(){
    
        //according to the last direction,update position
    }
    
    
}
