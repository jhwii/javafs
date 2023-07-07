package a0707.p_321;
// p.321
public class InstanceofExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name:" + person.name);
        person.walk();

        // person이 참조하는 객체가 Student 타입인지 확인
          if(person instanceof Student){
          // Student 객체일 경우 강제 타입 변환
          Student student = (Student) person;
          // Student 객체만 가지고 있는 필드 및 메소드 사용
          System.out.println("studentNo:"+student.studentNo);
          student.study();
        }
       /*  if (person instanceof Student student) {
            System.out.println("studentNo:" + student.studentNo);
            student.study();
        } */
    }
    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
// 1. person 객체 정보를 출력
// 2. Student 객체의 정보를 출력
// 3. 이때 Student 객체는 Person 클래스를 상속 받았기 때문에 'personInfo()' 메서드에서 'instanceof' 연산자를 사용하여 student 타입인지 확인하고, 필요에 따라 형변환 하여 Student 클래스에만 존재하는 필드와 메서드를 사용할 수 있게 됩니다.
