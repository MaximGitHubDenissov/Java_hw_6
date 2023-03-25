package Java_hw_6;

public class Notebook {
    private String brand;
    private String os;
    private int hd;
    private int om;
    private int size;
    private String color;

public Notebook(String brand, String os, int hd, int om, int size, String color){
    this.brand = brand;
    this.os = os;
    this.hd = hd;
    this.om = om;
    this.size = size;
    this.color = color;
}

public void setBrand(String brand) {
    this.brand = brand;
}
public String getBrand() {
    return brand;
}
public void setOs(String os) {
    this.os = os;
}
public String getOs() {
    return os;
}
public void setHd(int hd) {
    this.hd = hd;
}
public int getHd() {
    return hd;
}
public void setOm(int om) {
    this.om = om;
}
public int getOm() {
    return om;
}
public void setSize(int size) {
    this.size = size;
}
public int getSize() {
    return size;
}
public void setColor(String color) {
    this.color = color;
}
public String getColor() {
    return color;
}
@Override
public String toString() {
    String res = "";
    res += "\nБренд: "+brand;
    res+= "\nОперационная система: " + os;
    res+= "\nЖесткий диск: " + Integer.toString(hd) + "Tb";
    res += "\nОЗУ: " + Integer.toString(om) + "Gb";
    res += "\nДиагональ монитора: " + Integer.toString(size) + "дюймов";
    res += "\nЦвет: " + color;
    res += "\n----------------------------";
    return res;
}
}

