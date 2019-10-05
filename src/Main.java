public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        InitializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("12358",0,"Fender","Stratocastor","electric","Alder","Alder");
        Guitar guitar = inventory.search(whatErinLikes);
        if(guitar != null){
            System.out.println("Erin, you might like this" + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " Guitar:\n" + guitar.getBackWood() + "back and sides,\n" + guitar.getTopWood() + "top.,\n You can have it for Only $" + guitar.getPrice() + "!");
        }else{
            System.out.println("sorry, Erin we have nothing for you");
        }
    }
    private static void InitializeInventory(Inventory inventory){
        inventory.addGuitar("12345",500.35, "Kon","TNA","Electrica","Pino","Caoba");
        inventory.addGuitar("12346",400.35, "SOS","T9A","Acustico","Fresno","Limba Blanca");
        inventory.addGuitar("12347",700.35, "Tushan","TNB","Infantil","Tilo","Palisandro");
        inventory.addGuitar("12348",800.35, "FLCL","T97","Electrica","Americano","Nogal");
        inventory.addGuitar("12349",700.35, "KIRA","TNF","Electrica","Alamo","Exotica");
        inventory.addGuitar("12358",0,"Fender","Stratocastor","electric","Alder","Alder");
    }
}
