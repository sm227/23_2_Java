package week4;

class TV {
    private int channel;
    private int volume;
    private  boolean power;

    public TV() {
        channel = 9;
        volume = 20;
        power = false;
    }
    public TV(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }
    public  void PowerOn() {
        if (power == false) {
            power = true;
            System.out.println("TV  ON.");
        }
        else {
            power = false;
            System.out.println("TV OFF");
        }
    }
    public void channelUp() {
        channel++;
    }
    public void channelDown() {
        channel--;
    }
    public void volumeUp(){
        volume++;
    }
    public void volumeDown() {
        volume--;
    }
    // Getter and Setter Area

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    // End

}

public class WatchTV {
    public static void main(String[] args) {
        // 초기 세팅 : 채널(9번) , 볼륨(20), 전원상태: 꺼짐
        TV tv = new TV();
        tv.PowerOn();
        System.out.printf("현재 채널 : %d", tv.getChannel());
        System.out.printf("현재 볼륨 : %d", tv.getVolume());


    }

}
