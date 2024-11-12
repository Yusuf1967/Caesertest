import java.util.Scanner;

public class Verwaltung {
   private Scanner scanner;
   scanner = new Scanner();
   private Caeser caeser;
   caeser = new Caeser();
}

    public static void main(String[] args) {new Verwaltung();}

public Verwaltung(){
    Scanner scanner = new Scanner(System.in);
    while(true) {
        System.out.println("== HAUPTMENÜ ==");
        System.out.println("[1] Caeser verschluesseln");
        System.out.println("[2] Caeser entschluesseln");
        int option = scanner.nextInt();
        scanner.nextline();
        if (option == 1){
            System.out.println("Gib das zu verschlüsselnde wort an:");
            String zeichenkette = scanner.nextLine();
            System.out.println("Gib den Schlüssel an:");
            String schluesselString = scanner.nextLine();
            int schluessel = Integer.parseInt(schluesselString);
            Caeser caeser = new Caeser();
            this.caesar.setKt(zeichenkette);
            this.caeser.setS(schluessel);
            System.out.println("======Klartext======");
            System.out.println(this.caeser.getKt());
            this.caesar.verschluesseln();
            System.out.println("======Geheimtext======");
            System.out.println(this.caesar.getGt());

        }
    }


}

private final Caeser caesar;
private final Object caeser;

