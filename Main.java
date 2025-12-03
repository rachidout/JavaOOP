import java.util.*;
import Voiture.*;
public class Main{
   public static void main(String args[]){
   
    Roue[] lesRoue = new Roue[4];
    lesRoue[0] = new Roue(10,5);
    lesRoue[1] = new Roue(10,5);
    lesRoue[2] = new Roue(10,5);
    lesRoue[3] = new Roue(10,5);

    Voiture V1 = new Voiture("2025", "Mercedes Benz", 350, lesRoue, "V12", 500);
    System.out.println(V1.toString());
    V1.demarre();
    V1.accelere(100);
      V1.accelere(100);
        V1.accelere(100);
    
   
    
    V1.mouterestchaffe();


   }
}