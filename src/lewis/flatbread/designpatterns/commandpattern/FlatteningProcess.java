package lewis.flatbread.designpatterns.commandpattern;

public class FlatteningProcess extends Command {
	
	public FlatteningProcess(CookingProcess cookingProcess) {
		super(cookingProcess);
	}

	@Override
	public void executeProcess() {
		getProcess().flatteningDoughProcess();
	}

}
