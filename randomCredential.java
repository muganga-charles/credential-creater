import java.util.Random;

/**
 * randomCredential
 */
public class randomCredential {

    public static void main(String[] args) {
        
        Random rand = new Random();//creates a random object
        int num1 = rand.nextInt(10) + 0;
        int num2 = rand.nextInt(10) + 0;
        int num3 = rand.nextInt(10) + 0;
        int num4 = rand.nextInt(10) + 0;
        int num5 = rand.nextInt(10) + 0;
        int num6 = rand.nextInt(10) + 0;
        int num7 = rand.nextInt(10) + 0;
        int num8 = rand.nextInt(10) + 0;
        int num9 = rand.nextInt(10) + 0;
        int num10 = rand.nextInt(10) + 0;
        int num11 = rand.nextInt(10) + 0;
        int num12 = rand.nextInt(10) + 0;
        

        String Access_digits= Access(num1,num2,num3,num4,num5);
        System.out.printf("the access is A%s",Access_digits);
        System.out.println("");
        System.out.printf("the registration number is "+ registration(num6, num7, num8, num9, num10, num11, num12));

        
    }
    
    public static String Access(int num1,int num2,int num3,int num4,int num5){
        return num1 +""+num2+""+num3 +""+num4+""+num5;
    }
    
    public static String registration(int num6,int num7,int num8,int num9,int num10,int num11,int num12){
        return "J"+num6 +""+num7+"B"+num8 +""+num9+"/"+num10+""+num11+""+num12;
    }
}    