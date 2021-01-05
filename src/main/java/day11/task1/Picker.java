package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPaid() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Salary: " + salary + "\nBonus is paid: " + isPayed;
    }

    @Override
    public void doWork() {
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        salary += 80;
    }

    @Override
    public void bonus() {
        if (isPayed == false && warehouse.getCountPickedOrders() >= 10000) {
            salary += 70000;
        } else if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
