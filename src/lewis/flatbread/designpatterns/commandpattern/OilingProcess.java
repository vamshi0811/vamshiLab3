package lewis.flatbread.designpatterns.commandpattern;

public class OilingProcess extends Command {
	
	public OilingProcess(CookingProcess cookingProcess) {
		super(cookingProcess);
	}

	@Override
	public void executeProcess() {
		getProcess().oilingDoughProcess();
	}

}
