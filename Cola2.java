public class Cola2
{
   private final int maxcola=50;
   private int[] elementos; 
   private int frente, ultimo; 
      
   public Cola2()
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
      return (ultimo == maxcola-1);
   }


   public void insertar(int elem)
   {
      elementos[ultimo]=elem;
      ultimo++;
   }

   public int borrar()
   {
      int aux=elementos[frente];
      for(int i=0;i<ultimo;i++)
      elementos[i]=elementos[i+1];
      return aux;
   }  
}