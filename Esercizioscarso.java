import java.util.Scanner;
public class Esercizioscarso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input dei due numeri
        System.out.print("Inserisci il primo numero: ");
        int numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = input.nextInt();

        // operazioni
        int somma = numero1 + numero2;
        int differenza = numero1 - numero2;
        int prodotto = numero1 * numero2;

        // Output
        System.out.println("somma: " + somma);
        System.out.println("differenza: " + differenza);
        System.out.println("moltiplicazione: " + prodotto);

        input.close();
    
}}
