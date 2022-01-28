package lewis.flatbread.designpatterns.testsuites;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lewis.flatbread.designpatterns.commandpattern.Command;
import lewis.flatbread.designpatterns.commandpattern.CookingProcess;
import lewis.flatbread.designpatterns.commandpattern.DoughProcess;
import lewis.flatbread.designpatterns.commandpattern.FlatteningProcess;
import lewis.flatbread.designpatterns.commandpattern.GriddlingProcess;
import lewis.flatbread.designpatterns.commandpattern.MixingProcess;
import lewis.flatbread.designpatterns.commandpattern.OilingProcess;
import lewis.flatbread.designpatterns.facadepattern.FlatBreadMaker;

@TestInstance(Lifecycle.PER_CLASS)
class FlatBreadMakerTests {

	private CookingProcess cookingProcess = new CookingProcess();
	private FlatBreadMaker flatBreadMaker;
	
	@BeforeEach
	public void setup() {
		flatBreadMaker = new FlatBreadMaker(cookingProcess);
	}
	
	public void teardown() {
		cookingProcess.setCurrentProcess("");
	}
	
	@Test
	void testDoughProcess() {
		assertEquals(true, cookingProcess!= null);
		
		Command process = new DoughProcess(cookingProcess);
		process.executeProcess();
		assertEquals("Preparing Dough", cookingProcess.getCurrentProcess());
	}
	
	@Test
	void testFlatteningProcess() {
		assertEquals(true, cookingProcess!= null);
		
		Command process = new FlatteningProcess(cookingProcess);
		process.executeProcess();
		assertEquals("Flattening the Dough by rolling on the dough", cookingProcess.getCurrentProcess());
	}
	
	@Test
	void testGriddlingProcess() {
		assertEquals(true, cookingProcess!= null);
		
		Command process = new GriddlingProcess(cookingProcess);
		process.executeProcess();
		assertEquals("Griddling the flattened dough", cookingProcess.getCurrentProcess());
	}
	
	@Test
	void testMixingProcess() {
		assertEquals(true, cookingProcess!= null);
		
		Command process = new MixingProcess(cookingProcess);
		process.executeProcess();
		assertEquals("Mixing Water and Flour", cookingProcess.getCurrentProcess());
	}
	
	@Test
	void testOilingProcess() {
		assertEquals(true, cookingProcess!= null);
		
		Command process = new OilingProcess(cookingProcess);
		process.executeProcess();
		assertEquals("Oiling dough and make it into dough pieces", cookingProcess.getCurrentProcess());
	}
	
	@Test
	void testFlatBreadMakerSteps() {
		assertEquals(true, cookingProcess!= null);
		assertNotNull(flatBreadMaker);
		
		List<Command> flatBreadMakerSteps = flatBreadMaker.getCookingProcessSteps();
		
		assertInstanceOf(MixingProcess.class, flatBreadMakerSteps.get(0));
		assertInstanceOf(DoughProcess.class, flatBreadMakerSteps.get(1));
		assertInstanceOf(OilingProcess.class, flatBreadMakerSteps.get(2));
		assertInstanceOf(FlatteningProcess.class, flatBreadMakerSteps.get(3));
		assertInstanceOf(GriddlingProcess.class, flatBreadMakerSteps.get(4));
	}
	
	@Test
	void testFlatBreadMaker() {
		assertEquals(true, cookingProcess!= null);
		assertNotNull(flatBreadMaker);
		
		List<Command> flatBreadMakerSteps = flatBreadMaker.getCookingProcessSteps();
		
		assertTrue(flatBreadMaker.prepareFlatBread(flatBreadMakerSteps));
	}

}
