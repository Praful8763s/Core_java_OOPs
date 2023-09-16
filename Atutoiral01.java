import java.lang.Enum;
enum Color
{
    RED("red"),GREEN("green"),BLUE("blue");  
    private String value;
    Color(String value)
    {
     this.value = value;
    }
    public String getValue()
    {
        return value;
    }
}
class Atutorial01
{
    public static void main(String[] args)
    {
    Color c1 = new Color();
    c1.color = "red" ;
    
    //Color c2 = color.GREEN;
    // Color c3 = color.BLUE;
     System.out.println("Red Eneum name: " +    c1.name());
     //
     System.out.println("Red Eneum value: " + c1.getvalue());
    // System.out.println("Green Eneum value: " + c2.getvalue());
     //System.out.println("Blue Eneum value: " + c3.getvalue());
     for(Color color = Color.value()) {

     {
        System.out.println("Eneum value: " + color.getvalue()); 
     } 
     System.out.println(value);
     }
     System.out.println("");
    
    }
}
    

