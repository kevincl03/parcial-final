import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Aeropuerto> aeropuertos = new ArrayList<>();
      List<Vuelo> vuelos = new ArrayList<>();

      aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", "1"));
      aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", "1"));
      aeropuertos.add(new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", "1"));
      aeropuertos.add(new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", "0"));
      aeropuertos.add(new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", "-3"));

      Compania iberia = new Compania("Iberia");
      Compania britishAir = new Compania("British Air");
      Compania ryanAir = new Compania("Ryan Air");
      Compania spanair = new Compania("Spanair");

      vuelos.add(new VueloRegular("R", "BCN01", "MAD01", "01:00", iberia, "Airbus", "150", "L-15:00 X-15:00 V-15:00 D-15:00", "-"));
      vuelos.add(new VueloRegular("R","MAD01", "BCN01", "01:00", iberia, "Airbus", "150", "L-18:00 J-20:00 S-20:00", "-"));
      vuelos.add(new VueloRegular("R","BCN01", "LON01", "01:05", britishAir, "Boeing", "180", "L-10:00 J-10:00", "-"));
      vuelos.add(new VueloRegular("R","LON01", "BCN01", "01:05", britishAir, "Boeing", "180", "L-15:00 J-15:00", "-"));
      vuelos.add(new VueloRegular("R","BCN01", "LON01", "01:10", ryanAir, "Airbus", "120", "L-10:10 J-10:00", "-"));
      vuelos.add(new VueloRegular("R","LON01", "BCN01", "01:10", ryanAir, "Airbus", "120", "J-15:10 J-15:10", "-"));
      vuelos.add(new VueloRegular("R","LON01", "SPA01", "07:00", britishAir, "Boeing", "200", "X-09:45 J-09:45 S-09:45", "-"));
      vuelos.add(new VueloRegular("R","SPA01", "MAD01", "07:00", britishAir, "Boeing", "200", "X-20:25 J-20:25 S-20:25", "-"));
      vuelos.add(new VueloCharter("C","BCN01", "MAD01", "01:00", spanair, "Airbus", "150", "Viajes Condor", "1/2009/15 20:30"));
      vuelos.add(new VueloCharter("C","BCN01", "MAD01", "01:00", spanair, "Airbus", "150", "Viajes Condor", "1/2009/15 20:30"));
      vuelos.add(new VueloCharter("C","MAD01", "BCN01", "01:00", iberia, "Airbus", "150", "Viajes Condor", "1/2009/22 20:30"));
      vuelos.add(new VueloCharter("C","BCN01", "LON01", "01:00", britishAir, "Boeing", "180", "Viaje Ilusion", "2/2009/22 20:30"));
      vuelos.add(new VueloCharter("C","LON01", "BCN01", "01:00", britishAir, "Boeing", "180", "Viaje Ilusion", "3/2009/05 15:19"));
      vuelos.add(new VueloCharter("C","LON01", "BCN01", "01:00", britishAir, "Boeing", "180", "Viaje Ilusion", "3/2009/05 15:19"));
      vuelos.add(new VueloCharter("C","BCN01", "LON01", "01:00", ryanAir, "Airbus", "120", "TravelPlan", "1/2009/25 15:18"));
      vuelos.add(new VueloCharter("C","SPA01", "SPA01", "01:00", ryanAir, "Airbus", "120", "TravelPlan", "1/2009/31 22:20"));
      vuelos.add(new VueloCharter("C","SIB01", "SPA01", "01:00", ryanAir, "Airbus", "120", "TravelPlan", "1/2009/31 22:20"));

      System.out.println("Vuelos de salida:");
      for (Aeropuerto aeropuerto : aeropuertos) {
          System.out.println("\nDesde " + aeropuerto.getNombre() + ":\n");
          boolean hayVuelo = false;
          for (Vuelo vuelo : vuelos) {
              if (vuelo.getOrigen().equals(aeropuerto.getCodigo())) {
                hayVuelo = true;
                vuelo.imprimirDatos();
              }
          }
          if (!hayVuelo) {
            System.out.println("No se encontro vuelos de salida para este Aeropuerto.\n");
          }
      }

      System.out.println("\nVuelos de llegada:");
      for (Aeropuerto aeropuerto : aeropuertos) {
          System.out.println("\nA " + aeropuerto.getNombre() + ":\n");
          boolean hayVuelo = false;
          for (Vuelo vuelo : vuelos) {
              if (vuelo.getDestino().equals(aeropuerto.getCodigo())) {
                hayVuelo = true;
                vuelo.imprimirDatos();
              }
          }
          if (!hayVuelo) {
            System.out.println("No se encontro vuelos de llegada para este Aeropuerto.\n");
          }
      }
   }
}