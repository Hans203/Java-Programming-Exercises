

abstract class superhero{
    abstract void display();
    abstract void power();
    abstract void identity();
}
class incredible extends superhero{ 
    String name, superpower;
    incredible(){
        name = "Mr Incredible";
        superpower = "Super strength";
    }
    void display(){
        System.out.println(name+" possesses "+superpower);
    }
    void power(){
        System.out.println(name+" is using power "+superpower+" to throw a car onto his enemy");
    }
    void identity(){
        System.out.println("The real identity of "+name+" is Bob Parr");
    }
    
}
class Elastgirl extends superhero{ 
    String name, superpower;
    Elastgirl(){
        name = "Elastgirl";
        superpower = "Stretch her body";
    }
    void display(){
        System.out.println(name+" can "+superpower);
    }
    void power(){
        System.out.println(name+" is stretching he body to help civilians out of the chaos. ");
    }
    void identity(){
        System.out.println("The real identity of "+name+" is Helen Parr");
    }
    
    
}class Violet extends superhero{ 
    String name, superpower;
    Violet(){
        name = "Violet Parr";
        superpower = "invisibility and can generate force fields.";
    }
    void display(){
        System.out.println(name+" has "+superpower);
    }
    void power(){
        System.out.println(name+" is using invisibilty to evade her enemies. ");
    }
    void identity(){
        System.out.println("The real identity of "+name+" is Violet Parr");
    }
    
    
}class Dash extends superhero{ 
    String name, superpower;
    Dash(){
        name = "Dash parr";
        superpower = "super speed.";
    }
    void display(){
        System.out.println(name+" has "+superpower);
    }
    void power(){
        System.out.println(name+" is using dash to save civillian life from falling debris. ");
    }
    void identity(){
        System.out.println("The real identity of "+name+" is Dash Parr");
    }
    
    
}class Jack extends superhero{ 
    String name, superpower;
    Jack(){
        name = "Jack Parr";
        superpower = "multiple powers (laser eyes, shape-shifting, teleportation, etc).";
    }
    void display(){
        System.out.println(name+" has "+superpower);
    }
    void power(){
        System.out.println(name+" is using power laser eyes to eliminate all of his toys");
    }
    void identity(){
        System.out.println("The real identity of "+name+" is Jack Parr");
    }
}
public class incrediblesdriver{
    public static void main(String[] args){
        incredible i = new incredible();
        i.display();
        i.power();
        i.identity();
        System.out.println("");
        Elastgirl e = new Elastgirl();
        e.display();
        e.power();
        e.identity();
        System.out.println("");
        Violet v = new Violet();
        v.display();
        v.power();
        v.identity();
        System.out.println("");
        Dash d = new Dash();
        d.display();
        d.power();
        d.identity();
        System.out.println("");
        Jack j = new Jack();
        j.display();
        j.power();
        j.identity();
        System.out.println("");


    }
}