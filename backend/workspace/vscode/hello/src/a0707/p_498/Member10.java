package a0707.p_498;
// p.498
public class Member10 {
    public String id;

    public Member10(String id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member10) {  // 주어진 객체가 특정 클래스의 인스턴스인지 판별
            Member10 target = (Member10) obj;
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
