
import java.io.IOException;
import java.io.PrintWriter;
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
public class UpdatePlayer extends HttpServlet{
    
    Player player;
            
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws IOException{

        
        String key = request.getParameter("key");
        HttpSession session=request.getSession(true);  
                
        player = new Player(session.getId());

        //update player direction
        player.setDirection(key);
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,response);
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println(request.getParameter("key"));            
        }   
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException{
        
        //send player id and start position to player in the start
        
        processRequest(request,response);
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            out.println(player.previousDirection);
        }   
        
    }
    
}
