import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välkommen till elev registreringen");
        elev ny_elev = new elev();
        System.out.print("Skriv in ditt namn:");
        ny_elev.namn = tangentbord.nextLine();
        System.out.print("Skriv in ditt personummer:");
        ny_elev.personummer = tangentbord.nextLine();
        System.out.print("Skriv in din Email:");
        ny_elev.email = tangentbord.nextLine();
        System.out.print("Skriv in ditt mobilnummer:");
        ny_elev.mobilnummer = tangentbord.nextLine();
        System.out.print("Skriv in din Klass:");
        ny_elev.Klass = tangentbord.nextLine();
        System.out.print("Skriv in ditt Program:");
        ny_elev.Program = tangentbord.nextLine();

        System.out.println("\nDu har registrerat dig med följande information:");
        System.out.println("Namn:" + ny_elev.namn);
        System.out.println("Personummer:" + ny_elev.personummer);
        System.out.println("Email:" + ny_elev.email);
        System.out.println("Mobilnummer:" + ny_elev.mobilnummer);
        System.out.println("Klass:" + ny_elev.Klass);
        System.out.println("Program:" + ny_elev.Program);
        tangentbord.close();
    }
}
