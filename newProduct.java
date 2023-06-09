package Project;

import java.time.LocalDate;
import java.util.Vector;


public class newProduct {
    // newProduct [] products;

    int id;
    String name;
    String  descrip;
    String brand;
    float weight;
    float quantity;
    String x,y,z;
    //LocalDate date= of(x,y,z);
    newProductGui n1;
    /*newProduct(int counter,Vector<newProduct> product){
        n1=new newProductGui(counter,product);

    }*/
    newProduct(int x){

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getBrand() {
        return brand;
    }

    public float getWeight() {
        return weight;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getZ() {
        return z;
    }
}
