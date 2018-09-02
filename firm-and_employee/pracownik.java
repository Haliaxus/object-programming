package firm_and_employee;

public class pracownik {

    private String imie, nazwisko;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String setImie(String imie) {
        this.imie = imie;
        return imie;
    }

    public String setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return nazwisko;
    }

    public int setWiek(int wiek) {
        this.wiek = wiek;
        return wiek;
    }
}
