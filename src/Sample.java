package Midterms;

public class Sample 
{
    public static void main(String[] args)
    {
        SpaService spa = new SpaService(); 
        
        spa.setServiceDescription(spa.m_Service()); //argument `setter of setServiceDescription
        spa.setPrice(spa.m_Price());
        
        System.out.println(spa.getServiceDescription()); //direct display
        System.out.println(spa.getPrice());
        
        spa.m_Display(); //call from SpaService class
    }
}
