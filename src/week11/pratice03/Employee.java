package week11.pratice03;

public class Employee {
    protected String name;
    protected String idnum;
    protected String title;
    protected int salary;

    public Employee(String name, String idnum) {
        this.name = name;
        this.idnum = idnum;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("\t Employee \"" + "\" does his best.");
    }
}
