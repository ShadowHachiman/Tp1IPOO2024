import java.sql.Date;

public class Clima {
    private String ciudad;
    private String provincia;
    private String pais;
    private double temperaturaActual;
    private double temperaturaMinima;
    private double temperaturaMaxima;
    private char escala;  // 'C' para Celsius, 'F' para Fahrenheit
    private double presion;
    private double viento;
    private String direccionViento;
    private double humedad;
    private double visibilidad;
    private Date ultimaActualizacion;

    public Clima(String ciudad, String provincia, String pais, double temperaturaActual, double temperaturaMinima, double temperaturaMaxima, char escala, double presion, double viento, String direccionViento, double humedad, double visibilidad, Date ultimaActualizacion) {
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.temperaturaActual = temperaturaActual;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.escala = escala;
        this.presion = presion;
        this.viento = viento;
        this.direccionViento = direccionViento;
        this.humedad = humedad;
        this.visibilidad = visibilidad;
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getTemperaturaActual() {
        return temperaturaActual;
    }
    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }
    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }
    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    public char getEscala() {
        return escala;
    }
    public void setEscala(char escala) {
        this.escala = escala;
    }
    public double getPresion() {
        return presion;
    }
    public void setPresion(double presion) {
        this.presion = presion;
    }
    public double getViento() {
        return viento;
    }
    public void setViento(double viento) {
        this.viento = viento;
    }
    public String getDireccionViento() {
        return direccionViento;
    }
    public void setDireccionViento(String direccionViento) {
        this.direccionViento = direccionViento;
    }
    public double getHumedad() {
        return humedad;
    }
    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }
    public double getVisibilidad() {
        return visibilidad;
    }
    public void setVisibilidad(double visibilidad) {
        this.visibilidad = visibilidad;
    }
    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
}
