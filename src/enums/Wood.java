package enums;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
    public String toString(){
        switch(this){
            case INDIAN_ROSEWOOD:
                return "INDIAN_ROSEWOOD";
            case BRAZILIAN_ROSEWOOD:
                return "BRAZILIAN_ROSEWOOD";
            case MAHOGANY:
                return "MAHOGANY";
            case MAPLE:
                return "MAPLE";
            case COCOBOLO:
                return "COCOBOLO";
            case CEDAR:
                return "CEDAR";
            case ADIRONDACK:
                return "ADIRONDACK";
            case SITKA:
                return "SITKA";
            case ALDER:
                return "ALDER";
            default: return null;
        }
    }
}
