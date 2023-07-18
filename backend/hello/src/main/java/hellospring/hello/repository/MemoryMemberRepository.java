package hellospring.hello.repository;

import hellospring.hello.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);  //멤버를 저장할때 일련번호 값을 1씩 증가
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
    // 검색된 멤버를 Optional 로 감싸서 반환
    // Optional.ofNullable null 이 아니면 감싸서 반환
    // null Optional.empty()를 반환

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() { // clearStore
        store.clear(); // 저장소 내용 지움
    }

}