package scheduler;

import java.awt.Component;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class Scheduler implements KeyListener{
//add events, view events or remove events by
Date d = new Date();
	JPanel panel;
	JFrame frame;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;
    public static void main(String[] args) {
    	Scheduler schedule = new Scheduler(); 
    	schedule.DrawGui();
    	
    	System.out.println("Enter your response here:");
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
//    	if() {
//    		
//    	}
    	
    	//String resp
    	String timePST;
    	int durationmin;
    	String name;
    	// create a enu                          m list
    	// a way to keep track of times of each input(AL or LL)
    	//A way to check if the times for each of the events are overlapped as to do with math
    	 //
    	
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
		label.setText("Current date: "+d.toString());
		label.setHorizontalAlignment(JTextField.RIGHT);
		label2.setText("Type 'add' in the console to add an event.");
		label3.setText("Type 'view' in the console to view an event.");
		label3.setText("Type 'remove' in the console to remove an event.");
	
		
		frame.setSize(300, 300);
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
