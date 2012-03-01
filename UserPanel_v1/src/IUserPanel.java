import javax.swing.JPanel;


public interface IUserPanel {
	
	
	JPanel createUserPanel();
	
	void setCar(ICar car);
	
	void setNumberFloors(int numberFloors);
    
    void setButtonColor(UserPanelColor color);
    
    void setActiveButtonColor(UserPanelColor color);
    
    void deactivateFloorButton(int floorNumber);
	
    void setSelection(int selection);
    
    int getSelection();
}
