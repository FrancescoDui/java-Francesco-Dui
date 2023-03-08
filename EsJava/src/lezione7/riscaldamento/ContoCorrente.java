package lezione7.riscaldamento;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private  double saldo;
    private int id;
    private static int prossimoId;

    public ContoCorrente(String nome , String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo =0;
        this.id=prossimoId++;
    }//end costruttore
    public void preleva(double valore){
        if(valore<0 && valore<this.saldo)
            System.out.println("Impossibile attuare l'operazione ");
        else {
            this.saldo -=valore;
            //System.out.println("Il saldo è: "+this.saldo);
        }//end else
    }//end preleva
    public  void deposita(double valore){
        if(valore<0)
            System.out.println("Impossibile attuare l'operazione ");
        else {
            this.saldo +=valore;
            //System.out.println("Il saldo è: "+this.saldo);
        }//end else
    }//end deposita
    public double getSaldo(){
       return saldo;
    }//end getSaldo
    public void setNome(String nome){
       this.nome=nome;
    }//end setNome


}//end ContoCorrente
