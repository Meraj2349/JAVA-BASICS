package Number_game;

public class Game {
    int userNumber ;
     int comNumber;
     int count = 0;
     public Game()
     {
        comNumber= (int) (Math.random()*100);
     }

    public void SetNumber(int n)
     {
           userNumber=n;
     }

     public int isCorrectNumber()
     {
         if (userNumber>comNumber) {return 1;}
         else if (userNumber<comNumber) { return-1;}
         else return 0;
     }

     public void SetCounter()
     {
         count++;
     }
}
