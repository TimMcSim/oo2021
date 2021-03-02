package kodutoo_20210216;

public class SheepCount {
    
    String countersName;
    public SheepCount(String myName){
        countersName = myName;
    }

    public String explanation(){
        return "Hi, "+countersName+"! Wellcome to the Sheep Counter! If you have any problems with Your sleep, just count some sheeps with us! \n *sheeps not included*";
    }
    
    public String oneTwoThree(){

        for (int i = 1; i < 11; i++) {
            
            try {
                Thread.sleep(1000);
            }catch(InterruptedException sheepdelay){
                System.exit(0);
            }
            
            if (i == 1){
                System.out.println(i + " sheep");
            } else {
                System.out.println(i + " sheeps");
            }
        }
        return countersName+" are You asleep?";
    }

}
