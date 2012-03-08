import javax.swing.JPanel;

public interface IFloorPanel 
{
	
	JPanel createFloorPanel(int i);
	
	String getUserRequest();
     
	int getCurrentFloor();
	
	void setFloorPanelQueueType(IFloorPanelQueue floorPanelQueue);
	
	IFloorPanelQueue getFloorPanelQueueType();
	
    void setActiveButtonColor(FloorPanelColor floorPanelColor);
    
    void setButtonColor(FloorPanelColor floorPanelColor);
	
	String getFloorPanelStatus();
	
	void setFloorPanelStatus(String FloorPanelStatus);
	
	void disableUpButton();
	
	void disableDownButton();
	
	void setUpText(String text);
	
	void seDownText(String text);
    
    void processedRequest(int floorNumber);
    
    //Floor Indicator Parameters
    
    void processIndicatorRequest(int floorNumber,int id,String type);
    
    void processStatusRequest(int floorNumber,int currentFloor);
    
    /** 10/23/2011 - Snigdha, Alarm handling **/
	void processAlarmRequest(int floorNumber, int currentCarNumber);
	void processAlarmReset(int floorNumber, int currentCarNumber);
	void setNumberOfCars(int cars);
	int getNumberOfCars();

}
