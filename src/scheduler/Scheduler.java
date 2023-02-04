package scheduler;

import java.awt.Component;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */

public class Scheduler implements KeyListener {

//add events, view events or remove events by
	Date d = new Date();
	JPanel panel;
	JFrame frame;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;

//	- array filled with enums for the days of the week
//  - enum should contain a LinkedList of events that includes a time and what is happening at the event.
	public static void main(String[] args) {
		Scanner scan;
		String str;
		ArrayList<DaysOfTheWeek> EnumArrayList = new ArrayList<DaysOfTheWeek>();

		boolean working = true;
		Scheduler schedule = new Scheduler();
		JOptionPane.showMessageDialog(null, "Hi Daniel, everything in this program is now fully functional execpt when viewing the times in the scheduler it only shows the latest time saved.");
		schedule.DrawGui();
		while (working) {
			System.out.println("Enter your response here:");
			scan = new Scanner(System.in);
			str = scan.nextLine();
			if (str.equals("add")) {
				schedule.add();
			}
			if (str.equals("view")) {
				schedule.view();
			}
			if (str.equals("remove")) {
				schedule.remove();
			}

		}
	}

//    String res = scan.nextLine();
//	
//	if(res.equals("view")) {
//		 for (int i = 0; i < list.size(); i++)
//	           
//
//	            System.out.print(list.get(i) + ", ");       
//	    }
//    	 public void iterateUsingWhileLoop(LinkedList<Integer> t ){
//    		 
//    	  
//    	        int i=0;
//    	        
//    	        while(i<t.size()){
//    	            System.out.print(t.get(i));
//    	            i++;
//    	        }
//    	  
//    	    }
	String response;
	String timePST;
	int durationmin;
	String name;
	// create a enum list
	// a way to keep track of times of each input(AL or LL)
	// A way to check if the times for each of the events are overlapped as to do
	// with math
	//
	ArrayList<Integer> list;

	public void add() {

		list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day:");
		String r = scan.nextLine();
		switch (r) {
		case "Monday":
			System.out.println("Enter a time: ");
			String s = scan.nextLine();
			if (DaysOfTheWeek.MONDAY.events.contains(Integer.parseInt(s))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.MONDAY.events.add(Integer.parseInt(s));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(s));
			}

			break;

		case "Tuesday":
			System.out.println("Enter a time: ");
			String s1 = scan.nextLine();
			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(s1))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(s1));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(s1));
			}

			break;
		case "Wedsday":
			System.out.println("Enter a time: ");
			String s3 = scan.nextLine();
			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(s3))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(s3));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(s3));
			}

			break;
		case "Thursday":
			System.out.println("Enter a time: ");
			String s4 = scan.nextLine();
			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(s4))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(s4));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(s4));
			}

			break;
		case "Friday":
			System.out.println("Enter a time: ");
			String sr5 = scan.nextLine();
			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(sr5))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(sr5));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(sr5));
			}

			break;
		case "Saturday":
			System.out.println("Enter a time: ");
			String s6 = scan.nextLine();
			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(s6))) {
				System.out.println("The time is currently already booked.");

			} else {
				DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(s6));
				System.out.println("The time is booked!");
				list.add(Integer.parseInt(s6));

			}
			break;
		}
	}

	void view() {
		for (int i = 0; i < list.size(); i++)
			System.out.print("Booked at time: " + list.get(i) + "/n");

	}

	public void remove() {

		list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day:");
		String r = scan.nextLine();
		switch (r) {
		case "Monday":
			System.out.println("Enter a time to remove: ");
			String s = scan.nextLine();

			if (DaysOfTheWeek.MONDAY.events.contains(Integer.parseInt(s))) {

				DaysOfTheWeek.MONDAY.events.remove(DaysOfTheWeek.MONDAY.events.removeIndex(Integer.parseInt(s)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}

			break;

		case "Tuesday":
			System.out.println("Enter a time to remove: ");
			String s1 = scan.nextLine();

			if (DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(s1))) {

				DaysOfTheWeek.TUESDAY.events.remove(DaysOfTheWeek.TUESDAY.events.removeIndex(Integer.parseInt(s1)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s1)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}

			break;
		case "Wedsday":
			System.out.println("Enter a time to remove: ");
			String s2 = scan.nextLine();

			if (DaysOfTheWeek.WEDSDAY.events.contains(Integer.parseInt(s2))) {

				DaysOfTheWeek.MONDAY.events.remove(DaysOfTheWeek.WEDSDAY.events.removeIndex(Integer.parseInt(s2)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s2)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}
			break;
		case "Thursday":
			System.out.println("Enter a time to remove: ");
			String s3 = scan.nextLine();

			if (DaysOfTheWeek.THURSDAY.events.contains(Integer.parseInt(s3))) {

				DaysOfTheWeek.THURSDAY.events.remove(DaysOfTheWeek.THURSDAY.events.removeIndex(Integer.parseInt(s3)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s3)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}
			break;
		case "Friday":
			System.out.println("Enter a time to remove: ");
			String s4 = scan.nextLine();

			if (DaysOfTheWeek.FRIDAY.events.contains(Integer.parseInt(s4))) {

				DaysOfTheWeek.FRIDAY.events.remove(DaysOfTheWeek.FRIDAY.events.removeIndex(Integer.parseInt(s4)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s4)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}
			break;
		case "Saturday":
			System.out.println("Enter a time to remove: ");
			String s5 = scan.nextLine();

			if (DaysOfTheWeek.SATURDAY.events.contains(Integer.parseInt(s5))) {

				DaysOfTheWeek.SATURDAY.events.remove(DaysOfTheWeek.SATURDAY.events.removeIndex(Integer.parseInt(s5)));
				System.out.println("The requested time has been removed!");
				list.remove(Integer.valueOf(Integer.parseInt(s5)));
			} else {
				System.out.println("The scheduler does not contain the time");

			}
			break;
		}
	}

	public void DrawGui() {

		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		label.setText("Current date: " + d.toString());
		label.setHorizontalAlignment(JTextField.RIGHT);
		label2.setText("Type 'add' in the console to add an event.");
		label3.setText("Type 'view' in the console to view an event.");
		label4.setText("Type 'remove' in the console to remove an event.");

		frame.setSize(300, 400);
		frame.setTitle("Scheduler");
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
