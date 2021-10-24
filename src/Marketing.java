import java.util.ArrayList;
import java.util.List;

public abstract class Marketing {
    List<Outdoor> outdoors = new ArrayList<>();

    public void add(Outdoor outdoor){
        outdoors.add(outdoor);
    }

    public void remove(Outdoor outdoor){
        outdoors.remove(outdoor);
    }

    public void notifyOutdoor(){
        for(Outdoor out : outdoors){
            out.update(this);
        }
    }

    public void notifyOutdoor(String city){
        for(Outdoor out : outdoors){
            OutdoorPrime op = (OutdoorPrime) out;
            if(op.getLocation().equals(city)){
                out.update(this);
            }
        }
    }
}