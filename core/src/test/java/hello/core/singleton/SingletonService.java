package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    // static 영역에 객체를 한개만 생성해둔다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private로 선언해서 외부에서 new 키워드로 사용한 객체 생성을 못하도록 막는다.
    private SingletonService() {
        
    }
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}