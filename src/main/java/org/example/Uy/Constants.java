package org.example.Uy;

public interface Constants {
    double PI = 3.14159;
    int MAX_USERS = 100;
}

class CircleArea implements Constants {
    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class UserManager implements Constants {
    private int currentUsers;

    public UserManager(int currentUsers) {
        this.currentUsers = currentUsers;
    }

    public boolean canAddUser() {
        return currentUsers < MAX_USERS;
    }
}
