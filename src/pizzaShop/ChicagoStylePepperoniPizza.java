package pizzaShop;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {
        name = "시카고 스타일 페페로니 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
