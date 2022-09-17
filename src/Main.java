import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X = 0.0;
        double Y = 0.0;
        boolean completed = false;
        while(!completed){
            try {
                System.out.println("Input an X coordinate");
                X = Double.parseDouble(scanner.nextLine());
                System.out.println("Input a Y coordinate");
                Y = Double.parseDouble(scanner.nextLine());
                completed = true;
            } catch(Exception e){
                System.out.println("Invalid Input. Please try again.");
            }
        }
        if(X == 0 || Y == 0){
            System.out.println("No Quadrant");
        } else {
            if (X < 0) {
                if (Y < 0) {
                    System.out.println("Quadrant 3");
                } else {
                    System.out.println("Quadrant 2");
                }
            }
            if (X > 0) {
                if (Y < 0) {
                    System.out.println("Quadrant 4");
                } else {
                    System.out.println("Quadrant 1");
                }
            }
        }
    }
}
