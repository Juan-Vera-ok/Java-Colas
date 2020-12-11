public class Trabajo
{
   private int token;
   private Usuario usu;
   
   public Trabajo(int t)
   {
      token=t;
   }
   
   public void setToken(int a)
   {
      token=a;
   }
   
   public int getToken()
   {
      return token;
   }
   public void setUsuario(Usuario u)
   {
      usu=u;
   }
   
   public Usuario getUsuario()
   {
      return usu;
   }
   
}