package week12.practice;

public interface Runnable {
    final static int MAXSPEED = 50;
    int MINSPEED = 10;

    public void start();
    public void running();
    public void stop();
}
