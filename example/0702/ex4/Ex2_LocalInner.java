package ex4;
/* Ex2_LocalInner 
 로컬 내부클래스 : 메서드, 생성자 영역안에서 존재
 스택에서 실행되고 나가지 전까지 힙영역에서 존재한다.
*/
public class Ex2_LocalInner {
    private int a;
    public Ex2_LocalInner() { a=100; }
    // 로컬 내부클래스안에서..... 지역변수 이야기 
    //jdk 7이하까지는 final이라고 명시
    // 8버전 이후 부터는 final이 없어도 지역변수는 상수 취급
    public void insertTest(final int num){
      int b = 200; // 상수
      int c = num; // 상수 
        class Inner{ // 메소드 영역 안에 존재
            public void getData(){
                System.out.println("멤버필드 참조 :"+a);
                // 메서드안의 상수는 참조할 수 있지만
                // 지역변수는 사용될 수 없다.
               // System.out.println("지역변수 참조"+(b++));
               //System.out.println("지역변수?"+(c+=num));
               //System.out.println(b);
            }
        }
        new Inner().getData();
        // 익명 내부 클래스에서 참조해서 사용하지 않을 경우
        b = 30;
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        new Ex2_LocalInner().insertTest(200);
    }
}
