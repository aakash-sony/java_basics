class Sim
{
    private double size;
    private String color;

    void call()
    {
        System.out.println("Calling...");
    }
    void sms()
    {
        System.out.println("Sending sms...");
    }
}

class Jio extends Sim
{
    @Override 
    void call()
    {
        super.call();
        System.out.println("Calling with Jio Sim...");
    }
    
    @Override
    void sms()
    {
        super.sms();
        System.out.println("Sending sms with Jio Sim...");
    }
}

class Airtel extends Sim
{
    @Override 
    void call()
    {
        super.call();
        System.out.println("Calling with Airtel Sim...");
    }
    
    @Override 
    void sms()
    {
        super.sms();
        System.out.println("Sending sms with Airtel Sim...");
    }
}

class Vodafone extends Sim
{
    @Override 
    void call()
    {
        super.call();
        System.out.println("Calling with Vodafone Sim...");
    }
    
    @Override 
    void sms()
    {
        super.sms();
        System.out.println("Sending sms with Vodafone Sim...");
    }
}

class Mobile
{
    void insertSim(Jio j)
    {
       System.out.println("Jio Sim is inserted."); 
       j.call();
       j.sms();
    }
    
    void insertSim(Airtel a)
    {
       System.out.println("Airtel Sim is inserted."); 
       a.call();
       a.sms();
    }
    
    void insertSim(Vodafone f)
    {
       System.out.println("Vodafone Sim is inserted."); 
       f.call();
       f.sms();
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile();
        
        Jio j = new Jio();
        Vodafone f = new Vodafone();
        Airtel a = new Airtel();
        
        m.insertSim(j);
        System.out.println();
        m.insertSim(f);
        System.out.println();
        m.insertSim(a);
    }
}