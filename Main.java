import Listjava.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    Employee e1 = new Developer("ilyas", 2000);
    Employee e2 = new Developer("yassine", 2500);
    Employee e3 = new Manager("Rachid", 10000, 1000);
    List<Employee> Employees = new ArrayList<>();
    Employees.add(e1);
    Employees.add(e2);
    Employees.add(e3);
  
    for (Employee e : Employees) {
      System.out.println(e.toString());
    }
  }
}