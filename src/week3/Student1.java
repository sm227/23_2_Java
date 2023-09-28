package week3;

public class Student1 {
    String name;
    int age;
    public Student1() {

    }
    public Student1 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo() {
        System.out.println("이름=" + name);
        System.out.println("나이=" + age);
    }
    public void set(String name, int age) {
        setName(name);
        setAge(age);
    }
    public void set(int age, String name) {
        setName(name);
        setAge(age);
    }


    public static void main(String[] args) {
        Student1 a= new Student1();
        a.printInfo();
        a.setName("홍길동");
        a.setAge(20);
        a.printInfo();
        a.setName("홍기수");
        a.setAge(21);
    }
}
