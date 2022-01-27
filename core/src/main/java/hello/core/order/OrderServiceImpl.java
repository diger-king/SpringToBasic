package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    //privat DiscountPolciy discountPolicy = new FixDiscountPolicy() ---> 인터페이스 구현체가 어떤걸 메소드를 쓸지 결정하면 안됨

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy; //구현 객체를 생성한 후 매개변수로 전달해야한다.

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
