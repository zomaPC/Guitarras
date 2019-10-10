import enums.Type;
import enums.Builder;
import enums.Wood;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        InitializeInventory(inventory);
        System.out.println("type");
        System.out.println(Type.ELECTRIC.toString());
        GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);


        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Ering, te pueden gustar estas guitarras");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Tenemos una" + spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " " + "guitar:\n " +
                        spec.getBackWood() + "Fondo y costado,\n " +
                        spec.getTopWood() + "top.\n Puedes tenerla por solo $" +
                        guitar.getPrice() + "!\n ---- ");
            }
        }else{
            System.out.println("Lo siento Erin, no tenemos algo para ti");
        }
    }
    private static void InitializeInventory(Inventory inventory){
        inventory.addGuitar("12345",500.35, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("12346",400.35,new GuitarSpec(Builder.FENDER,"T9A",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("12347",700.35,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("12348",800.35, new GuitarSpec(Builder.FENDER,"T97",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("12349",700.35, new GuitarSpec(Builder.FENDER,"TNF",Type.ELECTRIC,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("12358",450.54,new GuitarSpec(Builder.FENDER, "tfc",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER));
    }
}


