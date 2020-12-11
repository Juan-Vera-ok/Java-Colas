public class MainTrabajos
{
   public static void main (String[]args)
   {
      Sistema s1=new Sistema();
      Usuario u1= new Usuario();
      u1.setPrioridad(99);
      
      Trabajo t1=new Trabajo(22);
      Trabajo t2;
      t1.setUsuario(u1);
      
      s1.añadirTrabajo(t1);
      t2=s1.siguienteTrabajo();
      System.out.println(t2.getUsuario().getPrioridad());
   }
}