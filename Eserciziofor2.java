import java.util.Scanner;

public class Eserciziofor2 {
    public static void main(string[] args) {
        Scanner input = new Scanner (System.in);
        String username = "";
        String password = "";
        boolean registrato = false;
        boolean autenticato = false;

        // Ciclo di registrazione
        while (!registrato) {
            System.out.println(" REGISTRAZIONE ");
            System.out.print("Scegli un nome utente: ");
            username = input.nextLine();
            System.out.print("Scegli una password: ");
            password = input.nextLine();
            System.out.println("Registrazione completata");
            restigrato = true;
        }    
        
        // Ciclo di autenticazione
        while (!autenticato) {
            System.out.println(" LOGIN ");
            System.out.print("Nome utente: ");
            String nomeInserito = input.nextLine();
            System.out.print("Password: ");
            String passwordInserita = input nextLine();

            if (nomeInserito.equals(username) && passwordInserita.equals(password)) {
                System.out.println("Accesso effettuato con succeso");
                autenticato = true;
            } else {
                System.out.println("Credenziali errate. Riprova");
            }
        }          
        // Post-login
        boolean attivo = true;
        while (attivo) {
            System.out.println(" MENU ");
            System.out.println("1. Calcolatrice");
            System.out.println("2. Cambia username");
            System.out.println("3. Cambia password");
            System.out.println("4. Esci");
            System.out.println("Scegli un opzione");
            int scelta = input.nextInt();
            input.nextLine(); // pulisce buffer

            switch (scelta) {
                case 1:
                     // Calcolatrice
                     System.out.print("Inserisci il primo numero: ");
                     double a = input.nextDouble();
                     System.out.print("Inserisci il secondo numero: ");
                     input.nextLine(); // pulisce buffer

                     System.out.print("Operazione (+, -, *, /): ");
                     String op = input.nextLine();

                     double risultato;
                     switch (op) {
                        case "+":
                            risultato = a + b;
                            break;
                        case "-":
                            risulato = a - b;
                        case "*":
                            risulato = a * b;
                        case "/":
                            if (b != 0) {
                                risulato = a / b;
                            } else {
                                System.out.println("Errore: non puoi dividere per zero.");
                                break;
                            }
                        default:
                            System.out.println("Operazione non valida.");
                            continue;
                    }          
                case 2:
                    // Cambio username
                    System.out.print("Inserisci il nuovo username: ");
                    username = input.nextLine();
                    System.out.println("Username aggiornata.");
                    break;

                case 3:
                    // Cambio password
                    System.out.print("Inserisci la nuova password: ");
                    password = input.nextLine();          
                    System.out.println("Password aggiornata");

                case 4: 
                    // Uscita
                    System.out.println("Chiusura del programma");
                    attivo = false;
                    break;

                default: 
                    System.out.println("Scelta non valida.");
                }
            }
            
            input.close();
                
    
}}
