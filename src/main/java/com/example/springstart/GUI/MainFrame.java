package com.example.springstart.GUI;

import com.example.springstart.BackEnd.Schema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("Файл");
    JMenu edit = new JMenu("Редактировать");
    JMenu view = new JMenu("Вид");
    JMenuItem create = new JMenuItem("Создать");
    JMenuItem open = new JMenuItem("Открыть");
    JMenuItem save = new JMenuItem("Сохранить");
    MainPanel mainPanel;

    public MainFrame() {
        this.setTitle("Симулятор электрический цепей");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        createFileMenu();
        this.setJMenuBar(menuBar);
        this.setVisible(true);

        this.mainPanel = new MainPanel(null);
        setContentPane(this.mainPanel);
        this.setVisible(true);
    }

    private void createFileMenu(){
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        file.add(create);
        file.add(open);
        file.add(save);
        open.addActionListener(this);
    }
    Schema schema = null;

    public void actionPerformed(ActionEvent arg0){
        if(arg0.getSource().equals(open)) {
            //код по открытию файла
            //блок закончен
            this.mainPanel = new MainPanel(schema);
            setContentPane(this.mainPanel);
            this.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
