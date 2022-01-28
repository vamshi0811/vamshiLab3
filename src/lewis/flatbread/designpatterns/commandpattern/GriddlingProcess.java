package lewis.flatbread.designpatterns.commandpattern;

public class GriddlingProcess extends Command {
	
	public GriddlingProcess(CookingProcess cookingProcess) {
		super(cookingProcess);
	}

	@Override
	public void executeProcess() {
		getProcess().griddleDoughProcess();
	}

}
