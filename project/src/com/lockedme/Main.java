/*package com.lockedme;

public class Main {

}*/
package com.lockedme;

public class Main {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		Manipulations.createMainFolderIfNotPresent("main");
		
		Options.Welcome("LockedMe", "Sheethal V S");
		
		HandleFileManipulations.handleWelcomeScreenInput();
	}
}
