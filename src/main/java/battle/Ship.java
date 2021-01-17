package battle;


public class Ship {
    private int deck;
    private int[][] coordinates;
    private int aliveDeckCounter;
    private int prohibitedCoordinates[][];

    public Ship(int deck) {
        this.deck = deck;
        aliveDeckCounter = deck;
        coordinates = new int[2][deck];
        // Тут я записываю координаты корабля + ореола вокруг, чтобы потом ограничивать расстановку других кораблей
        prohibitedCoordinates = new int[2][3 * deck + 6];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                // 15 - чтобы при начальной инициализации не проставились 0 (потому что 0 - нормальная координата)
                coordinates[i][j] = 15;
            }
        }
        for (int i = 0; i < prohibitedCoordinates.length; i++) {
            for (int j = 0; j < prohibitedCoordinates[i].length; j++) {
                prohibitedCoordinates[i][j] = 15;
            }
        }
    }

    public int[][] getProhibitedCoordinates() {
        return prohibitedCoordinates;
    }

    public int getDeck() {
        return deck;
    }

    public int getAliveDeckCounter() {
        return aliveDeckCounter;
    }

    public void setAliveDeckCounter(int aliveDeckCounter) {
        this.aliveDeckCounter = aliveDeckCounter;
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public boolean isAlive() {
        if (aliveDeckCounter == 0) {
            return false;
        } else {
            return true;
        }
    }


    public void setShipCoordinates(Coordinate coord, int destination) {
        for (int i = 0; i < deck; i++) {
            if (destination == 0) {
                coordinates[0][i] = coord.getNumeric();
                coordinates[1][i] = coord.getAlphabetical() + i;

            } else {
                coordinates[0][i] = coord.getNumeric() + i;
                coordinates[1][i] = coord.getAlphabetical();
            }
        }

    }

    public void setProhibitedCoordinates(int destination) {
        int y = getCoordinates()[1][0] - 1;
        if (destination == 1) {
            for (int i = 0, x = getCoordinates()[0][0] - 1; i < prohibitedCoordinates[0].length; i += 3, x++) {
                prohibitedCoordinates[0][i] = x;
                prohibitedCoordinates[0][i + 1] = x;
                prohibitedCoordinates[0][i + 2] = x;
                prohibitedCoordinates[1][i] = y;
                prohibitedCoordinates[1][i + 1] = y + 1;
                prohibitedCoordinates[1][i + 2] = y + 2;
            }
        } else {
            for (int i = 0, x = getCoordinates()[0][0] - 1; i < prohibitedCoordinates[0].length; i += deck + 2, x++) {
                for (int j = 0; j < deck + 2; j++) {
                    prohibitedCoordinates[0][i + j] = x;
                    prohibitedCoordinates[1][i + j] = y + j;
                }
            }

        }

    }

}

