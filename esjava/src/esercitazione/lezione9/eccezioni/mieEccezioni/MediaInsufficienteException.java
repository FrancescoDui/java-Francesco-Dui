package esercitazione.lezione9.eccezioni.mieEccezioni;

public class MediaInsufficienteException extends Exception {
    public MediaInsufficienteException() {
    }
    public MediaInsufficienteException(String message) {
        super(message);
    }
}
