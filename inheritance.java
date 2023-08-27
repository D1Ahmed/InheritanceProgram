class Animal{
    protected int id;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    Animal(){
        id= 0;
        System.out.println("Animal class default constructor");
    }
    Animal(int id){
        this.id=id;
        System.out.println("Animal class parameterized const");
    }

    public void tellAboutSelf(){
        System.out.println("Animal class");
    }

    public void speak(){
        System.out.println("I am an animal");
    }
}

//First INHERITANCE!!!!!!!!!!!!!!
class Reptile extends Animal{
    Reptile(){
        super.id= 1;
        System.out.println("Reptile class default constructor");
    }

    Reptile(int id){
        super.id=id;
        System.out.println("Reptile class parameterized constructor");
    }
    @Override
    public void tellAboutSelf(){
        System.out.println("Reptile class");
    }

    public void speak(){
        System.out.println("I am an Reptile");
    }
}
class Snake extends Reptile{
    public int getFamily(){
        return super.id;
    }
    @Override
    public void speak(){
        System.out.println("SSSSSSSSSSSSSSSS");
    }
}



//Second INHERITANCE!!!!!!!!!!!!!!
class Bird extends Animal{
    Bird(){
        super.id= 2;
        System.out.println("bird class default constructor");
    }
    Bird(int id){
        super.id=id;
        System.out.println("bird class parameterized constructor");
    }

    @Override
    public void tellAboutSelf(){
        System.out.println("Bird class");
    }
    @Override
    public void speak(){
        System.out.println("I am a Bird");
    }
}
class Parrot extends Bird{
    public int getFamily(){
        return super.id;
    }
    @Override
    public void speak(){
        System.out.println("trrrrrrrrrtrrrrrrrrrr");
    }
}


//THiRd INHERITANCE!!!!!!!!!!!!!!
class Mammal extends Animal{
    Mammal(){
        super.id= 3;
        System.out.println("Mammal class default constructor");
    }
    Mammal(int id){
        super.id=id;
        System.out.println("Mammals class parameterized constructor");

    }
    @Override
    public void tellAboutSelf(){
        System.out.println("Mammal class");
    }

    @Override
    public void speak(){
        System.out.println("anta mammal");
    }
}
class Horse extends Mammal{
    public int getFamily(){
        return super.id;
    }

    @Override
    public void speak(){
        System.out.println("hrrrrrrrrrrrrrrrrr");
    }
}

public class Main{
    public static void  main (String[]args){
        Mammal mammal = new Mammal();
        mammal.tellAboutSelf();
        mammal.speak();
        System.out.println("Mammal Family: " + mammal.getId());






    }
}