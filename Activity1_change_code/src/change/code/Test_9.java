package change.code;



class C3 {
    final void show() {
        System.out.println("C3 show method");
    }
}

class D3 extends C3 {
    
    void display() {
        System.out.println("D3 display method");
    }
}

public class Test_9 {
    public static void main(String[] args) {

        C3 obj = new D3();  
        obj.show();         

        D3 d = new D3();
        d.display();
    }
}

