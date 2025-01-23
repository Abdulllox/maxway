package org.example.interfake;

public abstract class D extends E implements A, B, C {
    public String name;

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void v() {
        System.out.println("c");
    }

    @Override
    public void e() {
        System.out.println("e");

    }

    public abstract void c();
}
