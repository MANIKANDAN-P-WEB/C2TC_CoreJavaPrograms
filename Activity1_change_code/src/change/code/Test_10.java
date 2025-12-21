package change.code;

class E1 {
    E1(int x) {
        System.out.println("E1: " + x);
    }
}

class F1 extends E1 {
    F1() {
        super(13);  // Calls E1(int x) constructor
    }
}

public class Test_10 {
    public static void main(String[] args) {
        F1 obj = new F1();  // Creates F1 object, prints "E1: 13"
    }
}
