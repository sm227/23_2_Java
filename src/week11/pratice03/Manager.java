package week11.pratice03;

public class Manager extends Employee{
    String dept;

    public Manager(String name, String idnum, String dept) {
        super(name, idnum);
        this.dept = dept;
    }

    public void work() {
        System.out.println("Manager \""+name + "\" works hard with hos subordinates in " + dept + " dept.");
    }
}
