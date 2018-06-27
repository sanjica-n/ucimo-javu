import java.util.Scanner;

public class Unos {
    public static void main(String[] args) {

        Scanner tastatura = new Scanner(System.in);
        System.out.print("Kako se zoves: ");

        String ime = tastatura.nextLine();
        System.out.print("Kako imas godina: ");

        int god = tastatura.nextInt();
        System.out.println("Zdravo " + ime + "!");
        System.out.println(god + " su najlepse godine.");

    }
}
