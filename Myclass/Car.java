package Myclass;

public class Car {
    private String name ;
    private float maxSpeed ;
    private int Price ;
    private int id;
    private static int comp=0 ;
    public Car(){
        System.out.println("HEY THE parent \n");
    }
    public Car(String name , float maxSpeed , int Price) {
         this.name = name ;
         this.maxSpeed = maxSpeed;
         this.Price = Price ;
         this.id = comp++;
    }
    public Car(Car obj){
           this(obj.name , obj.maxSpeed , obj.Price);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getid(){
        return this.id;
    }
}
