package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EL_Steps {
	@Given("initialize")
	public void initialize() {
		System.out.println("Star car");
	}

	@When("carEngineON")
	public void car_engine_on() {
		System.out.println("Engine.TurnOn()");
	}

	@When("resume")
	public void resume() {
		System.out.println("Do nothing");
	}

	@When("carEngineOFF")
	public void car_engine_off() {
		System.out.println("Turn engine OFF");
	}

	@When("shutdown")
	public void shutdown() {
		System.out.println("Shutdown Car");
	}

	@When("on")
	public void on() {
		System.out.println("Turn Car ON");
	}

	@When("disableCruiseControl")
	public void disable_cruise_control() {
		System.out.println("Disengaje cruise control");
	}

	@When("accelerator")
	public void accelerator() {
		System.out.println("Accelerate");
	}

	@When("on\\/enableControl")
	public void on_enable_control() {
		System.out.println("Engage Cruise Control");
	}

}
