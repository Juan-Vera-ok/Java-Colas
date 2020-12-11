public class ColaDeTrabajos
{
   private final int maxcola=5;
   private Trabajo[] elementos; 
   private int frente, ultimo,i=0,prioridad; 
   private Trabajo tra;
      
   public ColaDeTrabajos()
   {
      elementos=new Trabajo[maxcola];
      frente=0;
      ultimo=0;
      prioridad=499;
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

   public void insertar(Trabajo elem)
   {
      ultimo=siguiente(ultimo);
      elementos[ultimo]=elem;
   }
   public int getPrioridadCola()
   {
      return prioridad;
   }

   public Trabajo borrar()
   {
      frente=siguiente(frente);
      return elementos[frente];
   }

   
   public void mostrar()
   {
      ColaDeTrabajos aux;
      aux=new ColaDeTrabajos();
      while(!this.estaVacia())
      {
      Trabajo A=borrar();
      System.out.println(A.getToken());
      aux.insertar(A);
      }
      while(!aux.estaVacia())
      {
         this.insertar(aux.borrar());
      }
      //Este metodo es para no perder informacion
   }
   
}