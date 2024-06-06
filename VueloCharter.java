public class VueloCharter extends Vuelo {
   private String nombrePaquete;
   private String fechaHora;
   
   public VueloCharter(String tipoVuelo, String origen, String destino, String duracion, Compania aerolinea,
         String tipoAvion, String plazas, String nombrePaquete, String fechaHora) {
      super(tipoVuelo, origen, destino, duracion, aerolinea, tipoAvion, plazas);
      this.nombrePaquete = nombrePaquete;
      this.fechaHora = fechaHora;
   }

   public String getNombrePaquete() {
      return nombrePaquete;
   }

   public void setNombrePaquete(String nombrePaquete) {
      this.nombrePaquete = nombrePaquete;
   }

   public String getFechaHora() {
      return fechaHora;
   }

   public void setFechaHora(String fechaHora) {
      this.fechaHora = fechaHora;
   }

   public void imprimirDatos() {
      super.imprimirDatos();
      System.out.println("Nombre del paquete: " + nombrePaquete + "\nFecha y hora: " + fechaHora + "\n");
   }
}
