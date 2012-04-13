//import static org.junit.Assert.*;

import java.awt.*;

import javax.swing.*;

//import org.junit.Test;

public class DoorPanelUITest {

	public void test1() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = null;
			door = new SingleDoor();
			ui = door.createDoorUI();

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-01"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Exception"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test2() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(null);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-02"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Exception"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test3() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.STOPPED);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-03"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test4() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.MOVING_UP);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-04"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test5() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.MOVING_DOWN);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-05"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test6() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.ALARM_PRESSED);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-06"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test7() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = null;
			car.setDoor(door);
			ui = (new SingleDoor()).createDoorUI();

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-07"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Exception"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test8() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-08"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test9() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus(null);

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-09"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Exception"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test10() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-10"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test11() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-11"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test12() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-12"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test13() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-13"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test14() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-14"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test15() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("Others");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-15"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test16() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-16"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test17() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-17"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test18() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-18"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test19() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-19"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test20() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-20"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test21() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("Others");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-CP-21"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test22() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = null;
			door = new SingleDoor();
			ui = door.createDoorUI();

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-01"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Excepections"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test23() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(null);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-02"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Excepections"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test24() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = null;
			car.setDoor(door);
			ui = (new SingleDoor()).createDoorUI();

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-03"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Excepections"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test25() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus(null);

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-04"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: Throw Null Excepections"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test26() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.MOVING_UP);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-05"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test27() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.MOVING_UP);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-06"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test28() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-07"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test29() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-08"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test30() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-09"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test31() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-10"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test32() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-11"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test33() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press open button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-12"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor OPENING then OPENED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test34() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-13"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test35() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("OPENED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-14"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test36() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-15"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test37() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSED");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-16"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor did nothing"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test38() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new SingleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-17"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: SingleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public void test39() {
		String testCaseProcedure = "";
		ICar car = null;
		IDoor door = null;
		IDoorPanel d = new DoorPanel();
		ICarController c = new CarController();
		JPanel ui = null;

		try {

			testCaseProcedure = "Press close button";
			car = new Car();
			car.setCarController(c);
			car.setDoorPanel(d);
			car.setStatus(CarStatus.IDLE);
			door = new DoubleDoor();
			car.setDoor(door);
			ui = door.createDoorUI();
			door.setDoorStatus("CLOSING");

		} catch (Exception e) {
		}

		d.setCar(car);
		c.setCar(car);

		d.setCloseText("Close");
		d.setOpenText("Open");

		JFrame j = new JFrame();
		j.add(new JLabel("ID: BB-DP-DT-18"));
		j.add(new JLabel("Proc: " + testCaseProcedure));
		j.add(new JLabel("Out: DoubleDoor CLOSING then CLOSED"));
		j.setLayout(new FlowLayout());
		j.add(d.createDoorPanelUI());
		j.add(ui);
		j.setSize(260, 180);
		j.setVisible(true);

	}

	public static void main(String args[]) {
		DoorPanelUITest test = new DoorPanelUITest();
		test.test39();
		test.test38();
		test.test37();
		test.test36();
		test.test35();
		test.test34();
		test.test33();
		test.test32();
		test.test31();
		test.test30();
		test.test29();
		test.test28();
		test.test27();
		test.test26();
		test.test25();
		test.test24();
		test.test23();
		test.test22();
		test.test21();
		test.test20();
		test.test19();
		test.test18();
		test.test17();
		test.test16();
		test.test15();
		test.test14();
		test.test13();
		test.test12();
		test.test11();
		test.test10();
		test.test9();
		test.test8();
		test.test7();
		test.test6();
		test.test5();
		test.test4();
		test.test3();
		test.test2();
		test.test1();
	}
}
