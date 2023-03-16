package esercitazione.lezione5;
/** @author Francesco Dui
 * In questa classe si va ha costruire un archetipo per quanto riguarda un Habitat generico.*/
public class Habitat {
    private double temperaturaMedia;// in °C
    private String latitudine;
    private String longitudine;
    private int altitudine;// in m
    private String bioma;
    private double precipitazioneAnnuale;// in ml/h
    private  String clima;

    public Habitat(double temperaturaMedia, String latitudine, String longitudine, int altitudine, String bioma, double precipitazioneAnnuale, String clima) {
        this.temperaturaMedia = temperaturaMedia;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.altitudine = altitudine;
        this.bioma = bioma;
        this.precipitazioneAnnuale = precipitazioneAnnuale;
        this.clima = clima;
    }

    public Habitat() {
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    public int getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(int altitudine) {
        this.altitudine = altitudine;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public double getPrecipitazioneAnnuale() {
        return precipitazioneAnnuale;
    }

    public void setPrecipitazioneAnnuale(double precipitazioneAnnuale) {
        this.precipitazioneAnnuale = precipitazioneAnnuale;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "temperaturaMedia=" + temperaturaMedia +
                ", latitudine='" + latitudine + '\'' +
                ", longitudine='" + longitudine + '\'' +
                ", altitudine=" + altitudine +
                ", bioma='" + bioma + '\'' +
                ", precipitazioneAnnuale=" + precipitazioneAnnuale +
                ", clima='" + clima + '\'' +
                '}';
    }

}
