
class hero {
    String nama;
    
    //method
    void display(){
        System.out.println("Nama : "+this.nama);
    }
}

class ironman extends hero {
    //kososng
}

public class latihaninheritance{
    public static void main(String[]args){
        ironman hero1 = new ironman();
        hero1.nama = "Robert Downey Jr";
        hero1.display();
    }
}