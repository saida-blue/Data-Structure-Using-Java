public class FinalKeywordExample {
    public static void main(String[] args) {
        FinalKeywordExample_Money money = new FinalKeywordExample_Money();
        System.out.println(money.id());
        System.out.println(FinalKeywordExample_Money.MAX);
    }
}

final class FinalKeywordExample_Money {
    static final int MAX = 10;

    public final String id() {
        return "MONEY-01";
    }
}
