public class Compania {
   private String nombre;
   
   public Compania(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void imprimirDatos() {
      System.out.println("Compañía: " + nombre);
   }
}
