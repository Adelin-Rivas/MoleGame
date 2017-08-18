import java.util.concurrent.ThreadLocalRandom;

public class MoleGame {
	

	    private int score;
	    private int moleLeft;
	    private int attemptsLeft;
	    private char moleGrid [][] = new char[0][0];
	    private int dimesion;
	    private char moleGridUser[][]=new char[0][0];

	    MoleGame(int numberAttempts, int gridDimesion ){
	        this.moleGrid=new char[gridDimesion][gridDimesion];
	        this.attemptsLeft=numberAttempts;
	        dimesion=gridDimesion ;
	        this.setUPGrid();
	        this.generateMoles();


	    } // end construtor
	    
	    
	    private void setUPGrid() {
	    	for(int i=0; i<dimesion; i++) {
	    		for(int p=0; p<dimesion; p++) {
	    			
	    			moleGrid[i][p]='*';
	    			
	    		}
	        		
	    		
	    		
	    		
	    	}
	      
	    	
	    }// end setUPGrid
	    
	    private void generateMoles() {
	    	int i=0;
	    	while(i<dimesion) {
	    		int colum = ThreadLocalRandom.current().nextInt(0, dimesion );
	    		int row = ThreadLocalRandom.current().nextInt(0, dimesion );
	    		if(moleGrid [colum][row]!='M') {
	    			
	    			moleGrid [colum][row]='M';
	    			
	    			i++;
	    			
	    		}
	    		
	    	} // end while
	    
	    }// generateMoles
	    
	    public void printArray() {
	    	for(int colum=0;colum <dimesion; colum++) {
	    		
	    		for(int row=0;row<dimesion; row++) {
	    			System.out.print(moleGrid [colum][row]);
	    			
	    			
	    		}
	    		
	            System.out.println( );	
	    		
	    	} 
	    	
	        System.out.println( );
	    } // end printArray
	    

	    
	    
	    
	    
	    
	    public void printUserArry() {
	    	
	    	
               for(int colum=0;colum <dimesion; colum++) {
	    		
	    		for(int row=0;row<dimesion; row++) {
	    			
	    			if(moleGrid [colum][row]!='M') {
	    			    System.out.print(moleGrid [colum][row]);
	    			}
	    			
	    			else {
	    				
	    				System.out.print('*');
	    			
	    			}
	    			
	    		}
	    		
	            System.out.println( );	
	    		
	    	} 
               System.out.println( );
	    	
	    } // end printArrayUser
	    
	    public void wack(int x, int y) {
	    	
	    	
	    	if(moleGrid[y][x]=='M') {
	    		moleGrid[y][x]='w';
	    	    System.out.println("you wacked a mole");
	    	
	    	
	    	    
	    	}
	        else {
	        	attemptsLeft-=1;
	    		System.out.println("wrong position/n you have attend"+ attemptsLeft+" left");
	    		
	    	
	        
	        }
	    } 	
	    	
	    
	    
	    
	    public static void main(String[] args){
	    	MoleGame whackit = new MoleGame(10,10);
	    	whackit.printArray(); // test
	    	whackit.printUserArry(); // test
	        
	  




	    } // end  main




	




}// class 
