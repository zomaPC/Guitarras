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
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER.toString(), "Stratocastor",
                Type.ELECTRIC.toString(), Wood.ALDER.toString(), Wood.ALDER.toString());


        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Ering, te pueden gustar estas guitarras");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                System.out.println("Tenemos una" + guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " " + "guitar:\n " +
                        guitar.getBackWood() + "Fondo y costado,\n " +
                        guitar.getTopWood() + "top.\n Puedes tenerla por solo $" +
                        guitar.getPrice() + "!\n ---- ");
            }
        }else{
            System.out.println("Lo siento Erin, no tenemos algo para ti");
        }
    }
    private static void InitializeInventory(Inventory inventory){
        inventory.addGuitar("12345",500.35,Builder.FENDER.toString(), "Stratocastor", Type.ELECTRIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
        inventory.addGuitar("12346",400.35, Builder.FENDER.toString(),"T9A",Type.ACOUSTIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
        inventory.addGuitar("12347",700.35, Builder.FENDER.toString(),"Stratocastor",Type.ELECTRIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
        inventory.addGuitar("12348",800.35, Builder.FENDER.toString(),"T97",Type.ACOUSTIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
        inventory.addGuitar("12349",700.35, Builder.FENDER.toString(),"TNF",Type.ELECTRIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
        inventory.addGuitar("12358",450.54,Builder.FENDER.toString(), "tfc",Type.ACOUSTIC.toString(),Wood.ALDER.toString(),Wood.ALDER.toString());
    }
}


