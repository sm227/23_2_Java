package week11;

public class InheritanceTest {
    public static void main(String[] args) {
        NotebookComp nc = new NotebookComp("이수종", 5);
        TabletNotebook tn = new TabletNotebook("정수영", 5 , "ISE-241-242");
        nc.movingCal();
        tn.write("ISE-241-242");
    }
}
