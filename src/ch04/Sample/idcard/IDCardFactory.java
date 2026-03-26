package ch04.Sample.idcard;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100; //정수 기본 데이터 타입
    private Map<String, IDCard> cards = new HashMap<>(); //정수 객체

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
            IDCard card = (IDCard) product; 
            cards.put(card.getSerial(), get card);
        System.out.println(product + "을 등록했습니다.");
    }
}
