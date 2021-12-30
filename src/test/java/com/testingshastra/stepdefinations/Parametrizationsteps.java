package com.testingshastra.stepdefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrizationsteps {
	int x, y, result;
	String w1, w2;
	Double d1;
	Double d2;
	Double output;
	List<Integer> numbers;

	@Given("We have two numbers {int} & {int}")
	public void m1(Integer x, Integer y) {
		this.x = x;
		this.y = y;

	}

	@When("We add them")
	public void m2() {
		result = x + y;

	}

	@Then("Print the result.")
	public void m3() {
		System.out.println("Result :" + result);

	}

	@Given("We have two words {string} & {string}")
	public void m1(String x, String y) {
		this.w1 = x;
		this.w2 = y;

	}

	@Then("Sort them alphabetically")
	public void m4() {
		if (w1.compareTo(w2) == 0) {
			System.out.println("Strings are identical.");
		} else if (w1.compareTo(w2) > 0) {
			System.out.println(w2 + " " + w1);
		} else {
			System.out.println(w1 + " " + w2);
		}

	}

	@Given("We have two float numbers {double} & {double}")
	public void m1(Double x, Double y) {
		d1 = x;
		d2 = y;

	}

	@When("We add float numbers.")
	public void m6() {
		output = (d1 + d2);

	}

	@Then("Print the output.")
	public void m7() {
		System.out.println("Result :" + output);

	}

	@Given("I have following numbers :")
	public void i_have_following_numbers(io.cucumber.datatable.DataTable dataTable) {
		 numbers = dataTable.asList(Integer.class);
		
	}
	
	@Then("Print all nummbers from list.")
	public void printAllnumbers() {
		for (Integer integer : numbers) {
			System.out.println(integer);
		}

	}

}
