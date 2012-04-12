import static org.junit.Assert.*;

import java.awt.Color;
import java.io.*;

import junit.framework.Assert;

import org.junit.Test;

public class DoorPanelTest {
	PrintStream orgOut;

	void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
	}

	@Test
	public void WB_DP_01() {
		DoorPanelQueue dpq = new DoorPanelQueue();
		Assert.assertEquals(0, dpq.doorPanelRequest.size());
		DoorPanelQueue.DoorPanelQueueMonitorThread th = new DoorPanelQueue(
				new Car()).new DoorPanelQueueMonitorThread();
		// th.run();
		Thread thread = new Thread(th);
		thread.start();
		sleep(1000);
		thread.interrupt();
		Assert.assertEquals(0, dpq.doorPanelRequest.size());
	}

	class DisabledCarController extends CarController {
		@Override
		public void processDoorRequest(DoorCommand arg0) {
		}
	}

	@Test
	public void WB_DP_02() {
		ICar car = new Car();
		car.setCarController(new DisabledCarController());
		DoorPanelQueue dpq = new DoorPanelQueue();
		dpq.car = car;
		dpq.doorPanelRequest.add(DoorCommand.CLOSE);
		Assert.assertEquals(1, dpq.doorPanelRequest.size());
		DoorPanelQueue.DoorPanelQueueMonitorThread th = dpq.new DoorPanelQueueMonitorThread();
		// th.run();
		Thread thread = new Thread(th);
		thread.start();
		sleep(1000);
		thread.interrupt();
		Assert.assertEquals(0, dpq.doorPanelRequest.size());
	}

	@Test
	public void WB_DP_03() {
		DoorPanelQueue dpq = new DoorPanelQueue();
		dpq.doorPanelRequest.add(DoorCommand.CLOSE);
		Assert.assertEquals(1, dpq.doorPanelRequest.size());
		dpq.putDoorPanelRequest(DoorCommand.CLOSE);
		Assert.assertEquals(1, dpq.doorPanelRequest.size());
		Assert.assertEquals(DoorCommand.CLOSE, dpq.doorPanelRequest.get(0));
	}

	@Test
	public void WB_DP_04() {
		DoorPanelQueue dpq = new DoorPanelQueue();
		dpq.doorPanelRequest.add(DoorCommand.OPEN);
		Assert.assertEquals(1, dpq.doorPanelRequest.size());
		dpq.putDoorPanelRequest(DoorCommand.CLOSE);
		Assert.assertEquals(2, dpq.doorPanelRequest.size());
		Assert.assertEquals(DoorCommand.OPEN, dpq.doorPanelRequest.get(0));
		Assert.assertEquals(DoorCommand.CLOSE, dpq.doorPanelRequest.get(1));
	}

	@Test
	public void WB_DP_05() {
		IDoor door = new SingleDoor();
		door.createDoorUI();
		DoorThread doorThread = new DoorThread(door, "Open");
		Thread thread = new Thread(doorThread);
		thread.start();
		sleep(1);
		thread.interrupt();
		Assert.assertEquals("OPENING", door.getDoorStatus());
	}

	@Test
	public void WB_DP_06() {
		IDoor door = new SingleDoor();
		door.createDoorUI();
		Assert.assertFalse("OPENED".equals(door.getDoorStatus()));
		DoorThread doorThread = new DoorThread(door, "Open");
		doorThread.run();
		Assert.assertEquals("OPENED", door.getDoorStatus());
	}

	@Test
	public void WB_DP_07() {
		IDoor door = new SingleDoor();
		door.createDoorUI();
		door.setDoorStatus("");
		DoorThread doorThread = new DoorThread(door, "Close");
		Thread thread = new Thread(doorThread);
		thread.start();
		sleep(1);
		thread.interrupt();
		Assert.assertEquals("CLOSING", door.getDoorStatus());
	}

	@Test
	public void WB_DP_08() {
		IDoor door = new SingleDoor();
		door.createDoorUI();
		door.setDoorStatus("");
		DoorThread doorThread = new DoorThread(door, "Close");
		doorThread.run();
		Assert.assertEquals("CLOSED", door.getDoorStatus());
	}

	@Test
	public void WB_DP_09() {
		SingleDoorUI ui = new SingleDoorUI();
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
		ui.setDoorStatus("CLOSED");
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
	}

	@Test
	public void WB_DP_10() {
		SingleDoorUI ui = new SingleDoorUI();
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
		ui.setDoorStatus("CLOSING");
		Assert.assertEquals(Color.yellow, ui.textDoorStatus.getBackground());
	}

	@Test
	public void WB_DP_11() {
		IDoor door = new DoubleDoor();
		door.createDoorUI();
		DoorThread doorThread = new DoorThread(door, "Open");
		Thread thread = new Thread(doorThread);
		thread.start();
		sleep(1);
		thread.interrupt();
		Assert.assertEquals("OPENING", door.getDoorStatus());
	}

	@Test
	public void WB_DP_12() {
		IDoor door = new DoubleDoor();
		door.createDoorUI();
		Assert.assertFalse("OPENED".equals(door.getDoorStatus()));
		DoorThread doorThread = new DoorThread(door, "Open");
		doorThread.run();
		Assert.assertEquals("OPENED", door.getDoorStatus());
	}

	@Test
	public void WB_DP_13() {
		IDoor door = new DoubleDoor();
		door.createDoorUI();
		door.setDoorStatus("");
		DoorThread doorThread = new DoorThread(door, "Close");
		Thread thread = new Thread(doorThread);
		thread.start();
		sleep(1);
		thread.interrupt();
		Assert.assertEquals("CLOSING", door.getDoorStatus());
	}

	@Test
	public void WB_DP_14() {
		IDoor door = new DoubleDoor();
		door.createDoorUI();
		door.setDoorStatus("");
		DoorThread doorThread = new DoorThread(door, "Close");
		doorThread.run();
		Assert.assertEquals("CLOSED", door.getDoorStatus());
	}

	@Test
	public void WB_DP_15() {
		DoubleDoorUI ui = new DoubleDoorUI();
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
		ui.setDoorStatus("CLOSED");
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
	}

	@Test
	public void WB_DP_16() {
		DoubleDoorUI ui = new DoubleDoorUI();
		Assert.assertNotSame(Color.yellow, ui.textDoorStatus.getBackground());
		ui.setDoorStatus("CLOSING");
		Assert.assertEquals(Color.yellow, ui.textDoorStatus.getBackground());
	}
}
