import java.util.*;
import java.lang.*;
import java.io.*;

class MinimalistGame{

    public static String wordGenerator(){
        String[] arr = {"Apple", "Ball", "Cat", "Dog","Elon","Fries","Games","Hover","Inbox","Joker"};
        int i = arr.length;
        i--;
        //System.out.println(i);
        int randomNum = 0+(int)(Math.random()*((i-0)+1));
        // System.out.println(0+(int)(Math.random()*((i-0)+1)));
        return arr[randomNum];
    }

    public static int letterChecker(String computer, String human){

        if(computer.equals(human)){
            return 1;
        }

        int checker = 0;

        for(int i=0;i<human.length();i++){
            for(int j=0;j<computer.length();j++){
                if(human.charAt(i)==computer.charAt(j) && i==j){
                    System.out.print(human.charAt(i)+" ");
                    checker=1;
                } else if(human.charAt(i)==computer.charAt(j) && i!=j){
                    System.out.print("~"+human.charAt(i)+" ");
                    checker=1;
                }
            }
            if(checker==0){
                System.out.print(" _ ");
            }
            checker=0;
        }
        return 0;
    }

    public static void main(String args[]){
        String wordGenerated = wordGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.println("The Size of the word is: "+wordGenerated.length());

        int gotcha = 0;
        System.out.println("Guess The Word");

        while(gotcha==0){
            String str = sc.next();
            gotcha = letterChecker(wordGenerated,str);
            if(gotcha==1){
                System.out.println("Correct Answer");
                System.exit(0);
            }
            System.out.println("\nTry Again");
        }
    }
}