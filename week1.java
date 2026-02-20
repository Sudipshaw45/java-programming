//q1
class HelloJava {
    public static void main(String[] args) {
        System.out.println("HELLO JAVA");
    }
}
//q2
class AddNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
//q3
class FactorialSimple {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
//q4
class FactorialMethod {

    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial = " + factorial(num));
    }
}
//q5
class Fact {
    int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

class FactorialClass {
    public static void main(String[] args) {
        Fact obj = new Fact();
        int num = 5;
        System.out.println("Factorial = " + obj.factorial(num));
    }
}
//q6
class FactorialCommandLine {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}
//q7
class OddEven {
    public static void main(String[] args) {
        int num = 10;

        if(num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
//q8
class Maximum {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        int max = a;

        if(b > max)
            max = b;
        if(c > max)
            max = c;

        System.out.println("Maximum = " + max);
    }
}
//q9
class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
//q10
class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
//q11
class GradeSystem {
    public static void main(String[] args) {
        int percentage = 85;
        char grade;

        if(percentage >= 90)
            grade = 'A';
        else if(percentage >= 80)
            grade = 'B';
        else if(percentage >= 70)
            grade = 'C';
        else if(percentage >= 60)
            grade = 'D';
        else if(percentage >= 40)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("Grade = " + grade);
    }
}
//q12
class DivisibleByFive {
    public static void main(String[] args) {
        int num = 25;

        if(num % 5 == 0)
            System.out.println(num + " is divisible by 5");
        else
            System.out.println(num + " is not divisible by 5");
    }
}