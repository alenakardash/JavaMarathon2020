package battle;

import java.util.Scanner;

public class Helper {

    public static boolean isValidDirection(String directionEntered, Scanner scanner) {
        try {
            int direction = Integer.parseInt(directionEntered);
            if (direction != 0 && direction != 1) {
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong direction! Letters are not allowed. Use 0 for Horizontal, 1 for Vertical");
            return false;
        }
    }

    public static void setShipToField(BattleField battleField, Ship ship, Coordinate coordinate, int destination) {
        if (destination == 0) {
            for (int i = 0; i < ship.getDeck(); i++) {
                battleField.getCells()[coordinate.getNumeric()][coordinate.getAlphabetical() + i] = Cell.DECK;
            }
        } else {
            for (int i = 0; i < ship.getDeck(); i++) {
                battleField.getCells()[coordinate.getNumeric() + i][coordinate.getAlphabetical()] = Cell.DECK;
            }
        }

    }

    public static boolean isAllowedToSetShipToField(Coordinate coordinate, int destination, Player player, Ship ship) {
        if (destination == 0) {
            if (coordinate.getAlphabetical() + (ship.getDeck() - 1) < 10) {
                for (int i = 0; i < ship.getDeck(); i++) {
                    for (Ship eachShip : player.getShipTeam()) {
                        for (int j = 0; j < eachShip.getProhibitedCoordinates()[0].length; j++) {
                            if (eachShip.getProhibitedCoordinates()[0][j] == coordinate.getNumeric()) {
                                if (eachShip.getProhibitedCoordinates()[1][j] == coordinate.getAlphabetical() + i) {
                                    System.out.println("Set your ship at least in one cell from another ship");
                                    return false;
                                }
                            }
                        }

                    }
                }
            } else {
                System.out.println("The ship is too long to fit to the field. Correct the start coordinate or direction");
                return false;
            }
        } else {
            if (coordinate.getNumeric() + (ship.getDeck() - 1) < 10) {
                for (int i = 0; i < ship.getDeck(); i++) {
                    for (Ship eachShip : player.getShipTeam()) {
                        for (int j = 0; j < eachShip.getProhibitedCoordinates()[0].length; j++) {
                            if (eachShip.getProhibitedCoordinates()[0][j] == coordinate.getNumeric() + i) {
                                if (eachShip.getProhibitedCoordinates()[1][j] == coordinate.getAlphabetical()) {
                                    System.out.println("Set your ship at least in one cell from another ship");
                                    return false;
                                }
                            }
                        }

                    }
                }
            } else {
                System.out.println("The ship is too long to fit to the field. Correct the start coordinate or direction");
                return false;
            }

        }
        return true;
    }
}
