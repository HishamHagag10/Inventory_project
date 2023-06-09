package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class newProductGui extends JFrame implements ActionListener {

    // Components of the Form
    int counter=0;

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel id;
    private JTextField tid;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel descrip;
    private JTextArea tadd;
    private JLabel quan;
    private JTextField tquan;
    private JLabel brand;
    private JTextField tbrand;
    private JLabel weight;
    private JTextField tweight;
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


    public newProductGui(int counter1,Vector<newProduct> product, Vector<Order>order)
    {
        this.products=product;
        this.counter=counter1;
        this.orders=order;
        setTitle("Add new product");
        setBounds(300, 50, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Add new product");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 20);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

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


        weight = new JLabel("weight");
        weight.setFont(new Font("Arial", Font.PLAIN, 20));
        weight.setSize(100, 20);
        weight.setLocation(100, 200);
        c.add(weight);

        tweight = new JTextField();
        tweight.setFont(new Font("Arial", Font.PLAIN, 15));
        tweight.setSize(150, 20);
        tweight.setLocation(200, 200);
        c.add(tweight);

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

        brand = new JLabel("Brand");
        brand.setFont(new Font("Arial", Font.PLAIN, 20));
        brand.setSize(100, 20);
        brand.setLocation(100, 300);
        c.add(brand);

        tbrand = new JTextField();
        tbrand.setFont(new Font("Arial", Font.PLAIN, 15));
        tbrand.setSize(150, 20);
        tbrand.setLocation(200, 300);
        c.add(tbrand);

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

        descrip = new JLabel("Description: ");
        descrip.setFont(new Font("Arial", Font.PLAIN, 20));
        descrip.setSize(150, 20);
        descrip.setLocation(100, 450);
        c.add(descrip);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 100);
        tadd.setLocation(150, 500);
        tadd.setLineWrap(true);
        c.add(tadd);

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
        res.setLocation(100, 650);
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
    void test(){

        System.out.print(getProducts().get(0).getName()+ getProducts().get(0).getId());
    }
    private void setData(int i){

        products.insertElementAt(new newProduct(1),i);
        products.get(i).setName(tname.getText());
        products.get(i).setId(Integer.parseInt(tid.getText()));
        products.get(i).setWeight(Float.parseFloat(tweight.getText()));
        products.get(i).setBrand(tbrand.getText());
        products.get(i).setDescrip(tadd.getText());
        products.get(i).setQuantity(Float.parseFloat(tquan.getText()));
        products.get(i).setX((String) date.getSelectedItem());
        products.get(i).setY((String) month.getSelectedItem());
        products.get(i).setZ((String) year.getSelectedItem());

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private boolean goodNumber(String user)
    {
        return user.matches(" *[0-9]+ *");
    }
    boolean cheak_id(int id1){
        for (int i=0;i<products.size();++i){
            if (products.get(i).getId()==id1)
                return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==sub){
            if(tname.getText().isEmpty() || tbrand.getText().isEmpty() || tadd.getText().isEmpty() || tid.getText().isEmpty() || tweight.getText().isEmpty() || tquan.getText().isEmpty()){
                res.setText("Check fill all fields ..");
            }
            else {

                if (goodNumber(tid.getText()) && goodNumber(tweight.getText()) && goodNumber(tquan.getText())){
                    if (cheak_id(Integer.parseInt(tid.getText()))){
                        setData(counter);
                        ++counter;
                        // System.out.print(counter);
                        setCounter(counter);
                        String data
                                = "Name : "
                                + tname.getText() + "\n"
                                + "ID : "
                                + tid.getText() + "\n"
                                + "Weight : "
                                +tweight.getText()+ "\n"
                                + "Quantity : "
                                + tquan.getText() + "\n"
                                + "Brand : "
                                + tbrand.getText() + "\n";
                        String data2
                                = "Date of Record : "
                                + (String)date.getSelectedItem()
                                + "/" + (String)month.getSelectedItem()
                                + "/" + (String)year.getSelectedItem()
                                + "\n";

                        String data3 = "Description : " + tadd.getText();
                        tout.setText(data + data2 + data3);
                        tout.setEditable(false);
                        res.setText("Registration Successfully..");
                        this.test();
                        this.deleteFieldes();

                    }
                    else {
                        res.setText("Used Id try Another One..");
                    }

                }
                else {
                    res.setText("Check if Id/Weight/Quantity are numbers ..");
                    tid.setText("");
                    tweight.setText("");
                    tquan.setText("");
                }
            }

        }
        else if (e.getSource() == reset) {
            main_frame mainFrame=new main_frame(this.getCounter(),this.getProducts(),orders);
            this.dispose();

        }
    }
    public void deleteFieldes(){
        String def = "";
        tname.setText(def);
        tadd.setText(def);
        tid.setText(def);
        tweight.setText(def);
        tquan.setText(def);
        tbrand.setText(def);
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        resadd.setText(def);
    }

}
