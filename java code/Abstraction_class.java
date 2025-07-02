abstract class Person {
    int no;
    protected String name;
    Person(int no , String name)
    {
      this.no = no;
      this.name = name;
        System.out.println("NO : "+no +"\nName: "+name);
    }
    abstract void Details();
}

 class PersonDetails extends Person
{
    protected String profession;
    PersonDetails(int no , String name){
       super(no,name);
    }

    @Override
    void Details(){
        System.out.println("Hello from Details class "+ name);

        super.name ="";
    }

}


public class Abstraction_class {

    public static void main(String[] args) {
        Person m;
        m = new PersonDetails(10,"Mehul");

    }
}
