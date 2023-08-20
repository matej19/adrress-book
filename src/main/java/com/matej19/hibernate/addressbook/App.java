package com.matej19.hibernate.addressbook;

import javax.swing.*;
import java.awt.BorderLayout;

public class App 
{
	private JTextField searchPersonTextField;
	private JButton searchPersonButton;
	private DefaultListModel personListModel;
	private JList personList;
	
	public App() {
		JFrame frame = new JFrame("Address book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creating person search bar
        JPanel searchPersonPanel = new JPanel();
        JLabel searchPersonLabel = new JLabel("Enter person name:");
        searchPersonTextField = new JTextField(10);
        searchPersonButton = new JButton("Search");
        searchPersonPanel.add(searchPersonLabel);
        searchPersonPanel.add(searchPersonTextField);
        searchPersonPanel.add(searchPersonButton);
        
        //Creating person list
        personListModel = new DefaultListModel();
        personList = new JList(personListModel);
        
        frame.getContentPane().add(BorderLayout.SOUTH, searchPersonPanel);
        frame.getContentPane().add(BorderLayout.CENTER, new JScrollPane(personList));
        frame.pack();
        frame.setVisible(true);        
	}
	
    public static void main( String[] args )
    {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });   
    }
}
