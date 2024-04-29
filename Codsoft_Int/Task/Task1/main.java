package Task1;

import java.util.Scanner; 

public class main{
    public static void main(String[] args){
        
        
        boolean guessednum = false;
        int attempt = 0;
        int score = 0;

        while (!guessednum && attempt < 3) {
            int rannum = (int)(Math.random() *100) + 1;

            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            System.out.println("The Random Number :" + rannum);

            if(rannum == guess){
                guessednum = true;
                score++;    
            }
            else{
                attempt++;
                if (guess > rannum) {
                    System.out.println("your guess is too high");
                    
                }
                else{
                    System.out.println("your guess is too low");
                }
                if(score>0)
                    score--;
            }
              
        }

        if(guessednum == true){
            System.out.println("Congrats You finded");
        }
        else{
            System.out.println("You ran out attempt");

        }
        System.out.println("SCORE: " + score);


    }
}
