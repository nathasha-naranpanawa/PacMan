/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathasha
 */
public class Player {
    
    public String playerId,name;
    Direction previousDirection;
    
    public enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT,
        STAY;    
    }
    
    public Player(){}
    
    public Player(String id){
        this.playerId = id;
    }
    
    //set the direction the player moved according to the keys pressed
    public void setDirection(String input){
        
        Direction direction;
        
        switch (input) {
            case "37":
            case "65":
                direction = Direction.LEFT;
                break;
            case "38":
            case "87":
                direction = Direction.UP;
                break;
            case "39":
            case "68":
                direction = Direction.RIGHT;
                break;
            case "40":
            case "83":
                direction = Direction.DOWN;
                break;
            default:
                direction = Direction.STAY;
                break;
        }
        
        if (direction != previousDirection){
            previousDirection = direction;
        }
    }  
   
    public Direction getDirection(){
        return this.previousDirection;
    }
    
    public void setPlayerId(String id){
        playerId = id;    
    }
    //get unique player id
    public String getId(String playerId){
        if (this.playerId.equals(playerId)){return this.playerId;}
        return null;
    }
    
}
