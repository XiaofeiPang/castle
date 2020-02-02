package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> catles = new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    public String fun() {
        StringBuffer sb = new StringBuffer();
        for (String dir : catles.keySet()) {
                sb.append(dir);
            sb.append(' ');
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return description;
    }

    public void setExit(String dir, Room room) {
        catles.put(dir, room);
    }
    public Room acquireRoom(String direction) {
        return catles.get(direction);

    }
}