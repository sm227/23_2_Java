package week12.practice;

abstract class Sports {
    String name;
    int age;
    String money;
    public Sports(String name, int age, String money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("money = " + money);
    }
    abstract  void playGame();
}

