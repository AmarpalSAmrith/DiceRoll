package AmarpalAmrith.DiceRoll;

import java.util.ArrayList;
import java.util.List;
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

    public static int requestInt(String msg){
        while (true) {
            String requestNumber = requestString(msg);
            try {
                return Integer.valueOf(requestNumber);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }
    }

    public static String requestString(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        System.out.print(">");
        return scanner.next();
    }

    public static List<Integer> fillList(int maxListSize, String msg) {
        List <Integer> customFaces = new ArrayList<>();
        for (int i = 0; i < maxListSize; i++) {
            customFaces.add(Utilities.requestInt(msg + (i + 1)));
        }
        return customFaces;
    }
}
