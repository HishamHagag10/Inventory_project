package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class main_frame extends JFrame implements ActionListener {
    private Container c;

    private JLabel title;
    private JButton b1,b2,b3,b4,b5,b6,b7;
    private int counter;
    private int counter2;

    private Vector<newProduct>products=new Vector<>(100);
    Vector<Order>orders;
    main_frame(int i,Vector<newProduct> products1, Vector<Order>order){
        this.products=products1;
        this.counter=i;
        this.orders=order;
        setTitle("Display All Products");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        setVisible(true);

        title = new JLabel("Hellow In Our Program");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(300, 20);
        c.add(title);
        b1 = new JButton("Add New Product");
        b1.setFont(new Font("Arial", Font.PLAIN, 20));
        b1.setSize(400, 50);
        b1.setLocation(250, 100);
        b1.addActionListener(this);
        c.add(b1);

        b2 = new JButton("List Our Products");
        b2.setFont(new Font("Arial", Font.PLAIN, 20));
        b2.setSize(400, 50);
        b2.setLocation(250, 200);
        b2.addActionListener(this);
        c.add(b2);

        b3 = new JButton("Edit Products");
        b3.setFont(new Font("Arial", Font.PLAIN, 20));
        b3.setSize(400, 50);
        b3.setLocation(250, 300);
        b3.addActionListener(this);
        c.add(b3);

        b4 = new JButton("Restock Products");
        b4.setFont(new Font("Arial", Font.PLAIN, 20));
        b4.setSize(400, 50);
        b4.setLocation(250, 400);
        b4.addActionListener(this);
        c.add(b4);

        b5 = new JButton("Delete Products");
        b5.setFont(new Font("Arial", Font.PLAIN, 20));
        b5.setSize(400, 50);
        b5.setLocation(250, 500);
        b5.addActionListener(this);
        c.add(b5);

        b6 = new JButton("PLace Order");
        b6.setFont(new Font("Arial", Font.PLAIN, 20));
        b6.setSize(400, 50);
        b6.setLocation(250, 600);
        b6.addActionListener(this);
        c.add(b6);

        b7 = new JButton("Fulfilled Orders");
        b7.setFont(new Font("Arial", Font.PLAIN, 20));
        b7.setSize(400, 50);
        b7.setLocation(250, 700);
        b7.addActionListener(this);
        c.add(b7);

    }

    public void setCounter2(int counter2) {
        this.counter2 = counter2;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            newProductGui n1=new newProductGui(this.counter,this.products,orders);
            this.dispose();
        }
        else if (e.getSource()==b2){
            Displaydata n2=new Displaydata();
            n2.Display(this.counter,this.products,orders);
            this.dispose();
        }

        else if (e.getSource()==b3){
            Editproduct n3=new Editproduct(this.counter,this.products,orders);
            this.dispose();
        }
        else if (e.getSource()==b4){
            Restock_Product n4=new Restock_Product(this.counter,this.products,orders);
            this.dispose();
        }else if (e.getSource()==b5){
            Delete_Product n5=new Delete_Product(this.counter,this.products,orders);
            this.dispose();
        }
        else if (e.getSource()==b6){
            Place_order n6=new Place_order(this.counter,this.products,orders);
            this.dispose();

        }
        else if (e.getSource()==b7){
            fulfill_Orders n7=new fulfill_Orders(this.counter2,this.products,orders);
            n7.Display(this.counter,this.products,orders);
            this.dispose();
        }
    }

}
