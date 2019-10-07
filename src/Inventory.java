import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private LinkedList guitars;

    public  Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,
                          String builder, String model,
                          String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
           // System.out.println("\n"+guitar);

            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (builder.equals("")) && ((!builder.equals("")) && (!builder.equals(guitar.getBuilder()))))
                continue;
            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
                continue;
            if (searchGuitar.getType() != guitar.getType())
                continue;;
            if (searchGuitar.getBackWood() != guitar.getBackWood())
                continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood())
                continue;
            matchingGuitars.add(guitar);
           return matchingGuitars;

        }
        return null;
    }
}