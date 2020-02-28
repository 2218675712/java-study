package day0228.pet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Penguin();
        pet1.setName("企鹅1号");
        Pet pet2 = new Penguin();
        pet2.setName("企鹅2号");
        Pet pet3 = new Penguin();
        pet3.setName("企鹅3号");
        Map<String, Pet> pets = new HashMap();
        pets.put("pet1", pet1);
        pets.put("pet2", pet2);
        pets.put("pet3", pet3);
        for (Map.Entry<String, Pet> entry : pets.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().print();
        }
    }
}
