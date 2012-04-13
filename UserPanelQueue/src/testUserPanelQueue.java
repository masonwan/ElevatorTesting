import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class testUserPanelQueue {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void BR_1() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.downList.add(new UserPanelRequest(3, data.car));
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BR_2() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(0, data.downList.size());
	}

	@Test
	public void BR_3() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(2);
		data.upList.add(new UserPanelRequest(3, data.car));
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BR_4() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(2);
		data.queue.putMessage(1);

		assertEquals(0, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BR_5() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.upList.add(new UserPanelRequest(1, data.car));
		data.downList.add(new UserPanelRequest(2, data.car));
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BR_6() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.upList.add(new UserPanelRequest(1, data.car));
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(0, data.downList.size());
	}

	@Test
	public void BR_7() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.downList.add(new UserPanelRequest(1, data.car));
		data.queue.putMessage(1);

		assertEquals(0, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BR_8() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.downList.add(new UserPanelRequest(1, data.car));
		assertEquals(true, data.queue.isRequestAlreadyQueued(new UserPanelRequest(1, data.car)));
	}

	@Test
	public void BR_9() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(1);
		data.downList.add(new UserPanelRequest(1, data.car));
		assertEquals(false, data.queue.isRequestAlreadyQueued(new UserPanelRequest(2, data.car)));
	}

	@Test
	public void BR_10() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(1);
		data.upList.add(new UserPanelRequest(1, data.car));
		assertEquals(1, data.queue.pathLength(Direction.UP, 2));
	}

	@Test
	public void BR_11() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(2);
		data.upList.add(new UserPanelRequest(3, data.car));
		assertEquals(3, data.queue.pathLength(Direction.UP, 1));
	}

	@Test
	public void BR_12() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(2);
		assertEquals(1, data.queue.pathLength(Direction.UP, 1));
	}

	@Test
	public void BR_13() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(2);
		data.downList.add(new UserPanelRequest(1, data.car));
		assertEquals(1, data.queue.pathLength(Direction.DOWN, 1));
	}

	@Test
	public void BR_14() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(2);
		data.downList.add(new UserPanelRequest(1, data.car));
		assertEquals(3, data.queue.pathLength(Direction.DOWN, 3));
	}

	@Test
	public void BR_15() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(1);
		assertEquals(1, data.queue.pathLength(Direction.DOWN, 2));
	}

	@Test
	public void BP_1() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(5);
		data.downList.add(new UserPanelRequest(1, data.car));
		data.queue.putMessage(1);

		assertEquals(0, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BP_2() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(3);
		data.upList.add(new UserPanelRequest(7, data.car));
		data.downList.add(new UserPanelRequest(2, data.car));
		data.queue.putMessage(4);

		assertEquals(2, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BP_3() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(4);
		data.upList.add(new UserPanelRequest(8, data.car));
		data.downList.add(new UserPanelRequest(1, data.car));
		data.queue.putMessage(2);

		assertEquals(1, data.upList.size());
		assertEquals(2, data.downList.size());
	}

	@Test
	public void BP_4() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(2);
		data.downList.add(new UserPanelRequest(3, data.car));
		data.queue.putMessage(3);

		assertEquals(0, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BP_5() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(7);
		data.upList.add(new UserPanelRequest(6, data.car));
		data.queue.putMessage(6);

		assertEquals(1, data.upList.size());
		assertEquals(0, data.downList.size());
	}

	@Test
	public void BP_6() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(4);
		data.upList.add(new UserPanelRequest(3, data.car));
		data.downList.add(new UserPanelRequest(1, data.car));
		data.queue.putMessage(1);

		assertEquals(1, data.upList.size());
		assertEquals(1, data.downList.size());
	}

	@Test
	public void BP_7() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(4);
		data.upList.add(new UserPanelRequest(3, data.car));
		data.upList.add(new UserPanelRequest(5, data.car));
		data.downList.add(new UserPanelRequest(1, data.car));
		data.downList.add(new UserPanelRequest(2, data.car));
		data.downList.add(new UserPanelRequest(3, data.car));

		assertEquals(true, data.queue.isRequestAlreadyQueued(new UserPanelRequest(3, data.car)));
	}

	@Test
	public void BP_8() {
		TestData data = new TestData();
		data.queue.setCurrentRequestedFloor(4);
		data.upList.add(new UserPanelRequest(6, data.car));
		data.upList.add(new UserPanelRequest(7, data.car));
		data.downList.add(new UserPanelRequest(1, data.car));
		data.downList.add(new UserPanelRequest(2, data.car));

		assertEquals(false, data.queue.isRequestAlreadyQueued(new UserPanelRequest(4, data.car)));
	}

	@Test
	public void BP_9() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(2);
		assertEquals(8, data.queue.pathLength(Direction.UP, 10));
	}

	@Test
	public void BP_10() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(5);
		assertEquals(1, data.queue.pathLength(Direction.UP, 4));
	}

	@Test
	public void BP_11() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(5);
		assertEquals(5, data.queue.pathLength(Direction.UP, 10));
	}

	@Test
	public void BP_12() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(9);
		assertEquals(5, data.queue.pathLength(Direction.DOWN, 4));
	}

	@Test
	public void BP_13() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(5);
		assertEquals(4, data.queue.pathLength(Direction.DOWN, 9));
	}

	@Test
	public void BP_14() {
		TestData data = new TestData();
		data.car.setCurrentFloorNumber(6);
		assertEquals(1, data.queue.pathLength(Direction.DOWN, 5));
	}

	@Test
	public void BP_15() {
		TestData data = new TestData();
		data.car.setStatus(CarStatus.ALARM_PRESSED);

		UserPanelQueue.UserPanelQueueMonitorThread thread = data.queue.new UserPanelQueueMonitorThread();
		thread.run();
		
		assertEquals(0, data.car.getDestinationFloor());
	}

	@Test
	public void BP_16() {
		TestData data = new TestData();
		data.car.setStatus(CarStatus.MOVING_UP);

		UserPanelQueue.UserPanelQueueMonitorThread thread = data.queue.new UserPanelQueueMonitorThread();
		thread.run();
		
		assertEquals(0, data.car.getDestinationFloor());
		assertEquals(CarStatus.IDLE, data.car.status);
	}

	@Test
	public void BP_18() {
		TestData data = new TestData();
		data.car.setStatus(CarStatus.MOVING_UP);
		data.upList.add(new UserPanelRequest(3, data.car));

		UserPanelQueue.UserPanelQueueMonitorThread thread = data.queue.new UserPanelQueueMonitorThread();
		thread.run();
		
		assertEquals(0, data.car.getDestinationFloor());
		assertEquals(CarStatus.MOVING_UP, data.car.status);
	}

