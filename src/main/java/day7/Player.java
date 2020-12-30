package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
        countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            System.out.println("Cannot run, stamina = 0");
            return;
        }
        else if (stamina == 1) {
            stamina--;
            countPlayers--;
        }
        else {
            stamina--;
        }
    }

    public static void info() {
        int availablePlace = 0;
        if (countPlayers < 6) {
            availablePlace = 6 - countPlayers;
            System.out.print("Команды неполные. На поле еще есть " + availablePlace);

            if (availablePlace == 1) {
                System.out.println(" свободное место");
            }
            else if (availablePlace == 5) {
                System.out.println(" свободных мест");
            }
            else {
                System.out.println(" свободных места");
            }
        }
        else {
            System.out.println("На поле нет свободных мест");
        }

    }
}
