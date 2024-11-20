import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class Viginiere {
    private String Kt;
    private String S;
    private String Gt;


    public Viginiere(){
        Gt ="";
        Kt ="";

    }
    public void verschluesseln(){
        Gt="";
        for (int i=0 ;i < Kt.length();i++) {
            int h = this.getASCII(Kt.charAt(i));
            Gt = Gt + this.getChar(h + S);
        }

    }
    public void entschluesseln(){
        Kt="";
        for (int i=0 ; i < Gt.length();i++){
            int k = this.getASCII(Gt.charAt(i));
            Kt=Kt + this.getChar(k - S);
        }


    }
    private int getASCII (char pWert){

        return  pWert;
    }
    private char getChar(int pWert){
        return (char) pWert;
    }

    public String getKt(){
        return Kt;
    }
    public String getGt(){
        return Gt;
    }

    public void setGt(String gt){
        Gt=gt;
    }
    public void setKt(String kt) {
        Kt = kt;
    }
    public void setS(String s) {
        S = s;
    }

    public String  getS(){
        return S;
    }


}