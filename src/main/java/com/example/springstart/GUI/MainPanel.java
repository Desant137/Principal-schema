package com.example.springstart.GUI;

import com.example.springstart.BackEnd.Schema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.Action.SHORT_DESCRIPTION;

public class MainPanel extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    Image addComponent = new ImageIcon("Icons/addComponent.png").getImage();
    Image addVoltage = new ImageIcon("Icons/voltage.png").getImage();
    Image addResistor = new ImageIcon("Icons/resistor.png").getImage();
    JButton addComponentButton = new JButton();
    JButton addVoltageButton = new JButton();
    JButton addResistorButton = new JButton();

    Schema schema;

    public MainPanel(Schema schema){
        this.setLayout(null);
        addComponentButton.setIcon(new ImageIcon(addComponent));
        addComponentButton.setSize(40, 38);
        addComponentButton.setLocation(0, 0);
        addComponentButton.addActionListener(this);
        this.add(addComponentButton);
        this.setVisible(true);

        addVoltageButton.setSize(40, 38);
        addVoltage = addVoltage.getScaledInstance(addVoltageButton.getWidth(), addVoltageButton.getHeight(), Image.SCALE_DEFAULT);
        addVoltageButton.setIcon(new ImageIcon(addVoltage));
        addVoltageButton.setLocation(40, 0);
        addVoltageButton.addActionListener(this);
        this.add(addVoltageButton);
        this.setVisible(true);

        addResistorButton.setSize(40, 38);
        addResistor = addResistor.getScaledInstance(addResistorButton.getWidth(), addResistorButton.getHeight(), Image.SCALE_DEFAULT);
        addResistorButton.setIcon(new ImageIcon(addResistor));
        addResistorButton.setLocation(80, 0);
        addResistorButton.addActionListener(this);
        this.add(addResistorButton);
        this.setVisible(true);

        if(schema != null) {
            this.schema = schema;
            //рисуем схему
        }
    }

    public void actionPerformed(ActionEvent arg0){

    }
}
