package esercizio.pkg16;

public class Persona {
    private String nome, cognome, telefono, cittaPartenza, cittaDestinazione, data;

    public Persona(String nome, String cognome, String telefono, String cittaPartenza, String cittaDestinazione, String data) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.data = data;
    }
    public Persona(Persona p) {
        this.nome = p.nome;
        this.cognome = p.cognome;
        this.telefono = p.telefono;
        this.cittaPartenza = p.cittaPartenza;
        this.cittaDestinazione = p.cittaDestinazione;
        this.data = p.data;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome + "\nTelefono: " + telefono + "\nCitta Partenza: " + cittaPartenza + "\nCittaDestinazione: " + cittaDestinazione + "\nData: " + data;
    }
}