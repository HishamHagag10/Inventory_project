package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Place_order extends JFrame implements ActionListener {

    // Components of the Form
    int counter=0;
    int conter2=0;

    private Container c;
    private JLabel title;
    private JLabel product;
    private JTextField tproduct;
    private JLabel id;
    private JTextField tid;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel descrip;
    private JTextArea tadd;
    private JLabel quan;
    private JTextField tquan;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    Vector<newProduct> products;
    Vector<Order>orders;
    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022" };

    public Place_order  (int counter1,Vector<newProduct> product1,Vector<Order>order)
    {
        this.products=product1;
        this.counter=counter1;
        this.orders=order;
        setTitle("Place order ");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Place order");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 20);
        c.add(title);

        product = new JLabel("Product");
        product.setFont(new Font("Arial", Font.PLAIN, 20));
        product.setSize(100, 20);
        product.setLocation(100, 100);
        c.add(product);

        tproduct = new JTextField();
        tproduct.setFont(new Font("Arial", Font.PLAIN, 15));
        tproduct.setSize(190, 20);
        tproduct.setLocation(200, 100);
        c.add(tproduct);

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

        quan = new JLabel("Quantity");
        quan.setFont(new Font("Arial", Font.PLAIN, 20));
        quan.setSize(100, 20);
        quan.setLocation(100, 250);
        c.add(quan);

        tquan = new JTextField();
        tquan.setFont(new Font("Arial", Font.PLAIN, 15));
        tquan.setSize(150, 20);
        tquan.setLocation(200, 250);
        c.add(tquan);

        dob = new JLabel("Date of record");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(150, 20);
        dob.setLocation(100, 350);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(100, 400);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(180, 400);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(100, 20);
        year.setLocation(270, 400);
        c.add(year);


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


    public  Vector<newProduct>getProducts() {
        return products;
    }
    public  Vector<Order>getOrders() {
        return orders;
    }
    void test(){
        int i=orders.size()-1;
        System.out.print(getOrders().get(i).getproduct()+ getOrders().get(i).getId());
    }
    private void setData(int i){

        //orders.insertElementAt(new Order(1),i);
        orders.add(new Order(1));
        orders.lastElement().setProdect(tproduct.getText());
        orders.lastElement().setId(Integer.parseInt(tid.getText()));
        orders.lastElement().setQuantity(Float.parseFloat(tquan.getText()));
        orders.lastElement().setX((String) date.getSelectedItem());
        orders.lastElement().setY((String) month.getSelectedItem());
        orders.lastElement().setZ((String) year.getSelectedItem());
        this.products.get(i).setQuantity(products.get(i).getQuantity()-Float.parseFloat(tquan.getText()));
    }

    public int getCounter() {
        return counter;
    }
    int search(String s){
        int temp=-1;
        for (int i=0;i<(int)products.size();++i) {
            if (this.products.get(i).getName().equals(s)){
                temp=i;
                break;
            }
        }
        return temp;
    }
    boolean cheak_id(int id1){
        for (int i=0;i<orders.size();++i){
            if (orders.get(i).getId()==id1)
                return false;
        }
        return true;
    }

    public int getConter2() {
        return conter2;
    }

    public void setConter2(int conter2) {
        this.conter2 = conter2;
    }

    private boolean goodNumber(String user)
    {
        return user.matches(" *[0-9]+ *");
    }
    void clear_quantity(){
        tquan.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==sub){
            int i=search(tproduct.getText());
            if (i==-1){
                res.setText("product Not Found..");
            }else if (!goodNumber(tquan.getText())){
                res.setText("Quantity must be Number..");
                clear_quantity();
            }else if (!goodNumber(tid.getText())){
                res.setText("Order id must be number must be Number..");
            }else if (!cheak_id(Integer.parseInt(tid.getText()))){
                res.setText("Used Id try Another One..");
            }
            else if (products.get(i).getQuantity() < Float.parseFloat(tquan.getText())){
                res.setText("Quantity Not Enough..");

            }
            else {
                conter2++;
                this.setConter2(conter2);
                setData(i);
                String data
                        = "product : "
                        + tproduct.getText() + "\n"
                        + "Order ID : "
                        + tid.getText() + "\n"
                        + "Quantity : "
                        + tquan.getText() + "\n";
                String data2
                        = "Date of Record : "
                        + (String) date.getSelectedItem()
                        + "/" + (String) month.getSelectedItem()
                        + "/" + (String) year.getSelectedItem()
                        + "\n";

                //String data3 = "Description : " + tadd.getText();
                tout.setText(data + data2);
                tout.setEditable(false);
                res.setText("Place Order Successfully..");
                this.test();
                this.deleteFieldes();
            }
        }
        else if (e.getSource() == reset) {
            main_frame mainFrame=new main_frame(this.getCounter(),this.getProducts(),this.orders);
            mainFrame.setCounter2(this.getConter2());
            this.dispose();

        }
    }
    public void deleteFieldes(){
        String def = "";
        tproduct.setText(def);
        tid.setText(def);
        tquan.setText(def);
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);

    }

}
