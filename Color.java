import java.util.Enum;
//package io.prafulsonwane.enum;
enum Color
{
    RED("red"),GREEN("green"),BLUE("blue");  
    private String value;
    Color(String value){
     this.value = value;
    }
    public String getValue(){
        return this.value;
}
}
class Atutorial01
{
    public static void main(String [] args)
    {
    Color c1 = color.RED; 
    
    Color c2 = color.GREEN;
     Color c3 = color.BLUE;
     System.out.println("Red Eneum name: " +    c1.name());
     System.out.println("Green Eneum    name: " + c2.name());
     System.out.println("Blue Eneum    name: " + c3.name());
     System.out.println("Red Eneum value: " + c1.getvalue());
     System.out.println("Green Eneum value: " + c2.getvalue());
     System.out.println("Blue Eneum value: " + c3.getvalue());
     for(Color color = getValue())
     {
        System.out.println("Eneum value: " + color.getvalue()); 
     } 
    }
    }
}
