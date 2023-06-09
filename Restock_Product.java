package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Restock_Product extends JFrame implements ActionListener,Select_edit {
    int counter2=0;
    private Container c;
    private JLabel title;
    private JLabel id;
    private JTextField tid;
    private JTextArea tout;
    private JButton b1;
    private int counter;
    private  Vector<newProduct>product;

    JLabel quantuty;
    JTextField tQuantity;
    JButton sub;
    JButton reset,reset1;

    JLabel res;
    JTextArea resadd;
    JTextField resultText;
    Vector<Order>orders;
    Restock_Product(int counter, Vector<newProduct> products, Vector<Order>order){
        this.counter=counter;
        this.product=products;
        this.orders=order;
        setTitle("Edit Products");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Enter ID to select product");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(250, 20);
        c.add(title);

        id = new JLabel("ID");
        id.setFont(new Font("Arial", Font.PLAIN, 20));
        id.setSize(100, 20);
        id.setLocation(100, 150);
        c.add(id);

        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 15));
        tid.setSize(50, 20);
        tid.setLocation(200, 150);
        c.add(tid);
        setVisible(true);
        b1 = new JButton("Increase Quantity");
        b1.setFont(new Font("Arial", Font.PLAIN, 20));
        b1.setSize(400, 50);
        b1.setLocation(250, 200);
        b1.addActionListener(this);
        c.add(b1);

        reset1 = new JButton("Back");
        reset1.setFont(new Font("Arial", Font.PLAIN, 15));
        reset1.setSize(100, 20);
        reset1.setLocation(100, 100);
        reset1.addActionListener(this);
        c.add(reset1);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        res.setForeground(Color.red);
        c.add(res);
    }

    public int getId() {
        return Integer.parseInt(tid.getText());
    }
    public void EditGui(){
        Container c;


        setTitle("Restock product");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Restock product");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 20);
        c.add(title);


        quantuty = new JLabel("Quantity");
        quantuty.setFont(new Font("Arial", Font.PLAIN, 20));
        quantuty.setSize(100, 20);
        quantuty.setLocation(100, 300);
        c.add(quantuty);

        tQuantity = new JTextField();
        tQuantity.setFont(new Font("Arial", Font.PLAIN, 15));
        tQuantity.setSize(150, 20);
        tQuantity.setLocation(200, 300);
        c.add(tQuantity);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 700);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Back");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 700);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        res.setForeground(Color.red);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);


        setVisible(true);
    }
    public void printSelected(int i,  Vector<newProduct>products){

        String  data1="Name : "
                + products.get(i).getName() + "\n"
                + "ID : "
                + products.get(i).getId()+ "\n"
                + "Weight : "
                + products.get(i).getWeight()+ "\n"
                + "Quantity : "
                + products.get(i).getQuantity()+ "\n"
                + "Brand : "
                + products.get(i).getBrand() + "\n";
        String  data2
                = "Date of Record : "
                + (String) products.get(i).getX()
                + "/" + (String) products.get(i).getY()
                + "/" + (String) products.get(i).getZ()
                + "\n";

        //String data3 = "Description : " + products.get(i).getDescrip();
        String data4="Product: "+(i+1)+"\n";
        tout.setText(data4+data1 + data2 +"\n\t\t\t******************");
        this.tout.setEditable(false);
        c.add(tout);System.out.print(data1+data2);
    }

    public int selectProduct(){
        int temp=-1;
        System.out.print(this.counter);
        for (int i=0;i<counter;++i){
            if(product.get(i).getId()==Integer.parseInt(tid.getText())) {
                temp=i;
                EditGui();
                printSelected(i,product);
                break;
            }

        }
        return temp;
    }
    public void EDit(int i){
        product.get(i).setQuantity(product.get(i).getQuantity()+Integer.parseInt(tQuantity.getText()));
    }
    private boolean goodNumber(String user)
    {
        return user.matches(" *[0-9]+ *");
    }
    void clear_id(){
        tid.setText("");
    }
    void clear_quantity(){
        tQuantity.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            counter2 = selectProduct();
            if (goodNumber(tid.getText())  && counter2 > -1) {
                title.setVisible(false);
                b1.setVisible(false);
                reset1.setVisible(false);
                id.setVisible(false);
                tid.setVisible(false);
                res.setText("");

            }else {
                if(counter2==-1){
                    res.setText("This product not exist..");

                }
                else {
                    res.setText("Id must be number ..");

                }
                clear_id();
            }
        }
        if(e.getSource()==sub){
            if (goodNumber(tQuantity.getText())) {
                EDit(counter2);
                System.out.print(counter2);
                printSelected(counter2, product);
                res.setText("Restoked sucessfuly..");
            }else {
                res.setText("Quantaty must be Number..");
                clear_quantity();
            }
            clear_quantity();
            clear_id();
        }
        if (e.getSource()==reset){
            main_frame mainFrame=new main_frame(this.counter,this.product,orders);
            this.dispose();
        }
        if (e.getSource()==reset1){
            main_frame mainFrame=new main_frame(this.counter,this.product,orders);
            this.dispose();
        }
    }
}
