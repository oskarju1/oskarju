package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("dog", 20.0, "Szarik");


	    dog.feed();
		dog.feed();
		dog.feed();
		dog.feed();


	    Human me = new Human();
	    me.firstName = "Oskar";
	    me.lastName = "Jurgielaniec";
	    me.pet = dog;

	    System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
