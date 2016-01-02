/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg7.dog.and.cat.adopt;

/**
 *
 * @author czepeda
 */
public abstract class Animal {

    private int order;
    private String name;

    public Animal(String n) {
        name = n;

    }

    public void setOrder(int n) {

        order = n;

    }

    public int getOrder() {
        return order;

    }

    public boolean isOlderThan(Animal a) {

        return this.order < a.getOrder();

    }
}

class Dog extends Animal {

    public Dog(String s) {
        super(s);
    }

}

class Cat extends Animal {

    public Cat(String s) {
        super(s);
    }

}
