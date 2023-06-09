package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Displaydata extends JFrame implements ActionListener,view {
    private Container c;
    JButton reset;
    private int Counter;
    private  Vector<newProduct>product;
    private Vector<Order>orders;
    private JScrollPane scrollPane;

    JTextArea tout;
    Displaydata(){

        setTitle("Display All Products");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        setVisible(true);

        JLabel title = new JLabel("Display All Products");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 20);
        c.add(title);

        reset = new JButton("Back");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(100, 50);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 800);
        tout.setLocation(300, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        tout.setEditable(false);
        tout.setForeground(Color.black);
        c.add(tout);

        scrollPane=new JScrollPane(tout);
        scrollPane.setSize(500,500);
        scrollPane.setLocation(200,150);
        c.add(scrollPane);
    }

    public void Display(int counter, Vector<newProduct> products, Vector<Order>order){
        this.orders=order;
        this.product=products;
        this.Counter=counter;
        String  data1;
        String data2;
        String data3;
        String data4;
        for (int i=0;i<products.size();++i){

            if (products.get(i).getQuantity()==0){
                data1="Name : "
                        + products.get(i).getName() + "\n"
                        + "ID : "
                        + products.get(i).getId()+ "\n"
                        + "Weight : "
                        + products.get(i).getWeight()+ "\n"
                        + "Quantity : "
                        + "**This Product must be restocked or deleted !**"+ "\n"
                        + "Brand : "
                        + products.get(i).getBrand() + "\n";
                data2
                        = "Date of Record : "
                        + (String) products.get(i).getX()
                        + "/" + (String) products.get(i).getY()
                        + "/" + (String) products.get(i).getZ()
                        + "\n";

                data3 = "Description : " + products.get(i).getDescrip();
                data4="Product: "+(i+1)+"\n";
                tout.append(data4+data1 +data2 +data3+"\n\t\t******************\n");

            }
            else {
                data1="Name : "
                        + products.get(i).getName() + "\n"
                        + "ID : "
                        + products.get(i).getId()+ "\n"
                        + "Weight : "
                        + products.get(i).getWeight()+ "\n"
                        + "Quantity : "
                        + products.get(i).getQuantity()+ "\n"
                        + "Brand : "
                        + products.get(i).getBrand() + "\n";
                data2
                        = "Date of Record : "
                        + (String) products.get(i).getX()
                        + "/" + (String) products.get(i).getY()
                        + "/" + (String) products.get(i).getZ()
                        + "\n";

                data3 = "Description : " + products.get(i).getDescrip();
                data4="Product: "+(i+1)+"\n";
                tout.append(data4+data1 +data2 +data3+"\n\t\t******************\n");
                System.out.print(data1+data2+data4);

            }


        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==reset){
            main_frame mainFrame=new main_frame(this.Counter,this.product,this.orders);
            this.dispose();
        }
    }
}
