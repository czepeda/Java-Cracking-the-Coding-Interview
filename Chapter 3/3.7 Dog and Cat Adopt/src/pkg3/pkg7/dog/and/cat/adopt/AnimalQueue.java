package pkg3.pkg7.dog.and.cat.adopt;

import java.util.LinkedList;

public class AnimalQueue {

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order++);
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }

    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            return dequeueCats();
        } else if (cats.size() == 0) {
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dequeueDogs();
        } else {
            return dequeueCats();
        }

    }

    public Dog dequeueDogs() {

        return dogs.poll();

    }

    public Cat dequeueCats() {

        return cats.poll();
    }

    public static void main(String[] args) {

        AnimalQueue shelter = new AnimalQueue();

        shelter.enqueue(new Dog("tom"));
        shelter.enqueue(new Dog("peter"));
       
        shelter.enqueue(new Cat("john"));
        shelter.enqueue(new Cat("anne"));
        System.out.println("Dequeue Any Dog: "+ shelter.dequeueAny());
        System.out.println("Dequeue Any Dog: "+ shelter.dequeueAny());
        System.out.println("Dequeue Any Cat: "+ shelter.dequeueAny());
        
        
        

    }

}
