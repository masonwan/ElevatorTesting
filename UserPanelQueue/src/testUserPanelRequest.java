import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;


public class testUserPanelRequest {
	Car car = new Car();

	@Test
	public void BR_16() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);
		
		assertEquals(true, request1.equals(request2));
	}

	@Test
	public void BR_17() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);
		
		assertEquals(false, request1.equals(request2));
	}	
}
