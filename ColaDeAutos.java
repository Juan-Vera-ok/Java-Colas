public class ColaDeAutos
{
   private final int maxcola=5;
   private Auto[] elementos; 
   private int frente, ultimo,i=0; 
      
   public ColaDeAutos()
   {
      elementos=new Auto[maxcola];
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

   public void insertar(Auto elem)
   {
      ultimo=siguiente(ultimo);
      elementos[ultimo]=elem;
   }

   public Auto borrar()
   {
      frente=siguiente(frente);
      return elementos[frente];
   }
   
   public void mostrar()
   {
      ColaDeAutos aux;
      aux=new ColaDeAutos();
      while(!this.estaVacia())
      {
      Auto A=borrar();
      System.out.println(A.getPatente());
      aux.insertar(A);
      }
      while(!aux.estaVacia())
      {
         this.insertar(aux.borrar());
      }
      
      
      
   }
   
   
}