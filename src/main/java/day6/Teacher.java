package day6;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        int markInt = (int) (Math.random() * 4 + 2);
        String markString = "";

        switch (markInt) {
            case 2:
                markString = "неудовлетворительно";
                break;
            case 3:
                markString = "удовлетворительно";
                break;
            case 4:
                markString = "хорошо";
                break;
            case 5:
                markString = "отлично";
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + discipline + " на оценку " + markString);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }
}
