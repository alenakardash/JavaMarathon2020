package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петр Семенович Круглов", "Квантовая механика");
        Student student = new Student("Волков Игорь Олегович");

        teacher.evaluate(student);

    }
}
