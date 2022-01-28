package lewis.flatbread.designpatterns.commandpattern;

public class DoughProcess extends Command {
	
	public DoughProcess(CookingProcess cookingProcess) {
		super(cookingProcess);
	}

	@Override
	public void executeProcess() {
		getProcess().preparingDoughProcess();
	}

}
