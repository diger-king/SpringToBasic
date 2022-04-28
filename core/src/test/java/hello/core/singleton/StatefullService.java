package hello.core.singleton;

public class StatefullService {
//    private int price; //상태를 유지하는 필드
//
//    public void order(String name, int price) {
//        System.out.println("name = " + name + "price = " + price);
//        this.price = price; //주문을 하고 값을 저장을 했음
//    }

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
