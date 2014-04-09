package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Button;
import java.awt.GridLayout;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
                f.setLayout(new GridLayout(3, 2));//row, column
                f.add(new Button("1")); // add button to frame
                f.add(new Button("2"));
                f.add(new Button("3"));
                f.add(new Button("4"));
                f.add(new Button("5"));
                f.pack(); // set auto width and height
				f.setVisible(true); //show to the user
                f.setLocationRelativeTo(null); //put in center of screen
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
