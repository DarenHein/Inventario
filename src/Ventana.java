import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{

    /* sistema de gestion de farmacia */

    private JPanel panel; 
    private JLabel etiqueta ; 
    private JLabel etiqueta2 ; 
    private JLabel etiqueta3 ; 
    // etiquetas de añadir 
    private JLabel etiqueta4 ; 
    private JLabel etiqueta5 ; 
    private JLabel etiqueta6 ; 
    private JLabel etiqueta7 ; 
    private JLabel etiqueta8 ; 
    private JLabel etiqueta9 ;
    private JLabel etiqueta10;  
    private JLabel etiqueta11; //itulo
    // etiquets de inventario 

    private JButton boton; 
    private JButton boton2; 
    private JButton boton3; 
    private JButton boton4;
    private JButton boton5;// boton añadir productos   
    private JTextField campo; 
    private JTextField campo2; 
    // campos añadir 
    private JTextField campo3; 
    private JTextField campo4; 
    private JTextField campo5; 
    private JTextField campo6; 
    private JTextField campo7; 
    private JTextField campo8; 
    private JTextField campo9; 
     

    public Ventana(){
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu");
        paneles(); 
    }
    public void paneles(){
        panel =  new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel);
        etiquetas(); 
        botones(); 
        campos(); 
        
    }
    public void etiquetas(){

        etiqueta = new JLabel(); 
        etiqueta.setBounds(190,80, 260, 30);
        etiqueta.setFont(new Font("arial", Font.BOLD,22)); 
        etiqueta.setText("Sistema de Inventario");
        panel.add(etiqueta); 

        etiqueta2 = new JLabel(); 
        etiqueta2.setBounds(120, 160, 120, 20);
        etiqueta2.setText("Usuario : ");
        etiqueta2.setFont(new Font("arial",Font.BOLD,17));
        panel.add(etiqueta2); 

        etiqueta3 = new JLabel(); 
        etiqueta3.setBounds(120, 200, 120, 20);
        etiqueta3.setText("Contraseña : ");
        etiqueta3.setFont(new Font("arial",Font.BOLD,17));
        panel.add(etiqueta3); 

        // --------------- AÑADIR ----------------------------------

        etiqueta4 = new JLabel(); 
        etiqueta4.setVisible(false); 
        etiqueta4.setText("Nombre : ");
        etiqueta4.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta4.setBounds(40,70,120,20); 
        panel.add(etiqueta4); 

        etiqueta5 = new JLabel(); 
        etiqueta5.setVisible(false); 
        etiqueta5.setText("No. Piezas : ");
        etiqueta5.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta5.setBounds(40,110,120,20); 
        panel.add(etiqueta5); 

        etiqueta6 = new JLabel(); 
        etiqueta6.setVisible(false); 
        etiqueta6.setText("Codigo : ");
        etiqueta6.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta6.setBounds(40,150,120,20); 
        panel.add(etiqueta6); 

        etiqueta7 = new JLabel(); 
        etiqueta7.setVisible(false); 
        etiqueta7.setText("Fecha llegada : ");
        etiqueta7.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta7.setBounds(40,190,120,20); 
        panel.add(etiqueta7); 

        etiqueta8 = new JLabel(); 
        etiqueta8.setVisible(false); 
        etiqueta8.setText("Caducidad : ");
        etiqueta8.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta8.setBounds(40,230,120,20); 
        panel.add(etiqueta8); 

        etiqueta9 = new JLabel(); 
        etiqueta9.setVisible(false); 
        etiqueta9.setText("Precio Fab. : ");
        etiqueta9.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta9.setBounds(40,270,120,20); 
        panel.add(etiqueta9); 

        etiqueta10 = new JLabel(); 
        etiqueta10.setVisible(false); 
        etiqueta10.setText("Precio Pub. : ");
        etiqueta10.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta10.setBounds(40,310,120,20); 
        panel.add(etiqueta10); 

        etiqueta11 = new JLabel(); 
        etiqueta11.setVisible(false); 
        etiqueta11.setText("Añadir Producto");
        etiqueta11.setFont(new Font("arial",Font.BOLD,22)); 
        etiqueta11.setBounds(160,10,200,20); 
        panel.add(etiqueta11); 

    }
    public void campos(){
        campo = new JTextField(); 
        campo.setBounds(240, 160, 150, 20); // campo de usuario 
        panel.add(campo); 

        campo2 = new JTextField(); 
        campo2.setBounds(240, 200, 150, 20); // campo de contraseña
        panel.add(campo2); 

        // campos añadir 

        campo3 = new JTextField(); 
        campo3.setVisible(false);
        campo3.setBounds(150, 70, 150, 20);// nombre 
        panel.add(campo3);

        campo4 = new JTextField(); 
        campo4.setVisible(false);
        campo4.setBounds(150, 110, 150, 20);// 
        panel.add(campo4);

        campo5 = new JTextField(); 
        campo5.setVisible(false);
        campo5.setBounds(150, 150, 150, 20);
        panel.add(campo5);

        campo6 = new JTextField("dd-mm-aaaa"); 
        campo6.setVisible(false);
        campo6.setBounds(150, 190, 150, 20);
        panel.add(campo6);

        campo7 = new JTextField("dd-mm-aaaa"); 
        campo7.setVisible(false);
        campo7.setBounds(150, 230, 150, 20);
        panel.add(campo7);

        campo8 = new JTextField("$"); 
        campo8.setVisible(false);
        campo8.setBounds(150, 270, 150, 20); // precio de llegada 
        panel.add(campo8);

        campo9 = new JTextField("$"); 
        campo9.setVisible(false);
        campo9.setBounds(150, 310, 150, 20);// precio al publico 
        panel.add(campo9);

    }
    public void botones(){

        boton = new JButton(); 
        boton.setBounds(240, 300, 120, 25);
        boton.setText("Iniciar");
        boton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campo.getText();
                String paswd = campo2.getText();

                if (usuario.isEmpty() || paswd.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Algún campo esta vacio");

                } else {
                    if (usuario.equals("Usuario") && paswd.equals("1234")) {
                        
                        campo.setVisible(false);// campo usuario
                        campo2.setVisible(false);// campo contraseña
                        etiqueta.setVisible(false);
                        etiqueta2.setVisible(false);
                        etiqueta3.setVisible(false);
                        boton.setVisible(false);

                        // ahora muestra 
                        boton2.setVisible(true);
                        boton3.setVisible(true);
                        boton4.setVisible(true);
                        

                    } else {
                        JOptionPane.showConfirmDialog(null, "Su usuario o contraseña es incorrecto");
                    }
                }
            }
            
        });

        panel.add(boton); 

        boton2 = new JButton(); 
        boton2.setBounds(450, 120, 120, 20);
        boton2.setText("Añadir");
        boton2.setVisible(false);
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

               etiqueta4.setVisible(true);
               etiqueta5.setVisible(true);
               etiqueta6.setVisible(true);
               etiqueta7.setVisible(true);
               etiqueta8.setVisible(true);
               etiqueta9.setVisible(true);
               etiqueta10.setVisible(true); 
               etiqueta11.setVisible(true);
               campo3.setVisible(true);
               campo4.setVisible(true);
               campo5.setVisible(true);
               campo6.setVisible(true);
               campo7.setVisible(true);
               campo8.setVisible(true);
               campo9.setVisible(true);
               boton5.setVisible(true);
            }
            
        });
        panel.add(boton2); 

        boton3 = new JButton(); 
        boton3.setBounds(450, 190, 120, 20);
        boton3.setText("Inventario");
        boton3.setVisible(false);
        panel.add(boton3); 

        boton4 = new JButton(); 
        boton4.setBounds(450, 260, 120, 20);
        boton4.setText("Inventario");
        boton4.setVisible(false);
        panel.add(boton4); 

        boton5 = new JButton(); 
        boton5.setBounds(450, 60, 120, 20);
        boton5.setText("Añadir Producto ");
        boton5.setBackground(Color.BLUE);
        boton5.setForeground(Color.white);
        boton5.setVisible(false);
        boton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre ; 
                nombre = campo3.getText(); 
                JOptionPane.showMessageDialog(null,"Gracias producto registrado \n nombre : " + nombre  );

               
            }

        });
        panel.add(boton5); 

        

    }
}
