package a0707.p_334;
// p.334 7번
public class Parent1 {
    public String nation;

    public Parent1(){
        this("대한민국");
        System.out.println("Parent1() call");
    }
     public Parent1(String nation){
        this.nation = nation;
        System.out.println("Parent1(String nation) call");
    }
}
