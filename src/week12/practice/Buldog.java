package week12.practice;

class Buldog implements Runnable {
    public void start() {
        System.out.println("Buldog 네 발로 출발한다");
    }
    public void running() {
        System.out.println("Buldog 최고 속도로 4발로 뛴다");
    }
    public void stop() {
        System.out.println("Buldog 먹이를 보고 멈추었다");
    }
}
