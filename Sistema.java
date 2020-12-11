public class Sistema
{
   private ColaDeTrabajos [] vecTrabajos; 
      
   public Sistema()
   {
      vecTrabajos=new ColaDeTrabajos[3];
      vecTrabajos[0]=new ColaDeTrabajos();
      
      vecTrabajos[1]=new ColaDeTrabajos();
      
      vecTrabajos[2]=new ColaDeTrabajos();
   }
   public void añadirTrabajo(Trabajo t)
   {
      if((t.getUsuario().getPrioridad()>0)&(t.getUsuario().getPrioridad()<=99))
      vecTrabajos[0].insertar(t);
      
      if((t.getUsuario().getPrioridad()>99)&(t.getUsuario().getPrioridad()<=199))
      vecTrabajos[1].insertar(t);
   }
   public Trabajo siguienteTrabajo()
   {
      Trabajo aux=null;
      if(!vecTrabajos[0].estaVacia())
         aux=vecTrabajos[0].borrar();
      if(!vecTrabajos[1].estaVacia())
         aux=vecTrabajos[1].borrar();
         
         return aux;
   }
   
   
}