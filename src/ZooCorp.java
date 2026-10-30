import java.util.ArrayList;
import java.util.Iterator;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employable> staff;

    public ZooCorp(Zoo zoo) {
        zoos = new ArrayList<Zoo>();
        staff = new ArrayList<Employable>();
        addZoo(zoo);
    }

    public void addZoo(Zoo z) {
        zoos.add(z);
    }

    public void printZooInfo() {
        Iterator<Zoo> iter = zoos.iterator();
        while (iter.hasNext()) {
            Zoo z = iter.next();
            System.out.println(z.getLocation() + " - " + z.getNumCompounds() + " compounds");
        }
    }

    public void addStaff(Employable e) {
        staff.add(e);
    }

    public ArrayList<Employable> getAllEmployee() {
        return staff;
    }
}
