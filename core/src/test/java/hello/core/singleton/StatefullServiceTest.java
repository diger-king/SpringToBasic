package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefullServiceTest {
    @Test
    void statefullServiceSingletone() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefullService statefullService1 = ac.getBean(StatefullService.class);
        StatefullService statefullService2 = ac.getBean(StatefullService.class);


//        statefullService1.order("userA", 10000);
//
//        statefullService2.order("userB", 20000);

        int userAPrice = statefullService1.order("userA", 10000);
        int userBPrice = statefullService2.order("userB", 20000);

        //사용자 A가 주문한 금액 조회
//        int price = statefullService1.getPrice();
        System.out.println("price = " + userAPrice);

//        Assertions.assertThat(statefullService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {
        @Bean
        public StatefullService statefullService() {
            return new StatefullService();
        }
    }

}