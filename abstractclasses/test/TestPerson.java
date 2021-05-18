package dev.carbajal.abstractclasses.test;

import dev.carbajal.abstractclasses.Developer;
import dev.carbajal.abstractclasses.Person;

public class TestPerson {

	public static void main(String[] args) {

		Person adam = new Developer();

		adam.setName("Adam");
		System.out.println(adam.getName());

	}

}
