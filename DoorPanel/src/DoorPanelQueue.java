import java.util.LinkedList;

public class DoorPanelQueue {

	ICar car = null;

	LinkedList<DoorCommand> doorPanelRequest = new LinkedList<DoorCommand>();

	public DoorPanelQueue() { // add for testing avoid run thread
	}

	public DoorPanelQueue(ICar car) {
		this.car = car;
		Thread doorPanelMonitorThread = new Thread(
				new DoorPanelQueueMonitorThread());
		doorPanelMonitorThread.start();
	}

	void putDoorPanelRequest(DoorCommand doorCommand) {
		if (!doorPanelRequest.contains(doorCommand)) {
			System.out.println("Request put in queue");
			doorPanelRequest.offer(doorCommand);
		}
	}

	void setCar(ICar car) {
		this.car = car;
	}

	class DoorPanelQueueMonitorThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(500); // 2000
				} catch (InterruptedException e) {
					// e.printStackTrace();
				}

				while (doorPanelRequest.size() != 0) {
					System.out.println("Processing request");
					car.getCarController().processDoorRequest(
							doorPanelRequest.pop());
				}
			}
		}
	}
}
