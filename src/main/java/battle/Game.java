package battle;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public void greeting(Scanner scanner) {
        System.out.println("Player1 enter your name: ");
        player1.setName(scanner.nextLine());

        System.out.println("Player2 enter your name: ");
        player2.setName(scanner.nextLine());
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();

        greeting(scanner);

        player1.placeShips(scanner);
        player2.placeShips(scanner);


        while (!isFinished(player1, player2)) {
            while (player1.attack(scanner, player2) == 0) {
                if (isFinished(player1, player2)) {
                    return;
                }
            }
            System.out.println(player2.getName() + " , your turn!");

            while (player2.attack(scanner, player1) == 0) {
                if (isFinished(player1, player2)) {
                    return;
                }
            }
        }
        isFinished(player1, player2);
    }


    public boolean isFinished(Player player1, Player player2) {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < player1.getMyField().getCells().length; i++) {
            for (int j = 0; j < player1.getMyField().getCells()[i].length; j++) {
                if (player1.getMyField().getCells()[i][j] == Cell.DECK) {
                    counter1++;
                }
            }
        }
        for (int i = 0; i < player2.getMyField().getCells().length; i++) {
            for (int j = 0; j < player2.getMyField().getCells()[i].length; j++) {
                if (player2.getMyField().getCells()[i][j] == Cell.DECK) {
                    counter2++;
                }
            }

        }
        if (counter1 == 0 || counter2 == 0) {
            String winner = (counter1 == 0) ? player2.getName() : player1.getName();
            System.out.println("");
            System.out.println(winner.toUpperCase() + ", CONGRATULATIONS! YOU ARE THE WINNER!");
            return true;
        } else {
            return false;
        }
    }

}
