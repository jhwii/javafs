package a0714.p_700;
// 익명함수로 작성하는 방법
public class ButtonExample2 {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 익명 클래스(ClickListener 구현) 주입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 익명 클래스(ClickListener 구현) 주입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
