package com.projects;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Location> locationMap=new HashMap<>();

        locationMap.put(0,new Location(0,"Exit"));
        locationMap.put(1,new Location(1,"In Room"));
        locationMap.put(2,new Location(2,"In Forest "));
        locationMap.put(3,new Location(3,"In HIll"));
        locationMap.put(4,new Location(4,"In lake"));
        locationMap.put(5,new Location(5,"In temple"));
        locationMap.put(6,new Location(6,"In Playground"));
        Location room=locationMap.get(1);
        room.add_Exit(0,"Exit");
        room.add_Exit(2,"N");
        room.add_Exit(3,"E");
        room.add_Exit(4,"W");
        room.add_Exit(6,"S");
        Location forest=locationMap.get(2);
        forest.add_Exit(3,"SE");
        forest.add_Exit(1,"S");
        Location hill=locationMap.get(3);
        hill.add_Exit(2,"NW");
        hill.add_Exit(6,"SW");
        Location play=locationMap.get(6);
        play.add_Exit(5,"W");
        Location temple=locationMap.get(5);
        temple.add_Exit(4,"N");
        Location lake=locationMap.get(4);
        lake.add_Exit(5,"S");
        lake.add_Exit(2,"NE");
        int loc=1;boolean b=false;
        while(true)
        {
            System.out.println('\u04C1' +" "+locationMap.get(loc).getDescription()+" "+ '\u04C1');
            if(loc==0)
                break;
            System.out.print("Enter the direction : ");
            String s=br.readLine();
            String[] p = s.split(" ");
            for(String i:p)
                    if ((locationMap.get(loc).getExits().containsKey(i))) {
                        loc = locationMap.get(loc).getExits().get(i);
                        b=true;
                    }

                if(!b)
                {
                    System.out.println("#######################################################");
                    System.out.println("The direction is wrong");
                    System.out.println("There will be a penalty you have to start from starting");
                    System.out.println("#######################################################");
                    loc=1;
                }
            b=false;
        }
    }
}
