package a0714.p_700;
// 람다식을 배제하고 일반적으로 쓰는 방법
public class ButtonExample1 {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 ClickListener 인터페이스를 구현한 클래스의 인스턴스 주입
        btnOk.setClickListener(new OkButtonClickListener());

        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 ClickListener 인터페이스를 구현한 클래스의 인스턴스 주입
        btnCancel.setClickListener(new CancelButtonClickListener());

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }

    // Ok 버튼 클릭 리스너 구현 클래스
    private static class OkButtonClickListener implements Button.ClickListener {
        @Override
        public void onClick() {
            System.out.println("Ok 버튼을 클릭했습니다.");
        }
    }

    // Cancel 버튼 클릭 리스너 구현 클래스
    private static class CancelButtonClickListener implements Button.ClickListener {
        @Override
        public void onClick() {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        }
    }
}