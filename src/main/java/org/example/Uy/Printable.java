package org.example.Uy;

public interface Printable {
    void print();
}

interface Readable {
    void read();
}

class Book implements Printable, Readable {
    @Override
    public void print() {
        System.out.println("Printing the book content.");
    }

    @Override
    public void read() {
        System.out.println("Reading the book.");
    }
}
