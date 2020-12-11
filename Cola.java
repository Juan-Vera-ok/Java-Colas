public class Cola
{
   private final int maxcola=50;
   private int[] elementos; 
   private int frente, ultimo; 
      
   public Cola()
   {
      elementos=new int[maxcola];
      frente=0;
      ultimo=0;
   }
   
   public boolean estaVacia()
   {
      return (ultimo == frente);
   }

   public boolean estaLlena()
   {
      int sigultimo=siguiente(ultimo);
      return (sigultimo == frente);
   }

   private int siguiente(int subind)
   {
      if(subind == maxcola - 1)
         return 0;
      else
         return ++subind;
   }

   public void insertar(int elem)
   {
      ultimo=siguiente(ultimo);
      elementos[ultimo]=elem;
   }

   public int borrar()
   {
      frente=siguiente(frente);
      return elementos[frente];
   }  
}