package week11;

public class Animal {
        String food = "빵";
        public void eat(){
                System.out.println(food + " 를 먹다.");
        }

        public void bark(){
                System.out.println("짖다");
        }
}

interface Swimmable{
        String pool = "강";
        public void swim();
}

interface Runnable {
        final static int MAXSPEED = 50;
        int MINSPEED = 10;
        public void start();
        public void running();
        public void stop();
}

class Dog extends Animal implements Swimmable,Runnable {
        // interface Run의 추상 메소드 재정의
        public void start(){
                System.out.println("Dog 출발했다.");
        }
        public void running(){
                System.out.println("Dog 달리는 중이다.");
        }
        public void stop(){
                System.out.println("Dog 뼈다구를 보고 멈추다.");
        }
        //interface Swim의 추상 메소드 재정의
        public void swim(){
                System.out.println("Dog 이 " + pool + "을 네 다리로 헤엄치고 있다.");
        }
        public static void main(String[] args){
                Dog d = new Dog();

                //Animal 클래스의 메소드 호출
                d.food  = "고기";
                d.eat();
                d.bark();
                d.running();
                d.stop();
                //interface Swim을 재정의한 메소드 호출
                d.swim();
                System.out.println("----------");

                Animal a = new Dog();
                a.food = "고기";
                a.eat();
                a.bark();
                ((Swimmable)a).swim();
                ((Runnable)a).start();
                ((Runnable)a).running();
                ((Runnable)a).stop();

                System.out.println("----------");

                Runnable r = new Dog();
                ((Animal)r).food = "밥";
                ((Animal)r).eat();
                ((Animal)r).bark();
                ((Swimmable)r).swim();
                r.start();
                r.running();
                r.stop();

                System.out.println("----------");

                Swimmable s = new Dog();
                ((Animal)s).food = "생선";
                ((Animal)s).eat();
                ((Animal)s).bark();
                s.swim();
                ((Runnable)s).start();
                ((Runnable)s).running();
                ((Runnable)s).stop();
                System.out.println("----------");
        }
}