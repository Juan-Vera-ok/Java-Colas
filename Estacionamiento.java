public class Estacionamiento
{
   public static void main (String[]args)
   {
      ColaDeAutos c1,c2;
      Auto a1,A;
      char a;
      String B;
      boolean bandera;
      
      c1=new ColaDeAutos();
      
      do{
      System.out.println("Ingrese 'e' para entrar");
      System.out.println("Ingrese 's' para salir");
      System.out.println("Ingrese 'z' para salir de sistema");
      a=Console.readChar("Ingrese opcion");
      switch(a) {
            case 'e':
            while(!c1.estaLlena())
            {
               a1=new Auto();
               String C=Console.readString("Ingrese patente");
               a1.setPatente(C);
               c1.insertar(a1);
            }
            break;
            case 's':
            {  do
               {
                  bandera=false;
                  B=Console.readString("Ingrese patente");
                  A=c1.borrar();
                  if(A.getPatente().equals(B)){
                  System.out.println("Se encontro "+A.getPatente());
                  bandera=true;} 
                  else
                  System.out.println("No se encontro");        
               }while(!c1.estaVacia()& bandera!=true);
            }break;
      }
   }while(a!='z');
}
}