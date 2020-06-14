package geesePlateStart;

import java.util.Scanner;
import java.util.Random;

public class geesePlateStart {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoi! Jij gaat Ganzenbord spelen! Vul alsjeblieft je naam in. ");
        String naam = scanner.nextLine();
        System.out.print("Welkom, " + naam + "! Je staat momenteel op start. Gooi je dobbelsteen (g) ");

        int winnerGeesePlate = 0;
        int sum = 0;

        while (winnerGeesePlate == 0) {
            char gIngedrukt = scanner.next().charAt(0);
            if (gIngedrukt == 'g') {

                Random dobbelsteen = new Random();
                int nummer = 1 + dobbelsteen.nextInt(6);
                sum = nummer + sum;
                System.out.println("Je hebt " + nummer + " gegooid. Je staat nu dus op vakje " + sum + ".");

                if (sum == 23) {
                    System.out.println(naam + ", je hebt verloren. Maar onthoud: het pad des acceptaties is een rustgevend pad. ");
                    winnerGeesePlate++;
                }
                if (sum >= 63) {
                    System.out.println(naam + ", je hebt gewonnen!");
                    winnerGeesePlate++;
                }
                if (sum == 25 || sum == 45) {
                    System.out.println("Let wel: bij 25 en 45 moet je terug naar het startpunt. Je begint dus nu vanaf het begin.");
                    sum = sum - sum;
                }
                if (sum % 10 == 0 && sum != 0) {
                    sum = sum + nummer;
                    System.out.println("Dat is een tiental. Je loopt nu het geworpen aantal nogmaals. Je staat nu dus op vakje nummer " + sum + ".");

                }
            }
        }
    }
}
