package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String,Triple> map = new HashMap<>();//triple 객체 3개를 저장함  Map
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s))); //<키,값> 쌍으로 Triple객체를 map에 저장함. Triple 객체는 3개만 만들어짐. Triple 객체는 이름이 필요하므로 이름을 매개변수로 전달함. Triple 객체가 3개 만들어짐. Triple 객체는 이름이 필요하므로 이름을 매개변수로 전달함.
    }

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
