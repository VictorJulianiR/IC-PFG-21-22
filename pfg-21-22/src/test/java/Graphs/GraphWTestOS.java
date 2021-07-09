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

public class GraphWTestOS extends ExecutionContext implements OrdSetTest {
	public final static Path MODEL_PATH = Paths.get("Graphs/ordSet_v7.json");

	public void PartiallyFilled() {
		// TODO Auto-generated method stub

	}

	public void add() {
		// TODO Auto-generated method stub

	}

	public void v_S0() {
		// TODO Auto-generated method stub

	}

	public void Empty() {
		// TODO Auto-generated method stub

	}

	public void createEmpty() {
		// TODO Auto-generated method stub

	}

	public void deleteSet() {
		// TODO Auto-generated method stub

	}

	public void createSet() {
		// TODO Auto-generated method stub

	}

	public void createFull() {
		// TODO Auto-generated method stub

	}

	public void removeLast() {
		// TODO Auto-generated method stub

	}

	public void Overflow() {
		// TODO Auto-generated method stub

	}

	public void remove() {
		// TODO Auto-generated method stub

	}

	public void Filled() {
		// TODO Auto-generated method stub

	}

	@Test
	public void runSmokeTestForSet() {
		new TestBuilder()
		.addContext(new GraphWTestOS().setNextElement(new Edge().setName("createSet").build()),
				MODEL_PATH,
				new AStarPath(new ReachedVertex("Overflow")))
		.execute();
	}

	@Test
	public void runSmokeTestForEmptySet() {
		new TestBuilder()
		.addContext(new GraphWTestOS().setNextElement(new Edge().setName("createEmpty").build()),
				MODEL_PATH,
				new AStarPath(new ReachedVertex("Filled")))
		.execute();
	}

	@Test
	public void runFunctionalTestForSet() {
		new TestBuilder()
		.addContext(new GraphWTestOS().setNextElement(new Edge().setName("createSet").build()),
				MODEL_PATH,
				new RandomPath(new EdgeCoverage(95)))
		.execute();
	}

	@Test
	public void runFunctionalTestForEmptySet() {
		new TestBuilder()
		.addContext(new GraphWTestOS().setNextElement(new Edge().setName("createEmpty").build()),
				MODEL_PATH,
				new RandomPath(new EdgeCoverage(95)))
		.execute();
	}

	@Test
	public void runStabilityTest() {
		new TestBuilder()
		.addContext(new GraphWTestOS().setNextElement(new Edge().setName("createSet").build()),
				MODEL_PATH,
				new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
		.execute();
	}

}
