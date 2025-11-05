public class Main {
    public static void main(String[] args) {
        Calculator basicCalc = new Calculator();

        basicCalc.setNumbers(10, 5);
        basicCalc.add();
        basicCalc.displayResult("+");

        basicCalc.subtract();
        basicCalc.displayResult("-");

        AdvancedCalculator advancedCalc = new AdvancedCalculator();

        advancedCalc.setNumbers(20, 7);
        advancedCalc.multiply();
        advancedCalc.displayResult("*");

        advancedCalc.setNumbers(9, 3);
        advancedCalc.divide();
        advancedCalc.displayResult("/");

        advancedCalc.power();

        Factorial Factorial = new Factorial();
        Factorial.setNumbers(5);
        Factorial.factorial();
        Factorial.displayResult("!");
            }
        }

