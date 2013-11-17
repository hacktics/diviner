package com.hacktics.diviner.gui.controllers;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.hacktics.diviner.gui.DivinerTitleBorder;

/**
 * 
 * @author Eran Tamari
 *
 */

public class ButtonScrollPane extends JScrollPane{

	private JPanel mainPanel;
	
	public ButtonScrollPane(String title, ArrayList<String> itemsList) {
		
		setBorder(new DivinerTitleBorder(title));
		mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (String itemText : itemsList) {
			JButton btnItem = new JButton(itemText);
			btnItem.setSelected(true);
			mainPanel.add(btnItem);
		}
		
		setViewportView(mainPanel);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	public void setNewView(ArrayList<String> items) {
		mainPanel.removeAll();
		for (String itemText : items) {
			JCheckBox checkBoxItem = new JCheckBox(itemText);
			mainPanel.add(checkBoxItem);
		}
		mainPanel.repaint();
		mainPanel.revalidate();
		
	}
}
