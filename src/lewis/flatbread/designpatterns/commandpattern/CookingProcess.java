package lewis.flatbread.designpatterns.commandpattern;

public class CookingProcess {
	private String currentProcess = "";
	
	public void mixingProcess() {
		currentProcess = "Mixing Water and Flour";
	}
	
	public void preparingDoughProcess() {
		currentProcess = "Preparing Dough";
	}
	
	public void oilingDoughProcess() {
		currentProcess = "Oiling dough and make it into dough pieces";
	}
	
	public void flatteningDoughProcess() {
		 currentProcess = "Flattening the Dough by rolling on the dough";
	}
	
	public void griddleDoughProcess() {
		currentProcess = "Griddling the flattened dough";
	}
	
	public String getCurrentProcess() {
		 return currentProcess;
	}
	
	public void setCurrentProcess(String currentProcess) {
		this.currentProcess = currentProcess;
	}

}
