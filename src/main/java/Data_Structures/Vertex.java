package Data_Structures;


import java.util.Objects;
import java.util.UUID;

public class Vertex{
    private String name;
    private UUID uuid;

    public Vertex(UUID uuid){
        this.name = null;
        this.uuid = uuid;
    }

    public Vertex(String name){
        this.name = name;
        this.uuid = UUID.randomUUID();
    }


    public Vertex() {
        this((String) null);
    }


    @Override
    public String toString() {
        if(name != null){
            return name.toString();
        }
        else{
            return uuid.toString().substring(0,8);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,uuid);
    }

    public UUID getUuid() {
        return uuid;
    }
}
