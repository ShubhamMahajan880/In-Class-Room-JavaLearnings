package in.mahajanDevelopers;
class Understanding {

    static {
        System.out.println("Calling to static of another created class");
    }

    {
        System.out.println("Calling to Init by default");
    }

    {
        System.out.println("Calling to 2nd init");
    }

    public Understanding() {
        System.out.println("Calling to init of Understanding Constructor");
        System.out.println("Calling to 2nd init of Understanding Constructor");
    }
}

public class Practices {

    static {
        System.out.println("Calling to static of Practices class");
    }

    public static void main(String[] args) {
        System.out.println("Learning about Init and Static blocks");

        Understanding u1 = new Understanding();

        System.out.println("Dealing with message printing");

        Understanding u2 = new Understanding();
    }
}