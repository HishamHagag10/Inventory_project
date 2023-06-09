package Project;

public class Order {

    int id;
    String prodect;
    float quantity;
    String x,y,z;

    Order(int x){

    }
    public int getId() {
        return id;
    }

    public String getproduct() {
        return prodect;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProdect(String prodect) {
        this.prodect = prodect;
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
