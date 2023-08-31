package a0714.p_712;

public class Member {
    private String id;
    private String name;

    public Member(String id){
        this.id = id;
        System.out.println("Member(String id)");
    }
    public Member(String id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }
    // 프로그래밍에서 디버깅 과정에서 유용하게 사용
    @Override
    public String toString(){
        String info = "{id: "+id+",name: "+name+"}";
        return info;
    }
}
