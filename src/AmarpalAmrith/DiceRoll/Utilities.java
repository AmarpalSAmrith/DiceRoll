package AmarpalAmrith.DiceRoll;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
    public static void welcomeMsg(String msg) {
        System.out.println(msg);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            s.append("=");
        }
        System.out.println(s.toString());
    }
    public static int diceRoll(){
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(6) + 1;
    }
    public static int requestInt(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        System.out.print(">");
        return scanner.nextInt();
    }
}
