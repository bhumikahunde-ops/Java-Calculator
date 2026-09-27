class Pen {
    String color;
    String type;
    public void write() {
        System.out.println("Writing something");
    }
    public void printtype() {
        System.out.println(this.type);
    }
}
public class oops {
    public static void main(String [] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.write();
        pen2.write();
        pen1.printtype();
        pen2.printtype();
    }
}
