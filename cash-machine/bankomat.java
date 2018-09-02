package bankomat.obiektowo;

import java.util.Scanner;

public class bankomat {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int ile, number = 0;
        boolean nazwa = false;
        karta_saldo karta = new karta_saldo("abc", 1000);
        karta.setSaldo(1000);
        karta.setNazwa_karty("abc");
        String karta_nazwa;
        do {
            System.out.print("Wloz karte, podaj nazwe karty: ");
            karta_nazwa = s.next();
            if(karta_nazwa.equals(karta.getNazwa_karty())) nazwa=true;
            else System.out.println("Tej karty nie ma w systemie. Podaj poprawna nazwe raz jeszcze.");
        }while(nazwa==false);
            do {
                System.out.println("Co chcesz zrobic w bankomacie:");
                System.out.println("1: Wyplac pieniadze");
                System.out.println("2: Wplac pieniadze");
                System.out.println("3: Sprawdz saldo");
                System.out.println("4: Wyjdz z bankomatu");
                switch (number = s.nextInt()) {
                    case 1: {
                        System.out.print("Ile pieniedzy chcesz wyplacic?: ");
                        ile = s.nextInt();
                        if (ile > karta.getSaldo())
                            System.out.println("Nie masz tyle pieniedzy na koncie, Twoje saldo wynosi: " + karta.saldo);
                        else {
                            karta.setSaldo(karta.getSaldo() - ile);
                            System.out.println("Wyplaciles wlasnie " + ile + ". Twoje pozostale saldo na karcie to: " + karta.saldo);
                        }
                        break;
                    }
                    case 2:{
                        System.out.print("Ile pieniedzy chcesz wplacic?: ");
                        ile = s.nextInt();
                        karta.setSaldo(karta.getSaldo()+ile);
                        System.out.println("Wplaciles na swoje konto "+ ile +", Twoje aktualne saldo to: "+ karta.getSaldo());
                        break;
                    }
                    case 3:{
                        System.out.println("Twoje saldo na karcie to: "+karta.getSaldo());
                        break;
                    }
                    case 4:{
                        System.out.println("Zamykam bankomat.");
                        break;
                    }
                    default:
                        System.out.println("nie zaznaczyles zadnej z dostepnych opcji");
                        break;

                }
            }while(number!=4);
    }
}
