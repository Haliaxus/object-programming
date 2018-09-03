package pilot_obiektowo;

import java.util.Scanner;

public class controller {

    private boolean onOff;
    int voice = 5, channels=1;


    private void setChannelsminus() {
        if (onOff) {
            if (getChannels() > 1) {
                channels = getChannels() - 1;
                System.out.println("Kanał: " + getChannels());
            } else {
                channels = 9;
                System.out.println("Kanał: "+getChannels());
            }
        } else System.out.println("Najpierw włącz telewizor.");
    }

    private void setChannelsplus() {
        if (onOff) {
            if (getChannels() <9) {
                channels = getChannels() + 1;
                System.out.println("Kanał: " + getChannels());
            } else {
                channels = 1;
                System.out.println("Kanał: "+getChannels());
            }
        } else System.out.println("Najpierw włącz telewizor.");
    }

    private int getChannels() {
        return channels;
    }







    private void setVoiceminus() {
        if (onOff) {
            if (getVoice() > 1) {
                voice = getVoice() - 1;
                System.out.println("Dzwięk: " + getVoice());
            } else System.out.println("Dzwiek jest ustawiony na minimum.");
        } else System.out.println("Najpierw włącz telewizor.");
    }

    private void setVoiceplus() {
        if (onOff) {
            if (getVoice() < 15) {
                voice = getVoice() + 1;
                System.out.println("Dzwięk: " + getVoice());
            } else System.out.println("Dzwiek jest ustawiony na maximum.");
        } else System.out.println("Najpierw włącz telewizor.");
    }


    private int getVoice() {
        return voice;
    }





    private void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    private void getOnOff() {
        if(onOff==true)
            System.out.println("TV włączony.");
        else
            System.out.println("TV wyłączony.");
    }


    public void getMenu() {
        do {
            System.out.println("Wybierz przycisk:");
            System.out.println("1: Włącz Telewizor");
            System.out.println("2: Wyłącz Telewizor");
            System.out.println("3: Dzwięk+");
            System.out.println("4: Dzwięk-");
            System.out.println("5: Następny Kanał");
            System.out.println("6: Poprzedni Kanał");
            switch (getInput()) {

                case 1: {
                    if(onOff) System.out.println("Telewizor jest już włączony.");
                    else{
                    setOnOff(true);
                    getOnOff();}
                    break;
                }
                case 2: {
                    if(onOff==false) System.out.println("Nie możesz wyłączyć czegoś, co jest wyłączone.");
                    else{
                    setOnOff(false);
                    getOnOff();}
                    break;
                }
                case 3: {
                    setVoiceplus();
                    break;
                }
                case 4: {
                    setVoiceminus();
                    break;
                }
                case 5: {
                    setChannelsplus();
                    break;
                }
                case 6: {
                    setChannelsminus();
                    break;
                }
            }
        }while(onOff);
    }

    private int getInput() {
        Scanner s = new Scanner(System.in);
        int choice = -1;
        while(choice<0 || choice > 7){
            try{
                choice = Integer.parseInt(s.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Błędna wartość. Podaj ją raz jeszcze.");
            }
        }

        return choice;
    }
}
