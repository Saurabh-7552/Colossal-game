package com.projects;
import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int nextlocId;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int nextlocId, String description) {
        this.nextlocId = nextlocId;
        this.description = description;
        this.exits=new HashMap<>();
        add_Exit(nextlocId,description);
    }

    public HashMap<String,Integer> getExits() {
        return new HashMap<>(exits);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return nextlocId;
    }

    public void add_Exit(Integer id,String s)
    {
        this.exits.put(s,id);
    }
}
