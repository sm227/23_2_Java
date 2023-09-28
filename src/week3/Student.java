package week3;

public class Student {
    String name;
    int age;

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

    public static void main(String[] args) {
        Student a = new Student();
        a.printInfo();
        a.setName("홍길동");
        a.setAge(20);
        a.printInfo();
        a.setName("홍기수");
        a.setAge(21);
        System.out.println("이름=" + a.getName());
        System.out.println("나이=" + a.getAge());
    }
}
