package Midterms;

public class SpaService
{
    private String serviceDescription;
    private double price;
    
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    
    public void setPrice(double pr)
    {
        price = pr;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String m_Service()
    {
        String serve = "Whole Body Massage";
        
        return serve;
    }
    
    public double m_Price()
    {
        double p = 650.25;
        
        return p;
    }
    
    public void m_Display()
    {
        System.out.println("The service description is : " + serviceDescription);
        System.out.println("The price is : " + price);
    }
    
}