package tools;
import finder.Finder;

public class Starter {
    public void start (){
        Finder finder = new Finder();
        Input input = new Input ();
        System.out.println(finder.getSurvivor(input.setGroup())+" ist der letzte Ueberlebende!");
    }
}
