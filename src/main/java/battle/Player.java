package battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private BattleField myField;
    private BattleField enemyField;
    private ArrayList<Ship> shipTeam;

    public Player() {
        myField = new BattleField();
        enemyField = new BattleField();

        shipTeam = new ArrayList<>();

        shipTeam.add(new Ship(4));
        shipTeam.add(new Ship(3));
        shipTeam.add(new Ship(3));
        shipTeam.add(new Ship(2));
        shipTeam.add(new Ship(2));
        shipTeam.add(new Ship(2));
        shipTeam.add(new Ship(1));
        shipTeam.add(new Ship(1));
        shipTeam.add(new Ship(1));
        shipTeam.add(new Ship(1));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BattleField getMyField() {
        return myField;
    }

    public BattleField getEnemyField() {
        return enemyField;
    }

    public ArrayList<Ship> getShipTeam() {
        return shipTeam;
    }

/* Метод для отображения в консоли 2 полей перед каждой атакой: левое: результат своих атак игрока на противника (куда стрелял, кого подбил и ореол),
правое - статус поля самого игрока (корабли с подбитыми палубами и живые)
*/

    public void printFieldsStatus() {
        System.out.printf("%s %27s", "ENEMY STATUS", "MY STATUS");
        System.out.println("");
        System.out.printf("%21s %26s", "A B C D E F G H I J", "A B C D E F G H I J");
        System.out.println("");
        for (int i = 0; i < getEnemyField().getCells().length; i++) {
            int num = i + 1;
            System.out.printf("%-2d", num, "  ");
            for (int j = 0; j < getEnemyField().getCells()[i].length; j++) {
                System.out.print(getEnemyField().getCells()[i][j] + " ");
            }
            System.out.printf("%-5s", "");
            System.out.printf("%-2d", num, "  ");
            for (int j = 0; j < getMyField().getCells()[i].length; j++) {
                System.out.print(getMyField().getCells()[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void placeShips(Scanner scanner) {
        System.out.println(name + ", place the ships on the field!");

        myField.printBattleField();

        for (Ship ship : shipTeam) {
            if (ship.getDeck() > 1) {
                System.out.println("Enter the coordinate for the first deck of " + ship.getDeck() + "-deck ship: ");
                String coordinate = scanner.nextLine();
                //вот тут глупо получилось - создаю координату и передаю ей координату, но уже не успеваю исправить
                Coordinate coord1 = new Coordinate();
                coord1.coordinateToIndex(coordinate, scanner);

                System.out.println("Enter the direction for placing the field");
                System.out.println("0 - Horizontal");
                System.out.println("1 - Vertical");

                String directionEntered = scanner.nextLine();

                while (!Helper.isValidDirection(directionEntered, scanner)) {
                    System.out.println("Wrong direction! Use 0 for Horizontal, 1 for Vertical");
                    directionEntered = scanner.nextLine();

                }
                int direction = Integer.parseInt(directionEntered);

                while (!Helper.isAllowedToSetShipToField(coord1, direction, this, ship)) {
                    System.out.println("Wrong coordinate! Ship should be placed at least in one cell from another ship.");
                    System.out.println("Enter the coordinate for the first deck of " + ship.getDeck() + "-deck ship: ");
                    coordinate = scanner.nextLine();

                    System.out.println("Enter the direction for placing the field");
                    System.out.println("0 - Horizontal");
                    System.out.println("1 - Vertical");

                    coord1 = new Coordinate();
                    directionEntered = scanner.nextLine();

                    while (!Helper.isValidDirection(directionEntered, scanner)) {
                        System.out.println("Wrong direction! Use 0 for Horizontal, 1 for Vertical");
                        directionEntered = scanner.nextLine();

                    }
                    direction = Integer.parseInt(directionEntered);
                    coord1.coordinateToIndex(coordinate, scanner);
                }

                ship.setShipCoordinates(coord1, direction);

                ship.setProhibitedCoordinates(direction);

                Helper.setShipToField(myField, ship, coord1, direction);

                myField.printBattleField();

            } else {
                // для однопалубника все то же самое, только без указания направления
                System.out.println("Enter the coordinate for the first deck of " + ship.getDeck() + "-deck ship: ");

                String coordinate = scanner.nextLine();
                Coordinate coord = new Coordinate();
                coord.coordinateToIndex(coordinate, scanner);

                while (!Helper.isAllowedToSetShipToField(coord, 0, this, ship)) {
                    System.out.println("Error! Cannot place the ship to another ship or nearer than 1 cell.");
                    System.out.println("Enter the coordinate for the first deck of " + ship.getDeck() + "-deck ship: ");

                    coordinate = scanner.nextLine();
                    coord = new Coordinate();
                    coord.coordinateToIndex(coordinate, scanner);
                }

                ship.setShipCoordinates(coord, 0);

                ship.setProhibitedCoordinates(0);

                Helper.setShipToField(myField, ship, coord, 0);

                myField.printBattleField();
            }
        }
    }

    public int attack(Scanner scanner, Player player2) {
        System.out.println(getName() + ", attack! Enter the coordinate: ");

        printFieldsStatus();

        String coordinate = scanner.nextLine();

        Coordinate coord = new Coordinate();

        coord.coordinateToIndex(coordinate, scanner);

        if (player2.getMyField().getCells()[coord.getNumeric()][coord.getAlphabetical()] == Cell.DECK) {
            enemyField.setCellValue(coord.getNumeric(), coord.getAlphabetical(), Cell.KILLED);
            player2.getMyField().setCellValue(coord.getNumeric(), coord.getAlphabetical(), Cell.KILLED);
            System.out.println("You hit!");

            for (Ship ship : player2.getShipTeam()) {
                for (int i = 0; i < ship.getDeck(); i++) {
                    if ((ship.getCoordinates()[0][i] == coord.getNumeric()) && (ship.getCoordinates()[1][i] == coord.getAlphabetical())) {
                        ship.setAliveDeckCounter(ship.getAliveDeckCounter() - 1);
                        if (ship.isAlive()) {
                            System.out.println("The ship is damaged!");
                        } else {
                            System.out.println("The ship is killed!");
                            enemyField.setAreolAroundShip(ship, this);
                        }
                    }
                }
            }

            return 0;
        } else if (player2.getMyField().getCells()[coord.getNumeric()][coord.getAlphabetical()] == Cell.KILLED) {
            System.out.println("This deck is already killed!");
            return 1;
        } else {
            enemyField.setCellValue(coord.getNumeric(), coord.getAlphabetical(), Cell.MISSED);
            System.out.println("You missed!");
            return 1;
        }

    }
}