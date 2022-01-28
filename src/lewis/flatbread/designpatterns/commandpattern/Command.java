package lewis.flatbread.designpatterns.commandpattern;

public abstract class Command {
	
	private CookingProcess cookingProcess;
	
	public Command(CookingProcess cookingProcess) {
		this.cookingProcess = cookingProcess;
	}
	
	public abstract void executeProcess();
	
	public CookingProcess getProcess() {
		return cookingProcess;
	}

}
