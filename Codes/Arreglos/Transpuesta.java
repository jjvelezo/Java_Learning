public class Array {
    
    public static void transpuesta(int[][] args){
        
        int[][] abs = new int[args[0].length][args.length];
        
        for(int i=0;i<args.length;i++){
            
            for(int j=0;j<args[i].length;j++){
                
            abs[j][i]=args[i][j];
            }
        }
        for(int x=0;x<abs.length;x++){
            
            for(int y=0;y<abs[x].length;y++){
                
                System.out.println(abs[x][y]);
            }
        }      
    }
}
