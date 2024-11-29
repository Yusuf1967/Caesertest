public abstract class Kryptomat{
    public String kt;
    public String gt;
    //
    public abstract void verschluesseln();
    public  abstract void entschluessln();

    public char getChar(int pWert) {
        return (char)pWert;
    }// gibt den Buchstaben zum Ascii wert wieder aus
    public int getAscii(char pWert) {
        return (int) pWert;
    }
    // Gibt den Ascii wert zum angefragten Buchstaben aus
    public String getGt() {
        return gt;
    }// Gibt das verschlüsselte Wort zurück
    public void setGt(String pgt) {
        gt = pgt;
    }// kriegt den geheimtext den der Benutzter in der Konsole angibt
    public String getKt(){
        return kt;
    }// Gibt das entschlüsselte Wort aus
    public void setKt(String pKt){
        kt= pKt;
    }//kriegt das Verschlüsselte Wort welches der Benutzer angibt
}
