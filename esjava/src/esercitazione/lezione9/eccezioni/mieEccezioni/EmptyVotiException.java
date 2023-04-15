package esercitazione.lezione9.eccezioni.mieEccezioni;

public class EmptyVotiException extends Exception{
    public EmptyVotiException() {
    }
    public EmptyVotiException(String message) {
        super(message);
    }
}
