public class Auto
{
   private String patente;
   private int movimientos;
   
   public Auto()
   {
      patente="AAA 111";
      movimientos=0;
   }
   
   public void setPatente(String a)
   {
      patente=a;
   }
   
   public String getPatente()
   {
      return patente;
   }
   
   public void setMovimientos()
   {
      movimientos=movimientos+1;
   }
   public int getMovimientos()
   {
      return movimientos;
   }
   
}