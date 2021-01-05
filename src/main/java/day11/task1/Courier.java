package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000 && isPayed == false) {
            salary += 50000;
            isPayed = true;
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
