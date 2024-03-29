package esercitazione.lezione5;
/** @author Francesco Dui
 * In questa classe si va ha costruire un archetipo per quanto riguarda un conto corrente  generico.*/
public class ContoCorrenteBancario {
    private String user="";
    private String password="";
    private double saldoConto=0;

    public ContoCorrenteBancario() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldoConto() {
        return saldoConto;
    }

    public void setSaldoConto(double saldoConto) {
        this.saldoConto = saldoConto;
    }

    public ContoCorrenteBancario(String user, String password, double saldoConto) {
        this.user = user;
        this.password = password;
        this.saldoConto=saldoConto;
    }
    @Override
    public String toString() {
        return "ContoCorrenteBancario{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", saldoConto=" + saldoConto +
                '}';
    }

    public static void main(String[] args) {
        ContoCorrenteBancario contoGino=new ContoCorrenteBancario("Gino","dsaga79",500);
        System.out.println(contoGino.toString());
    }
}
