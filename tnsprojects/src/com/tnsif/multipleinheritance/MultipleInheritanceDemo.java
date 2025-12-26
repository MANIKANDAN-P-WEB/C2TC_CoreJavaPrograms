package com.tnsif.multipleinheritance;

interface mani {
    void show();
}

interface name {
    void display();
}

class A implements mani, name {

    public void show() {
        System.out.println("I am learning Java");
    }

    public void display() {
        System.out.println("I am learning Python");
    }
}

public class MultipleInheritanceDemo {

    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.display();
    }
}
