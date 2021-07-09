package Graphs;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.model.Edge;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class GraphWTestCC extends ExecutionContext implements CruiseControlTest {
	public final static Path MODEL_PATH = Paths.get("Graphs/cruiseControl.json");

	public void resume() {
		// TODO Auto-generated method stub

	}

	public void accelerator() {
		// TODO Auto-generated method stub

	}

	public void engineOff() {
		// TODO Auto-generated method stub

	}

	public void engineOFF() {
		// TODO Auto-generated method stub

	}

	public void engineON() {
		// TODO Auto-generated method stub

	}

	public void standby() {
		// TODO Auto-generated method stub

	}

	public void idle() {
		// TODO Auto-generated method stub

	}

	public void active() {
		// TODO Auto-generated method stub

	}

	public void cruising() {
		// TODO Auto-generated method stub

	}

	public void off() {
		// TODO Auto-generated method stub

	}

	public void e_start() {
		// TODO Auto-generated method stub

	}

	public void breake() {
		// TODO Auto-generated method stub

	}

	public void v_start() {
		// TODO Auto-generated method stub

	}

	public void on() {
		// TODO Auto-generated method stub

	}

	@Test
	public void runSmokeTest() {
		new TestBuilder()
		.addContext(new GraphWTestCC().setNextElement(new Edge().setName("e_start").build()),
				MODEL_PATH,
				new AStarPath(new ReachedVertex("v_start")))
		.execute();
	}

	@Test
	public void runFunctionalTest() {
		new TestBuilder()
		.addContext(new GraphWTestCC().setNextElement(new Edge().setName("e_start").build()),
				MODEL_PATH,
				new RandomPath(new EdgeCoverage(100)))
		.execute();
	}

	@Test
	public void runStabilityTest() {
		new TestBuilder()
		.addContext(new GraphWTestCC().setNextElement(new Edge().setName("e_start").build()),
				MODEL_PATH,
				new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
		.execute();
	}

}
