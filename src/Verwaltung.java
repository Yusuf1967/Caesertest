import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caesar caesar;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] verschluesseln");
            System.out.println("[2] entschluesseln");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Gib das Wort an, welches Sie verschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setS(schluessel);
                this.caesar.verschluesseln();
                System.out.println(this.caesar.getGt());
            }else if (option == 2) {
                System.out.println("Gib das Wort an, welches Sie entschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setS(schluessel);
                this.caesar.verschluesseln();
                System.out.println(this.caesar.getGt());
            }
        }
    }
}