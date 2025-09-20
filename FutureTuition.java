
package future.tuition;


public class FutureTuition {

   
    public static void main(String[] args) {
        
        double tuition = 10000;
        double purpose = 2 * tuition;
        double percentage = 0.07;
        int year = 0;
        
        while (tuition < purpose){
        
        tuition += tuition * percentage; 
        year++; 
        
            
        }
        System.out.println("It will take " + year + "s to double the tuition!");
        


        
    }
    
}
