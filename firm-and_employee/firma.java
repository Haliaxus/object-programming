package firm_and_employee;

import java.util.Scanner;

public class firma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        pracownik p = new pracownik();
        int ile;
        System.out.println("Ilu pracownikow chcesz dodac?");
        ile = s.nextInt();
        if (ile>0)  {
            String imiona[] =new String[ile];
            String nazwiska[] = new String[ile];
            int wiek[] = new int[ile];
        for(int i=0; i<ile; i++) {
            System.out.println("Podaj Imie:");
            imiona[i] = p.setImie(s.next());
            System.out.println("Podaj Nazwisko:");
            nazwiska[i] = p.setNazwisko(s.next());
            System.out.println("Podaj Wiek:");
            wiek[i] = p.setWiek(s.nextInt());
        }
        for(int i=0; i<ile; i++){
            int lp = i+1;
            System.out.println();
            System.out.println("Pracownik "+lp);
            System.out.println("Imie: "+imiona[i]);
            System.out.println("Nazwisko: "+nazwiska[i]);
            System.out.println("Wiek: "+wiek[i]);
            System.out.println();
        }
    }
}}
