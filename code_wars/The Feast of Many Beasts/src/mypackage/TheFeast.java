package mypackage;

public class TheFeast {
    public static void main(String[] args) {
        String beast = "great blue heron";
        String dish = "garlic nann";

        if (dish.charAt(0) == beast.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
