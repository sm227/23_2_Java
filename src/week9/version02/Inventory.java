package week9.version02;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class Inventory {
    private List<Guitar> guitars; // 기타 타입의 리스트

    public Inventory() {
        guitars = new LinkedList<Guitar>(); // guitars 는 Guitar 타입의 새로운 링크드 리스트.
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar); // guitars에 링크드리스트 형태로 저장됨.
    }

    public Guitar getGuitar(String serialNumber) { // serialNumber 를 매개변수로 받아 기타의 정보를 호출

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) { // Guitar 타입의 i =  guitars를 컬렉션 프레임워크로 생성.
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar; // 기타의 시리얼 넘버 비교후 맞으면 guitar 리턴
            }
        }
        return null; // 아니면 null return
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>(); // matchingGuitars 는 Guitar 타입의 새로운 링크드 리스트.

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) { // Guitar 타입의 i =  guitars를 컬렉션 프레임워크로 생성.
            Guitar guitar = (Guitar) i.next(); // i 값 하나씩 넘기면서 탐색.

            if (searchGuitar.getBuilder() != guitar.getBuilder()) continue; // 일치하지 않으면 아래 수행하지 않고 다음단계로 넘어감.

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) continue;

            if (searchGuitar.getType() != guitar.getType()) continue;

            if (searchGuitar.getBackWood() != guitar.getBackWood()) continue;

            if (searchGuitar.getTopWood() != guitar.getTopWood()) continue;

            matchingGuitars.add(guitar); // 전부 통과하면 리스트에 기타 추가.
        }
        return matchingGuitars; // 리스트 리턴
    }
}