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

	@Test
	public void CP_22() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request2 = new UserPanelRequest(2, car);
		boolean hasException = false;

		try {
			comparator.compare(null, request2);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void CP_23() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		boolean hasException = false;

		try {
			comparator.compare(request1, null);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void CP_24() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void CP_25() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}

	@Test
	public void CP_26() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_25() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		boolean hasException = false;

		try {
			comparator.compare("", 23);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_26() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		boolean hasException = false;

		try {
			comparator.compare(45, 12);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_27() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}

	@Test
	public void DT_28() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(2, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_29() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_30() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request2 = new UserPanelRequest(1, car);
		boolean hasException = false;

		try {
			comparator.compare(32, request2);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_31() {
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(2, car);
		boolean hasException = false;

		try {
			comparator.compare(request1, 54);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}
}
