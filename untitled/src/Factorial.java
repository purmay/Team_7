class Factorial extends Calculator {

    public void setNumbers(int num) {
        this.num1 = num;
    }

    public int factorial() {
        result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        return result;
    }

    public void displayResult(String op) {
        System.out.println(num1 + op + " = " + result);
    }
}