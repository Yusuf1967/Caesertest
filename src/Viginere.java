//
public class Viginere extends Kryptomat{

    private String sv;
    private int ASCII;
    private int a = 0;
    private int g = 0;
    public Viginere(){
        kt = "";
        gt= "";
        sv="";
        a = 0;
        g = 0;
    }
    public String verschluesseln()
    {
        //System.out.println("ich funktuniere");
        for (int i = 0; i< kt.length(); i++ ) {

            int h =  this.getAscii(kt.charAt(i));
            // System.out.println("test 1");
            g =this.getAscii(sv.charAt(a));
            g = g-65;
            //System.out.println("Test "+g);
            while(h+g>91)
            {g=g-26;}
            gt= gt + this.getChar(h+g);
            //System.out.println("gt:"+gt);
            a++;
            if (a >= sv.length())
            {a=0;}
        }// Die Schleife geht das zu verschlüsselnde Wort durch und kriegt durch die Methode
        //getAscii den Ascii wert des Buchstabens an der stelle I und speichert den in h
        // g speichert den Asciiwert des Buchstabens vom Schlüssel an der Stelle a
        //g wird minus 65 gerechnet damit der Schlüssel + das zu verschlüsselnde Wort
        // nicht aus der Ascii tabelle des Lateinischen Alphabet überschreitet
        //in gt werden die Ascii werte von dem zu Verschlüsselnden Wort + dem Schlüsseln gespeichert
        // a wird erhöht um den nächsten Buchstaben im Schlüssel zu bekommen
        // die if abfrage vergleicht den wert von a mit der Länge des Schlüssels wenn a
        // größer ist als die LÄnge dann wird a wieder auf 0 gesetzt
        //heute weiß ich und gott was die Methode macht morgen nur gott!!
        return null;
    }
    public void entschluessln() {
        a = 0;
        for(int i = 0; i< gt.length(); i++ )
        {

            int m =  this.getAscii(gt.charAt(i));
            int x = this.getAscii(sv.charAt(a))-65;
            while(m-x<65)
            {m=m+26;}
            kt = kt + this.getChar(m-x);
            a++;
            // System.out.println(Kt);
            if (a >= sv.length())
            {a=0;}
        }//Die schleife geht das zu entschlüsselnde wort durch. Von der Methode get Ascii
        // Wird der Ascii wert von den Buchstaben von dem zu entschlüsselnden Wort übermittelt.
        // sv stelt den Schlüssel da. Durch getAscii kriegen wir die Ascii werte von den Buchstaben des Schlüssels
        // Diese Werte ziehen wir dann vom Ascii wert von den Buchstaben des zu entschlüsselndes Wortes ab.
        // Falls der neue wert den Definitions bereich des Lateinischen alphabets verlässt wird mit der while schleife
        // +26 drauf gerechnet um so wieder vorne im Lateinischen Alphabet anzufangen.
        //die  if abfrage vergleicht den wert von a mit der Länge des Schlüssels wenn a
        // größer ist als die LÄnge dann wird a wieder auf 0 gesetzt
        //heute weiß ich und gott was die Methode macht morgen nur gott!!
    }

    @Override
    public void setkt(String zeichenkette) {

    }

    @Override
    public void setgt(String zeichenkette) {

    }

    @Override
    public void entschluesseln() {

    }

    public void setS(String pWert ){sv = pWert;}
    // kriegt den schlüssel den der Benutzer angibt
    public String getS() {
        return sv;
    }//gibt den Ascii wert an der Stelle i zurück

}