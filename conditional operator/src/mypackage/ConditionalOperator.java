package mypackage;

public class ConditionalOperator {
    public static void main(String[] args) {
        int i = 4;

        System.out.println("Start of program");

        if (i > 5) {
            System.out.println("i > 5");
        }

        else {
            System.out.println("i <= 5");
        }

        System.out.println("End of program");

        switch (i){
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("Then number is 3");
                break;
            default:
                System.out.println("I don't know this number!");
                break;
        }
    }
}