//	@Test
//	public void BP_19() {
//		TestData data = new TestData();
//		data.car.setStatus(CarStatus.MOVING_DOWN);
//		data.car.setCurrentFloorNumber(5);
//		data.downList.add(new UserPanelRequest(3, data.car));
//
//		UserPanelQueue.UserPanelQueueMonitorThread thread = data.queue.new UserPanelQueueMonitorThread();
//		thread.run();
//		
//		assertEquals(0, data.car.getDestinationFloor());
//		assertEquals(CarStatus.MOVING_DOWN, data.car.status);
//	}

	@Test
	public void BP_20() {
		TestData data = new TestData();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(3, data.car);
		assertEquals(true, request1.equals(request2));
	}

	@Test
	public void BP_21() {
		TestData data = new TestData();
		UserPanelRequest request1 = new UserPanelRequest(4, data.car);
		UserPanelRequest request2 = new UserPanelRequest(3, data.car);
		assertEquals(false, request1.equals(request2));
	}

	@Test
	public void BP_22() {
		TestData data = new TestData();
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(4, data.car);
		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void BP_23() {
		TestData data = new TestData();
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(2, data.car);
		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void BP_24() {
		TestData data = new TestData();
		UserPanelRequestAscComparator comparator = new UserPanelRequestAscComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(3, data.car);
		assertEquals(0, comparator.compare(request1, request2));
	}

	@Test
	public void BP_25() {
		TestData data = new TestData();
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(4, data.car);
		assertEquals(1, comparator.compare(request1, request2));
	}

	@Test
	public void BP_26() {
		TestData data = new TestData();
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(2, data.car);
		assertEquals(-1, comparator.compare(request1, request2));
	}

	@Test
	public void BP_27() {
		TestData data = new TestData();
		UserPanelRequestDescComparator comparator = new UserPanelRequestDescComparator();
		UserPanelRequest request1 = new UserPanelRequest(3, data.car);
		UserPanelRequest request2 = new UserPanelRequest(3, data.car);
		assertEquals(0, comparator.compare(request1, request2));
	}
}

class TestData {
	public UserPanelQueue queue = new UserPanelQueue();
	public LinkedList<UserPanelRequest> upList = queue.getQueueUserPanelRequestUp();
	public LinkedList<UserPanelRequest> downList = queue.getQueueUserPanelRequestDown();
	public CarController controller = new CarController();
	public Car car = new Car();
	public IDoor door = new SingleDoor();
	public FloorPanel floorPanel = new FloorPanel();
	public UserPanel userPanel = new UserPanel();

	public TestData() {
		queue = new UserPanelQueue();
		upList = queue.getQueueUserPanelRequestUp();
		downList = queue.getQueueUserPanelRequestDown();
		controller = new CarController();
		car = new Car();

		car.setCarController(controller);

		controller.setCar(car);

		queue.setCar(car);

		door = new SingleDoor();
		door.setCarController(controller);

		userPanel = new UserPanel();
		userPanel.setCar(car);
		userPanel.createUserPanel();

		floorPanel = new FloorPanel();
		floorPanel.setButtonColor(FloorPanelColor.BLUE);
		floorPanel.createFloorPanel(1);

		car.setDoor(door);
		car.setUserPanel(userPanel);
		controller.setFloorPanel(floorPanel);
	}
}
