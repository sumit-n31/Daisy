package com.testingshastra.stepdefinations;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	int x;
	int y;
	int result;

	@Given("Take two numbers as input from user")
	public void take_two_numbers_as_input_from_user() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		x = sc.nextInt();
		y = sc.nextInt();

	}

	@When("I add them")
	public void i_add_them() {
		result = x + y;

	}

	@Then("verify addition is prime number")
	public void verify_addition_is_prime_number() {
		int count=0;
		for(int i=1;i<result;i++) {
			if(result%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("Addition"+""+result+""+" isn't prime number.");
		}
		else {
			System.out.println("Addition"+""+result+""+" is prime number.");
		}
	}
}
