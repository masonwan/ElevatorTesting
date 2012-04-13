import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class TestUserPanelRequestAscComparator {
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

	@Test
	public void CP_17() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
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
	public void CP_18() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
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
	public void CP_19() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void CP_20() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}

	@Test
	public void CP_21() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_18() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		boolean hasException = false;

		try {
			comparator.compare("", 23);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_19() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		boolean hasException = false;

		try {
			comparator.compare(request1, 12);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_20() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(0, comparator.compare(request1, request2));
	}

	@Test
	public void DT_21() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(2, car);
		UserPanelRequest request2 = new UserPanelRequest(1, car);

		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_22() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		UserPanelRequest request2 = new UserPanelRequest(2, car);

		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void DT_23() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request2 = new UserPanelRequest(1, car);
		boolean hasException = false;

		try {
			comparator.compare(null, request2);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}

	@Test
	public void DT_24() {
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(1, car);
		boolean hasException = false;

		try {
			comparator.compare(request1, null);
		} catch (IllegalArgumentException e) {
			hasException = true;
		}

		assertTrue(hasException);
	}
}
