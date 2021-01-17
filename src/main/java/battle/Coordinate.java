package battle;

import java.util.Scanner;

public class Coordinate {
    // Переменные для хранения индекса ячейки на поле
    private int alphabetical;
    private int numeric;

    public int getAlphabetical() {
        return alphabetical;
    }

    public int getNumeric() {
        return numeric;
    }

    // Метод, чтобы пользовательский ввод провалидировать, распарсить и получить индекс для клетки numeric и alphabetical.
    public void coordinateToIndex(String coordinate, Scanner scanner) {
        char charAlphabetical = coordinate.charAt(0);

        switch (charAlphabetical) {
            case 'A':
                alphabetical = 0;
                break;
            case 'B':
                alphabetical = 1;
                break;
            case 'C':
                alphabetical = 2;
                break;
            case 'D':
                alphabetical = 3;
                break;
            case 'E':
                alphabetical = 4;
                break;
            case 'F':
                alphabetical = 5;
                break;
            case 'G':
                alphabetical = 6;
                break;
            case 'H':
                alphabetical = 7;
                break;
            case 'I':
                alphabetical = 8;
                break;
            case 'J':
                alphabetical = 9;
                break;
            default:
                alphabetical = 10;
        }

        if (alphabetical == 10) {
            System.out.println("Wrong alphabetical coordinate. Correct format is a symbol from [A - J]");
            coordinateToIndex(scanner.nextLine(), scanner);
            return;
        }

        try {
            char numericValue = coordinate.charAt(1);

            if (Integer.parseInt(Character.toString(numericValue)) < 1) {
                System.out.println("Numeric coordinate is out of bound. Enter the correct coordinate with the number from the range [1 - 10]: ");
                coordinateToIndex(scanner.nextLine(), scanner);
                return;
            }


            numeric = Integer.parseInt(Character.toString(numericValue)) - 1;

            if (coordinate.toCharArray().length > 2) {
                if (Integer.parseInt(Character.toString(coordinate.toCharArray()[2])) == 0) {
                    numeric = 9;
                } else {
                    System.out.println("Numeric coordinate is out of bound. Enter the correct coordinate with the number from the range [1 - 10]: ");
                    coordinateToIndex(scanner.nextLine(), scanner);
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Numeric coordinate is wrong. Enter the correct coordinate with the number from the range [1 - 10]: ");
            coordinateToIndex(scanner.nextLine(), scanner);
            return;
        }

    }

}
