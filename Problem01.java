public class Problem01 {
    public static void main(String[] args) {
//        int var1=5;
//        int var2=2;
//        double var3=var1/var2;
//        int var4=(int)(var3*var2);
//        System.out.println(var4);

        // 위의 코드를 실행하면 5가 나오기를 기대했는데 4가 출력된 이유는 int와 double의 사용을 모르기 때문이다.
        // 지금 위 코드의 경우에는 int값으로 나누어주어 변수에는 실수 값을 저장할 수 있지만 정수값이 저장 되었기 때문에 원하는 결과 값인 5가 나오지 않는 것이다.
        // 이런 경우에는 나누는 값을 double로 형변환을 시킨다면 변수에 2가 아닌 2.5의 값을 저장할 수 있게 된다.

        int var1=5;
        int var2=2;
        double var3=var1 / (double)var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);

        // 위와 같이 형변환을 하여 코드를 실행하여 본다면 결과값으로 5가 잘나오는 것을 확인 할 수 있다.
    }
}
