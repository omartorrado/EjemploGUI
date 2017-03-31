/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author otorradomiguez
 */
public class Interfaz {

    public void iniciar() {
        //Creamos el frame y dos paneles contenedores
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ponemos el layout en null, de base es ???
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.setResizable(false);
        //Creamos los paneles y ponemos el layout a null, pBot lo hacemos directamente
        //en el constructor y pTop con setLayout. de base es flowLayout
        //El frame no tiene constructor con LayoutManager, por lo que hay k hacerlo de la segunda manera
        JPanel pTop = new JPanel();        
        JPanel pBot = new JPanel(null);
        pTop.setLayout(null);
        //Establecemos bordes y bounds de los paneles
        pTop.setBorder(new LineBorder(new Color(0, 255, 0), 3, true));
        pBot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pTop.setBounds(10, 10, 780, 285);
        pBot.setBounds(10, 305, 780, 285);
        //Creamos los componentes del panel Top
        JLabel labelTop1 = new JLabel("ETIQUETA");
        JTextField textTop1 = new JTextField();
        JPasswordField passTop1 = new JPasswordField();
        JTextArea textAreaTop1 = new JTextArea();
        //Los dimensionamos y colocamos
        labelTop1.setBounds(30, 30, 350, 50);
        textTop1.setBounds(30, 80, 350, 50);
        passTop1.setBounds(30, 130, 350, 50);
        textAreaTop1.setBounds(30, 180, 350, 80);
        //Creamos los componentes del panel Bot        
        JList listBot1 = new JList();
        //Este es el contenido de la comboBox. Ver como añadirlo tras la creacion del objeto
        String[] arbolesComboBot1={"Carballo","Piñeiro","Castiñeiro","Maceira"};
        JComboBox comboBot1 = new JComboBox(arbolesComboBot1);
        JButton buttonBot1 = new JButton();
        JButton buttonBot2 = new JButton();
        //Dimensionamos y colocamos
        listBot1.setBounds(50,10,200,100);
        comboBot1.setBounds(450, 10, 200, 50);
        buttonBot1.setBounds(50, 200, 200, 50);
        buttonBot2.setBounds(450,200,200,50);
        //Le damos los valores a la lista y el combobox
        String[] coloresListBot1={"Verde","Amarillo","Blanco","Rojo","Marron"};
        listBot1.setListData(coloresListBot1);       
        //Añadimos los componentes al panel Top
        pTop.add(labelTop1);
        pTop.add(textTop1);
        pTop.add(passTop1);
        pTop.add(textAreaTop1);
        //Añadimos componentes del panel Bot
        pBot.add(listBot1);
        pBot.add(comboBot1);
        pBot.add(buttonBot1);
        pBot.add(buttonBot2);
        //Añadimos los paneles al frame
        frame.add(pTop);
        frame.add(pBot);
        frame.setVisible(true);

    }

}
