# Lambda

начинаем с Animalкласса:
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
}}
У Animalкласса есть три переменных экземпляра, которые задаются в конструкторе. У него есть два метода, позволяющие определить, может ли животное прыгать или плавать.
У этого также есть toString()метод, таким образом, мы можем легко идентифицировать Animalв программах.

добавляем маin
public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
            animals.add(new Animal("fish", false, true));
             animals.add(new Animal("kangaroo", true, false));
             animals.add(new Animal("rabbit", true, false));
            animals.add(new Animal("turtle", false, true));


        print(animals, a -> a.canHop());
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}

строка 29 print(animals, a -> a.canHop());здесь мы говорим Java, что нам важны только те, Animalкоторые могут прыгать

В нашем предыдущем примере мы создали интерфейс с одним методом:(когда не использовали лямбды)

boolean test(Animal a);
Лямбды работают с интерфейсами, которые имеют только один метод. Это так называемые функциональные интерфейсы - интерфейсы,
которые можно использовать с функциональным программированием. Java предоставляет нам такой интерфейс. Это в упаковке, java.util.functionи суть этого заключается в следующем:

public interface Predicate<T> {
  boolean test(T t);
}
Это очень похоже на наш метод. Разница лишь в том, что он использует этот тип T вместо Animal. Это синтаксис для дженериков.
Это как когда мы создали ArrayListи должны указать любой тип, который входит в него

print()Способ по линии 31 здесь проверяет не любой признак, а тех животных которые прыгают. 
Выводит список этих животных (кенгуру и заяц)

