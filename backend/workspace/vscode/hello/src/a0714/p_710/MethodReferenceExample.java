package a0714.p_710;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person(); // (a,b)->a.compareToIgnoreCase(b)
        person.ordering(String::compareToIgnoreCase);
        // 메소드 참조가 가능하다.
        // String 클래스에 정의된 메소드
        // 대소문자를 무시하고 두 문자열을 사전순으로 비교
    }
}
/* 자바에서 제공하는 문자열 비교 메소드는 String클래스에서 사용할수 있습니다.
다음은 몇 가지 주요한 문자열 비교 메소드입니다:

equals(Object obj): 두 문자열이 서로 동일한지 비교합니다.

equalsIgnoreCase(String anotherString): 대소문자를 구분하지 않고 두 문자열이 서로 동일한지 비교합니다.

compareTo(String anotherString): 두 문자열을 사전적으로 비교하여 순서를 결정합니다.

compareToIgnoreCase(String anotherString): 대소문자를 구분하지 않고 두 문자열을 사전적으로 비교하여 순서를 결정합니다.

startsWith(String prefix): 문자열이 특정 접두사로 시작하는지 확인합니다.

endsWith(String suffix): 문자열이 특정 접미사로 끝나는지 확인합니다.

contains(CharSequence sequence): 문자열이 특정 부분 문자열을 포함하는지 확인합니다.

matches(String regex): 정규 표현식과 일치하는지 확인합니다.

indexOf(String str): 문자열에서 특정 문자열이 처음으로 등장하는 인덱스를 반환합니다.

lastIndexOf(String str): 문자열에서 특정 문자열이 마지막으로 등장하는 인덱스를 반환합니다.
위의 메소드들은 문자열을 비교하고 일치 여부를 확인하는 다양한 방법을 제공합니다. 적절한 메소드를 선택하여 사용할 수 있습니다. */