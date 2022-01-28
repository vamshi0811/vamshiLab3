package lewis.flatbread.designpatterns.facadepattern;

import java.util.ArrayList;
import java.util.List;

import lewis.flatbread.designpatterns.commandpattern.Command;
import lewis.flatbread.designpatterns.commandpattern.CookingProcess;
import lewis.flatbread.designpatterns.commandpattern.DoughProcess;
import lewis.flatbread.designpatterns.commandpattern.FlatteningProcess;
import lewis.flatbread.designpatterns.commandpattern.GriddlingProcess;
import lewis.flatbread.designpatterns.commandpattern.MixingProcess;
import lewis.flatbread.designpatterns.commandpattern.OilingProcess;

public class FlatBreadMaker {
	
	private CookingProcess cookingProcess;
	
	
	public FlatBreadMaker(CookingProcess cookingProcess) {
		this.cookingProcess = cookingProcess;
	}
	
	public boolean prepareFlatBread(List<Command> makingProcessSteps) {
		
		//execute steps one by one
		for(Command process : makingProcessSteps) {
			process.executeProcess();
			System.out.println(process.getProcess().getCurrentProcess());
		}
		
		return true;
		
	}
	
	public List<Command> getCookingProcessSteps() {
		List<Command> flatBreadMakingSteps = new ArrayList<Command>();
		flatBreadMakingSteps.add(new MixingProcess(cookingProcess));
		flatBreadMakingSteps.add(new DoughProcess(cookingProcess));
		flatBreadMakingSteps.add(new OilingProcess(cookingProcess));
		flatBreadMakingSteps.add(new FlatteningProcess(cookingProcess));
		flatBreadMakingSteps.add(new GriddlingProcess(cookingProcess));
		
		return flatBreadMakingSteps;
		
	}

}
