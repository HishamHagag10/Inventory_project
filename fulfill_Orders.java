package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class fulfill_Orders extends JFrame implements ActionListener,view {
    private Container c;
    private JLabel title;
    private JScrollPane scrollPane;
    JButton reset;
    private int Counter;

    private Vector<newProduct> product;
    private Vector<Order>orders;
    private JTextArea tout;
    fulfill_Orders(int counter,Vector<newProduct> products,Vector<Order> orders){
        this.Counter=counter;
        this.product=products;
        this.orders=orders;

        setTitle("Display All fulfilled orders");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        setVisible(true);

        title = new JLabel("Display All fulfilled orders");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(250, 20);
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
        c.add(tout);

        scrollPane=new JScrollPane(tout);
        scrollPane.setSize(500,500);
        scrollPane.setLocation(200,150);
        c.add(scrollPane);
    }
    public void Display(int counter, Vector<newProduct> products, Vector<Order>order){

        String data1;
        String data2;
        String data4;
        for (int i=0;i<orders.size();++i){

            data1="Product : "
                    + orders.get(i).getproduct() + "\n"
                    + "ID : "
                    + orders.get(i).getId()+ "\n"
                    + "Quantity : "
                    + orders.get(i).getQuantity()+ "\n";

            data2
                    = "Date of Record : "
                    + (String) orders.get(i).getX()
                    + "/" + (String) orders.get(i).getY()
                    + "/" + (String) orders.get(i).getZ()
                    + "\n";


            data4="Order: "+(i+1)+"\n";
            tout.append(data4+data1 +data2 +"\n\t\t******************\n");
            System.out.print(data1+data2+data4);



        }

    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==reset){
            main_frame mainFrame=new main_frame(this.Counter,this.product,this.orders);
            this.dispose();
        }
    }

}
