package Rectengle;



public class Rectengle {
 
      private Point hg;
      private Point bd;
       
      public Rectengle () {
         this.hg = new Point();
         this.bd = new Point();
      }

      public Rectengle(Point h , Point b){
        this.hg = new Point(h);
        this.bd = new Point(b);
      }
      public void afficher(){
         System.out.println("hg.x"+ hg.getX() +"hg.y"+ hg.getY() +"bd.x"+ bd.getX() +"bd.y"+bd.getY()); 
      }
      public String toString(){
         return "Rectangle( hg-> "+ hg.toString() +"bd->"+ bd.toString() +")";
      }
      public int surface(){
          int y = hg.getY() - bd.getY() ;
          int x = bd.getX() - hg.getX() ;
          return x*y ;
      }


}   
