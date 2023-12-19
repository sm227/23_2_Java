package week9.version02;

public enum Builder { // 같은 타입끼리 묶은 열거형. 대소문자 문제 없음.
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case COLLINGS:
                return "Collings";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            default:
                return "Unspecified";

        }
    }
}

