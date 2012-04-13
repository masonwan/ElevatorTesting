import static org.junit.Assert.*;

import org.junit.*;

public class TestUserPanelRequestDscComparator {
	Car car = new Car();

	@Test
	public void BR_21() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void BR_22() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(2, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void BR_23() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}
}
