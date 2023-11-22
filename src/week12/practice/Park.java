package week12.practice;

class Park implements Runnable {
    public void start() {
        System.out.println("Park MAXSPEED = " + MAXSPEED);
        System.out.println("Park 2시에 두발로 뛰기 시작한다");
    }
    public void running() {
        System.out.println("Park 1시간째 두발로 뛰고 있다");
    }
    public void stop() {
        System.out.println("Park 3시 10분에 두발로 멈추었다.");
    }
}
