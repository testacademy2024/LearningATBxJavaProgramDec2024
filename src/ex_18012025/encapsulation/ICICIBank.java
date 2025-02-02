package ex_18012025.encapsulation;

public class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name, boolean IsAdmin) {
    if(IsAdmin){
        this.name = name;
    }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean IsAdmin) {
        if(IsAdmin){
            this.bal = bal;
        }

    }

    public ICICIBank(String name, long bal)
    {
        this.name=name;
        this.bal=bal;
    }
}
