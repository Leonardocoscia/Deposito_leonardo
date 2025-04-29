import java.util.Scanner;

public class EsercizioSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        final double PREZZO_BASE = 500.0;
        double prezzoFinale = PREZZO_BASE;

        // Età del conducente
        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();
        
        if (eta < 18) {
            System.out.println ("Non sei idoneo per l'assicurazione");
            input.close();
            return;
        } else if (eta <= 25) {
            prezzoFinale += PREZZO_BASE * 0.20; // Maggiorazione del 20%
        } else if (eta == 50) {
            prezzoFinale -= PREZZO_BASE * 0.10; // Sconto del 10%
        }

        // Anni di esperienza alla guida
        System.out.print("Inserisci gli anni di esperienza alla guida: ");
        int esperienza = input.nextInt();

        if (esperienza < 2) {
            prezzoFinale += PREZZO_BASE * 0.30;
        }
        
        // Numero di incidenti negli ultimi 5 anni
        System.out.print("Inserisci il numero di incidenti negli ultimi 5 anni: ");
        int incidenti = input.nextInt();

        if (incidenti > 4) {
            System.out.println("Non sei idoneo all'assicurazione");
            input.close();
            return;
        } else if (incidenti == 1) {
            prezzoFinale += PREZZO_BASE * 0.15;
        } else if (incidenti >= 2) {
            prezzoFinale += PREZZO_BASE * 0.30;
        }
        
        // Pacchetto assicurativo
        System.out.println("Scegli il pacchetto assicurativo (base, intermedio, premium: )");
        input.nextLine(); 

        String pacchetto = input.nextLine().toLowerCase();

        switch (pacchetto) {
            case "base":
               // nessuna modifica
               break;
            case "intermedio":
               prezzoFinale += PREZZO_BASE * 0.20;
               break;
            case "premium":
               prezzoFinale += PREZZO_BASE * 0.50;
               break;
            default:
               System.out.println("Pacchetto non valido. Impostato a 'base'.");
        }

        // output finale
        System.out.printf("Il preventivo per l'assicurazione è: %.2f €\n", prezzoFinale);

        input.close();
        
         
        
    }}
