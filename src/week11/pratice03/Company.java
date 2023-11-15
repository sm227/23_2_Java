package week11.pratice03;

import week11.Computer;

public class Company {
    private Manager jmchoi, yckim;
    private Employee park, lee;
    protected  Employee employees[];

    public Company() {
        jmchoi = new Manager("Choi Jong Myung", "F99847", "Finance");
        yckim = new Manager("Kim Young chul", "F99832", "Develope");
        park = new Employee("Park", "F99792");
        lee = new Employee("lee", "F99732");

        employees = new Employee[4];
        employees[0] = jmchoi;
    }

    public void makeMoney() {
        int n = employees.length;
        for (int i =0; i < n; i++) {
            employees[i].work();
        }
    }

    public static void main(String[] args) {
        Company mycom = new Company();
        mycom.makeMoney();
    }
}
