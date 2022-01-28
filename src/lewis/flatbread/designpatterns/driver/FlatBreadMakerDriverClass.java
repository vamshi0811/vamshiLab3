package lewis.flatbread.designpatterns.driver;

import java.util.List;

import lewis.flatbread.designpatterns.commandpattern.Command;
import lewis.flatbread.designpatterns.commandpattern.CookingProcess;
import lewis.flatbread.designpatterns.facadepattern.FlatBreadMaker;

public class FlatBreadMakerDriverClass {

	public static void main(String[] args) {
		
		CookingProcess cookingProcess = new CookingProcess();
		FlatBreadMaker flatBreadMaker = new FlatBreadMaker(cookingProcess);
		
		List<Command> cookingSteps = flatBreadMaker.getCookingProcessSteps();
		flatBreadMaker.prepareFlatBread(cookingSteps);
		
		System.out.println("Flat Bread Ready to be served");

	}

}
