package change.code;

class Test_11 {
    protected int x = 5;   

    public static void main(String[] args) {
        F2 obj = new F2();
        obj.print();
    }
}

class F2 extends Test_11 {
    int x = 15;

    void print() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x); 
    }
}
