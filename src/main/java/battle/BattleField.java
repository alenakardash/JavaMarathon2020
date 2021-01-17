package battle;

public class BattleField {
    //Массив для графического отображения поля
    private Cell[][] cells = new Cell[10][10];

    public BattleField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = Cell.EMPTY;
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCellValue(int x, int y, Cell cell) {
        cells[x][y] = cell;
    }

    public void printBattleField() {
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < cells.length; i++) {
            int num = i + 1;
            System.out.printf("%-2d", num, "  ");
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public void setAreolAroundShip(Ship ship, Player player) {
        for (int i = 0; i < ship.getProhibitedCoordinates()[0].length; i++) {
            if ((ship.getProhibitedCoordinates()[0][i] > -1) && (ship.getProhibitedCoordinates()[0][i] < 10) && (ship.getProhibitedCoordinates()[1][i] > -1) && (ship.getProhibitedCoordinates()[1][i] < 10)) {
                if (player.getEnemyField().getCells()[ship.getProhibitedCoordinates()[0][i]][ship.getProhibitedCoordinates()[1][i]] == Cell.EMPTY) {
                    setCellValue(ship.getProhibitedCoordinates()[0][i], ship.getProhibitedCoordinates()[1][i], Cell.MISSED);
                }
            }
        }
    }

}
