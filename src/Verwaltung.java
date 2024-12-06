import java.util.Scanner;
public class Verwaltung {

    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;

    private Polybius polybius;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        viginere= new Viginere();
        scanner = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Caesar verschuesseln");
            System.out.println("[2] Caesar entschuesseln ");
            System.out.println("[0] Beenden");
            System.out.println("[3] Viginere verschuesseln");
            System.out.println("[4] Viginere entschuesseln");
            System.out.println("[5] Polybius verschuesseln");

            option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setS(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(this.caesar.getKt());
                this.caesar.verschluesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.caesar.getGt());


            } else if (option == 2) {
                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setGt(zeichenkette);
                this.caesar.setS(schluessel);
                System.out.println("========Geheimtext=====");
                System.out.println(zeichenkette);
                this.caesar.entschluesseln();
                System.out.println("========Klartext=====");
                System.out.println(this.caesar.getKt());

            } else if (option == 0) {
                break;
            } else if (option == 3) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib das Codewort an:");
                String schluesselString = scanner.nextLine();
                String schluessel =(schluesselString);
                viginere = new Viginere();
                this.viginere.setkt(zeichenkette);
                this.viginere.setS(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(zeichenkette);
                this.viginere.verschluesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.viginere.getGt());


            } else if (option == 4) {

                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib das Codewort an:");
                String schluesselString = scanner.nextLine();
                String schluessel = (schluesselString);
                viginere = new Viginere();
                this.viginere.setgt(zeichenkette);
                this.viginere.setS(schluessel);
                System.out.println("========Geheimtext=====");
                System.out.println(zeichenkette);
                this.viginere.entschluesseln();
                System.out.println("========Klartext=====");
                System.out.println(this.viginere.getKt());


            }
            else if (option== 5){
                System.out.println("Gib die zeichenkette an,die verschuesselt werden soll");
                String zeichenkette = scanner.nextLine();
                polybius = new Polybius();
                this.polybius.setKt(zeichenkette);
                this.polybius.verschluesseln();
                System.out.println("========Geheimtext========");

                System.out.println(this.polybius.getGt());
            }
        }
    }
}