package tools;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public ArrayList setGroup (){
        ArrayList<Integer> group = new ArrayList();
        System.out.println("Wie gross soll die Gruppe sein?");
        Scanner scan = new Scanner (System.in);
        int size = Integer.parseInt(scan.nextLine());
        System.out.println();

        for (int i = 0; i< size; i++){
            group.add(i);
        }
        return group;
    }
}
