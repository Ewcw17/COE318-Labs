package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {     
        System.out.println("You hold: " + game.getYourCards() + "\n");
        System.out.println("The house holds: " + game.getHouseCards() + "\n");
    }

  @Override
    public boolean hitMe() {
        System.out.println("Would you like to draw another card? (Yes/No)");
        String input = user.nextLine();
        if(input.equals("Yes")){
            return true;
        }
        return false;
    }

  @Override
    public void gameOver() {
        int hs =  game.score(game.getHouseCards());
        int ys = game.score(game.getYourCards());
        System.out.println("You hold: " + game.getYourCards());
        System.out.println("the house holds: " + game.getHouseCards());
        System.out.println("The house's score was: " + hs);
        System.out.println("Your score was: " + ys);
        if ((ys > 21) || (ys == hs)){
            System.out.println("The house wins");
        }else if((ys > hs && ys <= 21) || (hs > 21)){
            System.out.println("You are the winner");
        }else if((ys < 21) && (hs < 21)){
            if(ys > hs){
                System.out.println("You are the winner");
            }else if(hs > ys){
                System.out.println("The house wins");
            }
        }else if(((ys == 21) && (hs == 21)) || ((ys > 21) && (hs > 21))){
            System.out.println("The game is a draw");
        
    }
    }

}