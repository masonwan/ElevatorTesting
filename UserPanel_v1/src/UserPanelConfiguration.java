
public class UserPanelConfiguration {
	
	static String userPanelType = "default";
	static String carType = "default";
	static int numberFloors = 20;
	static String queueType = "default";
	static UserPanelColor buttonColor = UserPanelColor.GREEN;
	static UserPanelColor activeButtonColor = UserPanelColor.RED;
	
	static int selection = 0;
	
	
	public static UserPanelColor getActiveButtonColor() {
		return activeButtonColor;
	}
	public static void setActiveButtonColor(UserPanelColor activeButtonColor) {
		UserPanelConfiguration.activeButtonColor = activeButtonColor;
	}
	public static UserPanelColor getButtonColor() {
		return buttonColor;
	}
	public static void setButtonColor(UserPanelColor buttonColor) {
		UserPanelConfiguration.buttonColor = buttonColor;
	}
	public static String getUserPanelType() {
		return userPanelType;
	}
	public static void setUserPanelType(String userPanelType) {
		UserPanelConfiguration.userPanelType = userPanelType;
	}
	public static String getCarType() {
		return carType;
	}
	public static void setCarType(String carType) {
		UserPanelConfiguration.carType = carType;
	}
	public static int getSelection() {
		return selection;
	}
	public static void setSelection(int selection) {
		UserPanelConfiguration.selection = selection;
	}
	public static int getNumberFloors() {
		return numberFloors;
	}
	public static void setNumberFloors(int numberFloors) {
		UserPanelConfiguration.numberFloors = numberFloors;
	}
	public static String getQueueType() {
		return queueType;
	}
	public static void setQueueType(String queueType) {
		UserPanelConfiguration.queueType = queueType;
	}
	
	

}
