import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class testUserPanelRequestAscComparator {
	Car car = new Car();

	@Test
	public void BR_18() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void BR_19() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(2, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void BR_20() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}

}
