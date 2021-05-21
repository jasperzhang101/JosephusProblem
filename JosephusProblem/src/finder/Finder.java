package finder;

import java.util.ArrayList;

public class Finder {
    public ArrayList getSurvivor(ArrayList group){
        for (int i = 1;group.size()>1; i++){
            System.out.println(group);
            if (i > group.size()-1){
                i -= (group.size());
            }
            System.out.println(group.get(i)+" wird entfernt.");
            System.out.println();
            group.remove(i);
        }
        return group;
    }
}
