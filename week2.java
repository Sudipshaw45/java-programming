//q1
class SimpleArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}
//q2
class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//q3
class SumEven {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 7, 10};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}
//q4
class Sum2DArray {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
        int sum[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//q5
class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i][i];
        }

        System.out.println("Sum of diagonal elements = " + sum);
    }
}
//q6
class MatrixMultiply {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
        int result[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication Result:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//q7
class Student {
    int id;
    String name;

    Student() {
        id = 101;
        name = "Sudip";
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
//q8
class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(102, "Rahul");
        s1.display();
    }
}
//q9
class ReturnValue {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnValue obj = new ReturnValue();
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);
    }
}
//q10
class CallExample {

    void callByValue(int x) {
        x = x + 10;
    }

    void callByReference(int arr[]) {
        arr[0] = arr[0] + 10;
    }

    public static void main(String[] args) {
        CallExample obj = new CallExample();

        int num = 5;
        obj.callByValue(num);
        System.out.println("After call by value: " + num);

        int arr[] = {5};
        obj.callByReference(arr);
        System.out.println("After call by reference: " + arr[0]);
    }
}
