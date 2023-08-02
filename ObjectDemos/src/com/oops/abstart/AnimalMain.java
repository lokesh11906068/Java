
package com.oops.abstart;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		animal.makeSound();
		animal=new Dog();
		animal.makeSound();
		((Dog) animal).play();
		animal=new Cat();
		((Dog) animal).play();
		
	}

}
