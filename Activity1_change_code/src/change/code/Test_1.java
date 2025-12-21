package change.code;

class A {
    void show() {
        System.out.println("java");
    }
}

class B extends A {
    void show() {
        System.out.println("python");
    }
}

public class Test_1 {

	public static void main(String[] args) {
        A obj = new B();   
        obj.show();
    }
	
}

