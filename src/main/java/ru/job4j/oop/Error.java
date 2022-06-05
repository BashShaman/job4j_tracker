package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.printf("Is active: %b\n", active);
        System.out.printf("Status: %d\n", status);
        System.out.printf("Message: %s\n", message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        Error errorTwo = new Error(true, 404, "file not found");
        Error errorThree = new Error(true, 418, "I'm a teapot");
        errorOne.printInfo();
        System.out.println();
        errorTwo.printInfo();
        System.out.println();
        errorThree.printInfo();
    }
}
