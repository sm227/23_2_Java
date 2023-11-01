package week9.version02;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDER, ADIRONDACK, ALDER,SITKA;

    public  String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD :
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            case ALDER:
                return "Alder";
            case CEDER:
                return "Ceder";
            case MAPLE:
                return "Maple";
            case SITKA:
                return "Sitka";
            case COCOBOLO:
                return "Cocobolo";
            case ADIRONDACK:
                return "Adirondack";
            default:
                return "unspecified";
        }
    }
}
