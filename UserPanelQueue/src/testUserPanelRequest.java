import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;


public class TestUserPanelRequest {
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

	@Test
	public void CP_14() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		assertEquals(false, request1.equals(null));
	}

	@Test
	public void CP_15() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);
		assertEquals(true, request1.equals(request2));
	}

	@Test
	public void CP_16() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);
		assertEquals(false, request1.equals(request2));
	}

	@Test
	public void DT_14() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		assertEquals(false, request1.equals(25));
	}

	@Test
	public void DT_15() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);
		
		assertEquals(false, request1.equals(request2));
	}

	@Test
	public void DT_16() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);
		
		assertEquals(true, request1.equals(request2));
	}

	@Test
	public void DT_17() {
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		
		assertEquals(true, request1.equals(null));
	}
}
