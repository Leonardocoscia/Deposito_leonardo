import java.util.Scanner;
public class Eserciziofor {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       double credito = 10.0; // Credito iniziale
       int scelta;
       boolean attivo = true;

       while (attivo && credito > 0) {
          // Menu
          System.out.println("\n*** Distributore Automatico ***");
          System.out.println("Credito disponibile: " + String.format("%.2f", credito) + "€");
          System.out.println("1. Caffe - 1.50€");
          System.out.println("2. Cappuccino - 2.00€");
          System.out.println("3. Te - 1.00€");
          System.out.println("4. Acqua - 0.50€");
          System.out.println("5. Uscire");
          System.out.println("Seleziona un'opzione: ");

          scelta = input.nextInt();
          double costo = 0;
          String prodotto = "";

          switch (scelta) {
            case 1: 
                costo = 1.50;
                prodotto = "caffe";
                break;
            case 2:
                costo = 2.00;
                prodotto = "cappuccino";
                break;
            case 3:
                costo = 1.00;
                prodotto = "te";
                break;
            case 4: 
                costo = 0.50;
                prodotto = "acqua";
            case 5:
                attivo = false;
                break;
            default: 
                System.out.println("Scelta non valida.");
}               
    if (scelta >= 1 && scelta <= 4) {
        if (credito >= costo) {
            credito -= costo;
            System.out.println("Hai acquistato:" + prodotto + " (" + costo + "€)");
        } else  {
            System.out.println("Credito insufficiente per acquistare " + prodotto + ".");
        }

        System.out.println("\nGrazie per aver acquistato.");
        System.out.println("Credito rimanente: " + String.format("%.2f", credito) + "€");

        input.close();
}}}}