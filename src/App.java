import singlenton.Constante;

public class App {
    public static void main(String[] args) throws Exception {
       Constante constante= Constante.getInstance();
       System.out.println(constante);
       constante.setDatos("Johan", 0.16);
       System.out.println(constante);
       Constante constante2=Constante.getInstance();
       constante2.setDatos("Steven", 0.23);
       System.out.println(constante2);
        }
}
