
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
public class UpdateGame extends HttpServlet{
    
    Game game = new Game();
    int playerCount =0;
    
    @Override
    protected void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        while(playerCount<=2){
            game.setUpPlayer(request,response);
            
        }
        //create individual player objects
        //send player all positions of all players
    }
    
}
