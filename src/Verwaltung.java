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
                //Der nutzer muss den Klartext eingeben
                this.caesar.setKt(zeichenkette);
                //Der nutzer muss den Schlüssel angeben
                this.caesar.setS(schluessel);
                //Die verschlüsseln methode wird abgerufen um dann den KT zu verschlüsseln mit dem Schlüssel
                this.caesar.verschluesseln();
                //gibt den Gt aus
                System.out.println(this.caesar.getGt());
                //else if steht für wenn nicht option 1 dann option 2
            }else if (option == 2) {
                System.out.println("Gib das Wort an, welches Sie entschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                //Nutzer soll Gt angeben damit es vom pogramm gemerkt wird
                this.caesar.setGt(zeichenkette);
                //Nutzer soll den schlüssel angeben und es wird vom programm gemerkt
                this.caesar.setS(schluessel);
                //entschlüsseln methode wird abgerufen
                this.caesar.entschluesseln();
                System.out.println(this.caesar.getKt());
            }
        }
    }
}