public class Cola3
{
   private final int maxcola=4;
   private int[] elementos; 
   private int frente, ultimo,i,j; 
      
   public Cola3()
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
   
   public int contar()
   {
      int aux=frente;
      int cont=0;
      while(aux!=ultimo){
      aux=siguiente(aux);
      cont=cont+1;}
      return cont;
   }
   
   public void mostrar()
   {
      int aux=frente;
      while(aux!=ultimo){
         System.out.println(elementos[aux]);
         aux=siguiente(aux);}
   }
}