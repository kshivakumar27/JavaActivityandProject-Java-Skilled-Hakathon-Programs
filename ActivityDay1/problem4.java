import java.util.Scanner; 

public class problem4 { 
public static void main(String[] args) { 
int i,j,n,k=0,count,count1,l; 
Scanner in=new Scanner(System.in); 
n= in.nextInt(); 

if(n < 0) { 
	System.out.println("Invalid array size"); 
	System.exit(0); 
	} 
else { 
	int healthcare[]=new int[n]; 
	int medical[]=new int[n]; 
	for(i = 0; i< n; i++) { 
		j = in.nextInt(); 

	if(j < 0) { 
		System.out.println("Invalid input"); 
		System.exit(0); 
		} 

	l=in.nextInt();
	if(l < 0) { 
		System.out.println("Invalid input"); 
		System.exit(0); 
		} 
	
	if(j<=i){
		healthcare[j-1]=l;
		}
	else{
		medical[j-1]=l;
	}
	}
	highestfeedback(healthcare,medical,n);

	} 


	}



public static void highestfeedback(int medical[], int healthcare[], int size) {
		for(int i=0; i<size; i++) {
			if(medical[i]==0) {
				continue;
			}
			else {
				if(medical[i]>healthcare[i]) {
					System.out.println(i+1);
					System.out.println(medical[i]);
				}
				else {
					System.out.println(i+1);
					System.out.println(healthcare[i]);
				}
				healthcare[i] = 0;
					
			}
		}
		for(int i=0; i<size; i++) {
			if(healthcare[i]==0)
				continue;
			else {
				System.out.println(i+1);
				System.out.println(healthcare[i]);
			}
		}
	}



















}
