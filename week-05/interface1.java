interface iphone{
    void copy();
    void paste();
    void cut();
}
class phone implements iphone{
    public void copy(){
        System.out.println("Copy the code");
    }
     public void paste(){
        System.out.println("Paste the code");
    }
    public void cut(){
        System.out.println("Cut the code");
    }
}
public class interface1{
    public static void main(String[] args){
        phone c=new phone();
        c.copy();
        c.paste();
        c.cut();
    }
}