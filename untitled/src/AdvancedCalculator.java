class AdvancedCalculator extends Calculator {

    @Override
    public int multiply() {
        if (num1 == 0 || num2 == 0) {
            result = 0;
            return result;
        }
        result = num1 * num2;
        return result;
    }

    @Override
    public int divide() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            result = Integer.MAX_VALUE;
            return result;
        }
        if (num1 == 0) {
            result = 0;
            return result;
        }
        result = num1 / num2;
        return result;
    }

    // 제곱 계산기 기능 구현
    public int power() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        num1 = sc.nextInt();

        System.out.print("지수를 입력하세요: ");
        num2 = sc.nextInt();

        result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        System.out.println(num1 + " ^ " + num2 + " = " + result);
        return result;


    }
}
