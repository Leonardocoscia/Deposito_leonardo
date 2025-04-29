import java.util.Scanner;
public class Esercizio {
    public static void main(String[] args) {
        // Valori predefiniti
        String nomeCorretto = "admin";
        String passwordCorretta = "12345";
        
        // Scanner per input
        
        
        // Richiesta del nome
        System.out.print("Inserisci il nome utente: ");
        String nomeInserito = input.nextLine();
 
        // Richiesta della password
        System.out.print("Inserisci la password: ");
        String passwordInserita = input.nextLine();

        // Controllo delle credenziali
        if (nomeInserito.equals(nomeCorretto) && passwordInserita.equals(passwordCorretta)) {
            System.out.println("Accesso consentito. ");
        } else { 
            System.out.println("Nome utente o password errati.");
        }
        input.close();
}}
