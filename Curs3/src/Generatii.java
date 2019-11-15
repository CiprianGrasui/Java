import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Introduceti varsta");
        String generatia;
        if(age < 0) {
            System.out.println("Varsta incorecta");
            return;
        }if (age <= 0) {
            System.out.println("Alfa");
        } else if (age <= 20) {
            generatia = "z";
        } else {
            generatia = "builders";
            System.out.println("Generatia este: " + generatia);
        }
    }
}

