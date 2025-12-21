package change.code;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class Test_5 extends A3 {

    void show() {
        System.out.println("B display");
    }

    public static void main(String[] args) {
        Test_5 obj = new Test_5();
        obj.display(); 
        obj.show();
    }
}
