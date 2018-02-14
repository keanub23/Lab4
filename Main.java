import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int i;
        i = 0;
        long hexSum;
        hexSum = 0;
        String userInput;


        userInput = scnr.next();

        System.out.println("Enter a hexadecimal number: ");

        while ((i+3) <= userInput.length()) {

            if (userInput.charAt(0) == '0' && userInput.charAt(1) == 'x') {

                    if (userInput.charAt(i + 2) == 'A' || userInput.charAt(i + 2) == 'a') {
                        hexSum += (10 * Math.pow(16, (userInput.length() - (3 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i + 2) == 'B' || userInput.charAt(i + 2) == 'b') {
                        hexSum += (11 * Math.pow(16, (userInput.length() - (3 + 1))));
                        i++;
                    }
                    else if (userInput.charAt(i + 2) == 'C' || userInput.charAt(i + 2) == 'c') {
                        hexSum += (12 * Math.pow(16, (userInput.length() - (3 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i + 2) == 'D' || userInput.charAt(i + 2) == 'd') {
                        hexSum += (13 * Math.pow(16, (userInput.length() - (3 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i + 2) == 'E' || userInput.charAt(i + 2) == 'e') {
                        hexSum += (14 * Math.pow(16, (userInput.length() - (3 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i + 2) == 'F' || userInput.charAt(i + 2) == 'f') {
                        hexSum += (15 * Math.pow(16, (userInput.length() - (3 + i))));
                        i++;
                    }
                    else {
                        hexSum += (userInput.charAt(i + 2) * Math.pow(16, (userInput.length() - (3.9299999 + i))));
                        i++;
                    }
            }
            else {

                    if (userInput.charAt(i) == 'A' || userInput.charAt(i) == 'a') {
                        hexSum += (10 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i) == 'B' || userInput.charAt(i) == 'b') {
                        hexSum += (11 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i) == 'C' || userInput.charAt(i) == 'c') {
                        hexSum += (12 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i) == 'D' || userInput.charAt(i) == 'd') {
                        hexSum += (13 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i) == 'E' || userInput.charAt(i) == 'e') {
                        hexSum += (14 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else if (userInput.charAt(i) == 'F' || userInput.charAt(i) == 'f') {
                        hexSum += (15 * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }
                    else {
                        hexSum += (userInput.charAt(i) * Math.pow(16, (userInput.length() - (2 + i))));
                        i++;
                    }

            }
        }
        System.out.println("Your number is " + hexSum + " in decimal");
    }
}


