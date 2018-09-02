package bankomat.obiektowo;

public class karta_saldo {

    int saldo;
    String nazwa_karty;

    public karta_saldo(String nazwa_karty, int saldo){

    }

    public int getSaldo() {
        return saldo;
    }

    public String getNazwa_karty() {
        return nazwa_karty;
    }

    public void setNazwa_karty(String nazwa_karty) {
        this.nazwa_karty = nazwa_karty;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
