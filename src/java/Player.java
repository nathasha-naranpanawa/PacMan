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
    
    private String playerId,name;
    int positionX, positionY;
    Direction previousDirection;
    
    public enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT,
        STAY;    
    }
    
    public Player(String id){
        this.playerId = id;
    }
    
    //set the direction the player moved according to the keys pressed
    public Direction setDirection(String input){
        
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
        
        return direction;
    
    }  
    
    //update current position
    public void setPosition(){}
    
    public void getPosition(){}
    
    public void getDirection(){}
    
    //get unique player id
    public void getId(){}
    
}
