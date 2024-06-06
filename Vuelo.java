public class Vuelo {
   private String tipoVuelo;
   private String origen;
   private String destino;
   private String duracion;
   private Compania aerolinea;
   private String tipoAvion;
   private String plazas;
   
   public Vuelo(String tipoVuelo, String origen, String destino, String duracion, Compania aerolinea, String tipoAvion, String plazas) {
      this.tipoVuelo = tipoVuelo;
      this.origen = origen;
      this.destino = destino;
      this.duracion = duracion;
      this.aerolinea = aerolinea;
      this.tipoAvion = tipoAvion;
      this.plazas = plazas;
   }
   
   public String getTipoVuelo() {
      return tipoVuelo;
   }

   public void setTipoVuelo(String tipoVuelo) {
      this.tipoVuelo = tipoVuelo;
   }

   public String getOrigen() {
      return origen;
   }

   public void setOrigen(String origen) {
      this.origen = origen;
   }

   public String getDestino() {
      return destino;
   }

   public void setDestino(String destino) {
      this.destino = destino;
   }

   public String getDuracion() {
      return duracion;
   }

   public void setDuracion(String duracion) {
      this.duracion = duracion;
   }

   public Compania getAerolinea() {
      return aerolinea;
   }

   public void setAerolinea(Compania aerolinea) {
      this.aerolinea = aerolinea;
   }

   public String getTipoAvion() {
      return tipoAvion;
   }

   public void setTipoAvion(String tipoAvion) {
      this.tipoAvion = tipoAvion;
   }

   public String getPlazas() {
      return plazas;
   }

   public void setPlazas(String plazas) {
      this.plazas = plazas;
   }

   public void imprimirDatos() {
      System.out.println("Tipo vuelo: " + tipoVuelo + "\nOrigen: " + origen + "\nDestino: " + destino + "\nDuracion: " + duracion + "\nAerolinea: "
            + aerolinea.getNombre() + "\nTipo de avion: " + tipoAvion + "\nPlazas: " + plazas);
   }
}
