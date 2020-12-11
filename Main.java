public class Main
{
   public static void main (String[]args)
   {
      Cola3 c1;
      c1=new Cola3();  
      
      if(!c1.estaLlena())
      c1.insertar(2);
      c1.insertar(44);
      c1.insertar(2);
      
      System.out.println(c1.contar());
      System.out.println(c1.borrar());
      System.out.println(c1.borrar());
      System.out.println(c1.contar());
      
      c1.insertar(55);
      c1.insertar(1);
      c1.mostrar();
      System.out.println(c1.contar());
      //c1.eliminarRepetidos();
   }
   
}