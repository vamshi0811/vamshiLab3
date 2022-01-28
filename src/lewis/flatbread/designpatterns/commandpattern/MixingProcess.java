package lewis.flatbread.designpatterns.commandpattern;

public class MixingProcess extends Command {
	
	public MixingProcess(CookingProcess cookingProcess) {
		super(cookingProcess);
	}

	@Override
	public void executeProcess() {
		getProcess().mixingProcess();
	}

}
