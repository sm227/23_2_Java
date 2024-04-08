package T24.week06.p2;

public class Director {
    private int actorNum = 0;
    private  Actor[] actors;

    public Director() {
        actors = new Actor[10];
    }


    public void cast(Actor actor) {
        actors[actorNum] = actor;
        actorNum++;
    }
    public void cast(String name) {
        actors[actorNum] = new Actor(name);
        actorNum++;
    }
    public void cast(String name, String talent) {
        actors[actorNum] = new ActionActor(name,talent);
        actorNum++;
    }
    public void direct() {
        for(int i=0; i< actorNum; i++) {
            if(actors[i] instanceof ActionActor) {
                actors[i].play();
                ((ActionActor) actors[i]).excercise(); //다운 캐스팅
            }
            else actors[i].play();
        }
    }



}
