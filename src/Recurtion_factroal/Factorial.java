package Recurtion_factroal;

public class Factorial {

    int  recursion(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else {
            return num*recursion(num-1);
        }
    }
}
