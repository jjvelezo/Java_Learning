import java.util.ArrayList;
public class Repetidos{
    
    public static int detectorDeRepetidos(ArrayList<Integer> a){
        
        int ab=0;
        for(int i=0; i < a.size(); i++){
            
            if(i+1==a.size()){
                break;
            }
            if((a.get(i)==a.get(i+1))&&((i==0) ||(a.get(i)!=a.get(i-1)))){
                ab++;
            }
            else{
                continue;
            }
        }
        return ab;
    }
}
