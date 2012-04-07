import static org.junit.Assert.*;

import java.awt.*;

import javax.swing.*;

import org.junit.Test;

public class DoorPanelTest {

	// @Test
	// public void test() {
	// IDoorPanel d = new DoorPanel();
	// ICar car = new Car();
	// ICarController c = new CarController();
	// IDoor door = new SingleDoor();
	//
	// car.setCarController(c);
	// car.setDoorPanel(d);
	// car.setDoor(door);
	//
	// d.setCar(car);
	// d.setCloseText("close");
	// d.setOpenText("open");
	//
	// c.setCar(car);
	//
	// JFrame j = new JFrame();
	// j.setLayout(new FlowLayout());
	// j.add(d.createDoorPanelUI());
	// j.add(door.createDoorUI());
	// j.setVisible(true);
	//
	// }

	// public void test_err_1() {
	// IDoorPanel d = new DoorPanel();
	// IDoor door = new SingleDoor();
	// d.setCloseText("close");
	// d.setOpenText("open");
	// JFrame j = new JFrame();
	// j.setLayout(new FlowLayout());
	// j.add(d.createDoorPanelUI());
	// j.add(door.createDoorUI());
	// j.setVisible(true);
	// }
	//
	// public void test_err_2() {
	// IDoorPanel d = new DoorPanel();
	// ICar car = new Car();
	// ICarController c = new CarController();
	// IDoor door = new SingleDoor();
	//
	// car.setCarController(c);
	// car.setDoorPanel(d);
	// // car.setDoor(door);
	//
	// d.setCar(car);
	// d.setCloseText("close");
	// d.setOpenText("open");
	//
	// c.setCar(car);
	//
	// JFrame j = new JFrame();
	// j.setLayout(new FlowLayout());
	// j.add(d.createDoorPanelUI());
	// j.add(door.createDoorUI());
	// j.setVisible(true);
	//
	// }

	public void test() {
		IDoorPanel d = new DoorPanel();
		ICar car = new Car();
		ICarController c = new CarController();
		IDoor door = new SingleDoor();

		car.setCarController(c);
		car.setDoorPanel(d);
		car.setDoor(door);
		// car.setStatus(CarStatus.IDLE);

		d.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		c.setCar(car);

		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(door.createDoorUI());
		j.setVisible(true);

		// door.setDoorStatus("TEST");
	}

	public static void main(String args[]) {
		DoorPanelTest test = new DoorPanelTest();
		test.test();
	}
}
