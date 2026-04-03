package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<Product> cards = new ArrayList<>();
    private int lastSerial = 0;
    private String baseDate; // 카드 발급 기준 날짜 [cite: 33]

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        // baseDate를 사용하여 IDCard 생성 [cite: 34]
        return new IDCard(owner, ++lastSerial, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        cards.add(product);
    }
}