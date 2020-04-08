package JAVA_Season_2;

// 변수나 메소드에는 이름이 필요하다. 그러나 코드가 방대해지면 여러 이유에서 이름이 출돌할 수 있다.
// 이를 위해 '유효 범위'가 필요하다. ~~~> 'Scope(스코프)'
public class ex05_유효범위_클래스 {
    static void a() {

        int i = 0;
    }

    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            a();
            System.out.println(i);
        }
    }
    // 현재 a 메소드에서의 변수 i와 main 메소드의 반복문에서의 i가 서로 이름이 같다.
    // 그러나 a 메소드 때문에 main 메소드의 반복문이 영향을 받지는 않는다.
    // ~> 클래스 변수로써 선언되었다면 클래스 전역에 영향을 미칠테지만
    // 메소드 내에서 선언된 변수는 그 우선순위가 클래스 변수보다 높아 영향을 받지 않는다.

    // 즉, '지역적인 것이 전역적인 것보다 우선 순위가 높다'.
    // 그래서 전역 변수로 초기값을 설정하고 경우에 따라 지역 변수 값을 다르게 사용할 수도 있다.
    // 전역변수: 클래스 전역에서 접근할 수 있는 변수
    // 지역변수: 메소드 내에서만 접근할 수 있는 변수

    // 이와 같은 개념으로 반복문 내에서 선언한 변수는 반복문 안에서만 영향을 미친다.

    // 이런 방식을 '정적 스코프' 또는 '렉시컬 스코프'라고 한다.
    // 즉, 사용되는 시점에서의 유효범위를 사용하는 것이 아닌, '정의된 시점에서의 유효범위'를 사용한다.
}
