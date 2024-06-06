public class VueloRegular extends Vuelo {
   private String horarioVuelo;
   private String informacionAdicional;
   
   public VueloRegular(String tipoVuelo, String origen, String destino, String duracion, Compania aerolinea,
         String tipoAvion, String plazas, String horarioVuelo, String informacionAdicional) {
      super(tipoVuelo, origen, destino, duracion, aerolinea, tipoAvion, plazas);
      this.horarioVuelo = horarioVuelo;
      this.informacionAdicional = informacionAdicional;
   }

   public String getHorarioVuelo() {
      return horarioVuelo;
   }

   public void setHorarioVuelo(String horarioVuelo) {
      this.horarioVuelo = horarioVuelo;
   }

   public String getInformacionAdicional() {
      return informacionAdicional;
   }

   public void setInformacionAdicional(String informacionAdicional) {
      this.informacionAdicional = informacionAdicional;
   }

   public void imprimirDatos() {
      super.imprimirDatos();
      System.out.println("Horario de vuelo: " + horarioVuelo + "\nInformacion adicional: " + informacionAdicional + "\n");
   }
}
