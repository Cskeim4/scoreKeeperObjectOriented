package scorekeeper;

public class Player {
    //Declare data members
    private String name;
    private int playerScore;
    private static int winningScore;
    
    //Create constructors
    public Player(){
        name = "";
        playerScore = 0;
    }
   
    public Player(String inName){
        name = inName;
        playerScore = 0;
    }
   
    //Set-up get and set methods
    public String getName(){
        return name;
    }
    public void setName(String inName){
        name = inName;
    }
   
    public int getPlayerScore(){
        return playerScore;
    }
    public void setPlayerScore(int inPlayerScore){
        playerScore = inPlayerScore;
    }
   
    public static int winningScore(){
        return winningScore;
    }
    public static void winningScore(int inWinningScore){
        winningScore = inWinningScore;
    }
   
    //Create methods for actions within the class
    public void setNumberToAddOrSubtract(){
       
    }
    
    public void newPlayer(){
       
    }
    
    public void addPoint(){
       
    }
    
    public void subtractPoint(){
       
    }
    
    public void displayPoints(){
       
    }
    
    public void winGame(){
       
    }
    
    public void makeMenuChoice(){
       
    }
    
}

