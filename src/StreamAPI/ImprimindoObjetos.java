package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando foreach...");
        aprovados.forEach(System.out::println);

        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
