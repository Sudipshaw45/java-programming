//q1
import java.io.*;

class BufferedReaderExample {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.println("Hello " + name);
    }
}
//q2
import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("You entered: " + num);
    }
}
//q3
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number = " + reverse);
    }
}
//q4
import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if(original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
//q5
import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0)
                count++;
        }

        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
//q6
import java.util.Scanner;

class BinaryDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter Binary number: ");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal = " + decimal);

        // Decimal to Binary
        System.out.print("Enter Decimal number: ");
        int num = sc.nextInt();
        String bin = Integer.toBinaryString(num);
        System.out.println("Binary = " + bin);
    }
}
//q7
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if(original == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
//q8
import java.util.Scanner;

class SumNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.println("Sum = " + sum);
    }
}
//q9
class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "  HelloJava  ";

        System.out.println("Length: " + s.length());
        System.out.println("charAt(2): " + s.charAt(2));
        System.out.println("Substring: " + s.substring(2,7));
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Trim: " + s.trim());
        System.out.println("IndexOf J: " + s.indexOf('J'));
        System.out.println("Equals: " + s.equals("HelloJava"));
        System.out.println("EqualsIgnoreCase: " + s.equalsIgnoreCase("  hellojava  "));
        System.out.println("CompareTo: " + s.compareTo("Hello"));
    }
}
//q10
class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        System.out.println("Append: " + sb);

        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        sb.delete(5,11);
        System.out.println("Delete: " + sb);

        sb.setCharAt(0, 'h');
        System.out.println("SetCharAt: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Substring: " + sb.substring(0,5));
    }
}
