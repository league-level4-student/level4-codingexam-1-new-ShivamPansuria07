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
//	- array filled with enums for the days of the week
//  - enum should contain a LinkedList of events that includes a time and what is happening at the event.
    public static void main(String[] args) {

    	ArrayList<DaysOfTheWeek> EnumArrayList = new ArrayList<DaysOfTheWeek>();
    	
    	
    	Scheduler schedule = new Scheduler(); 
    	
    	schedule.DrawGui();
    	ArrayList<Integer> list =  new ArrayList<Integer>();
    	System.out.println("Enter your response here:");
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
    	if(str.contentEquals("add")) {
    		System.out.println("Enter a day:");
    		String r = scan.nextLine();
    		switch(r) {
    		case "monday": 
    			System.out.println("Enter a time: ");
        		String s = scan.nextLine();
        		if(DaysOfTheWeek.MONDAY.events.contains(Integer.parseInt(s))) {
        			System.out.println("The time you requested is booked!");
        	    	list.add(Integer.parseInt(s));
    		}else {
    			DaysOfTheWeek.MONDAY.events.add(Integer.parseInt(s));
    			System.out.println("The time you requested had been booked");
    		}
    			break;
    		
    		case "tuesday": 
    			System.out.println("Enter a time: ");
        		String sr = scan.nextLine();
        		if(DaysOfTheWeek.TUESDAY.events.contains(Integer.parseInt(sr))) {
        			System.out.println("The time you requested is booked!");
    		}else {
    			DaysOfTheWeek.TUESDAY.events.add(Integer.parseInt(sr));
    			System.out.println("The time you requested had been booked");
    		}break;
    		case "Wedsday": break;
    		case "Thursday": break;
    		case "Friday": break;
    		case "Saturday": break;
    		}
    		//d
    		System.out.println("Enter your response here:");
    		String res = scan.nextLine();
    		if(res.equals("view")) {
    			 for (int i = 0; i < list.size(); i++)
    		           
    	
    		            System.out.print(list.get(i) + ", ");       
    		    }
    			
    		}
    		
    	}
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
    	//A way to check if the times for each of the events are overlapped as to do with math
    	 //
    	
    
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
