package lab12;

//**************************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
// import java.util.Scanner;
public class ComparePlayers
{
    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        // Scanner scan = new Scanner();
        //Prompt for and read in information for player 1
        player1.readPlayer();
        //Prompt for and read in information for player 2
        player2.readPlayer();
        //Compare player1 to player 2 and print a message saying
        System.out.println("Does player 1 equal player 2? " + player1.equals(player2));
        //whether they are equal
    }
}