package week11.quiz;


public class Director {

    public Actor[] actors = new Actor[4]; // 배우들, 배우수
    public void cast(Actor a) {
        for (int i =0 ; i < actors.length;  i ++) {
            if (actors[i] == null) {
                actors[i] = a;
                break;
            }
        }

    }
    public void cast(String name) {
        Actor a = new Actor(name);

        for (int i =0 ; i < actors.length;  i ++) {
            if (actors[i] == null) {
                actors[i] = a;
                break;
            }
        }
    }



    public void cast(String name, String actions) {
        Actor a = new ActionActor(name,actions);

        for (int i =0 ; i < actors.length;  i ++) {
            if (actors[i] == null) {
                actors[i] = a;
                break;
            }
        }
    }

    public void direct() {
        for (int i=0; i< actors.length; i++) {
            actors[i].start();
        }
    }

    public static void main(String[] args) {
        Director d = new Director();
        Actor a = new Actor("조인성");
        Actor b = new ActionActor("장혁", "돌려차기");
        // 조인성 캐스팅하기
        d.cast(a);
        // 장혁 캐스팅하기
        d.cast(b);
        // 일반배우 장나라 캐스팅하기
        d.cast("장나라");
        // 발차기 특기를 가진 액션배우 공효진 캐스팅하기
        d.cast("공효진", "발차기");
        d.direct();

    }
}
