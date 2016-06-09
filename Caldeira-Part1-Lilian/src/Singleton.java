public class Singleton {
   public static void main(String[] args) {
      Caldeira tmp = Caldeira.getInstance( );
      tmp.drenar( );
      tmp.encher( );
      tmp.ferver();
      tmp.encher( );
      tmp.drenar( );
      tmp.ferver();
      Caldeira tmp1 = Caldeira.getInstance( );
      tmp1.drenar( );
      tmp1.encher( );
      tmp1.ferver();
      tmp1.encher( );
      tmp1.drenar( );
      tmp1.ferver();
   }
}