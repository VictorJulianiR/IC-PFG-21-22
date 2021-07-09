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

public class GraphWTestEL extends ExecutionContext implements ElevatorTest {
	public final static Path MODEL_PATH = Paths.get("Graphs/elevator_v5.json");

	public void existsAnotherRequest() {
		// TODO Auto-generated method stub

	}

	public void h_History() {
		// TODO Auto-generated method stub

	}

	public void requestStopFromOtherFloor() {
		// TODO Auto-generated method stub

	}

	public void v_StopElevator() {
		// TODO Auto-generated method stub

	}

	public void closeDoor() {
		// TODO Auto-generated method stub

	}

	public void startGroup() {
		// TODO Auto-generated method stub

	}

	public void noMoreRequest() {
		// TODO Auto-generated method stub

	}

	public void wrongInput() {
		// TODO Auto-generated method stub

	}

	public void Idle() {
		// TODO Auto-generated method stub

	}

	public void PreparingToMove() {
		// TODO Auto-generated method stub

	}

	public void stopRequestON() {
		// TODO Auto-generated method stub

	}

	public void v_Start() {
		// TODO Auto-generated method stub

	}

	public void FindNextDestination() {
		// TODO Auto-generated method stub

	}

	public void requestElevatorFromFloorDown() {
		// TODO Auto-generated method stub

	}

	public void requestElevatorFromFloorUp() {
		// TODO Auto-generated method stub

	}

	public void stopRequestOFF() {
		// TODO Auto-generated method stub

	}

	@Test
	public void runSmokeTest() {
		new TestBuilder()
		.addContext(new GraphWTestEL().setNextElement(new Edge().setName("startGroup").build()),
				MODEL_PATH,
				new AStarPath(new ReachedVertex("FindNextDestination")))
		.execute();
	}

	//@Test
	public void runSmokeTestForWrongInput() {
		new TestBuilder()
		.addContext(new GraphWTestEL().setNextElement(new Edge().setName("h_History").build()),
				MODEL_PATH,	
				new AStarPath(new ReachedVertex("v_StopElevator")))
		.execute();
	}	

	@Test
	public void runFunctionalTest() {
		new TestBuilder()
		.addContext(new GraphWTestEL().setNextElement(new Edge().setName("startGroup").build()),
				MODEL_PATH,
				new RandomPath(new EdgeCoverage(90)))
		.execute();
	}

	@Test
	public void runStabilityTest() {
		new TestBuilder()
		.addContext(new GraphWTestEL().setNextElement(new Edge().setName("startGroup").build()),
				MODEL_PATH,
				new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
		.execute();
	}

}
