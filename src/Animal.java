import java.util.*;
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species;
    }

    public static void main(String[] args) {
             List<Animal> animals = new ArrayList<Animal>();  // list of animals
             animals.add(new Animal("fish", false, true));
             animals.add(new Animal("kangaroo", true, false));
             animals.add(new Animal("rabbit", true, false));
             animals.add(new Animal("turtle", false, true));

        print(animals, a -> ! a.canSwim());
           }
  private static void print(List<Animal> animals, CheckTrait checker) {
             for (Animal animal : animals) {
                   if (checker.test(animal))               // the general check
                         System.out.print(animal + " ");
                 }
             System.out.println();
           }

}



