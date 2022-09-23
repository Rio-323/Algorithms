public class Problem02 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);

        // 값은 31이 나오게 됩니다.
        // 그 이유는 먼저 ++x를 하게 되면 11이 되고, y--는 앞선 연산을 먼저 끝내고 이루어지기 때문이다.
        // 즉, ++x = 11 + 20 = 31 = z에 먼저 할당을 하고 y = y-1이렇게 후위로 증감연산자가 실행되기 때문에
        // 결과값에 y--가 영향을 끼칠 수가 없음.
    }
}
