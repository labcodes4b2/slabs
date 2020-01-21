import java.util.*; 

class stack2 
{ 
	static boolean validateStackSequence(int pushed[], 
										int popped[], int len) 
	{ 

		
		int j = 0; 

		
		Stack<Integer> st = new Stack<>(); 
		for (int i = 0; i < len; i++) 
		{ 
			st.push(pushed[i]); 

			while (!st.empty() && j < len && 
					st.peek() == popped[j]) 
			{ 
				st.pop(); 
				j++; 
			} 
		} 

		return j == len; 
	} 

	public static void main(String[] args) 
	{ 


		Scanner snehil=new Scanner(System.in);
		int a[],b[],size=snehil.nextInt();
		a= new int[size];
		b=new int [size];
		int key=0;
		for(int i=0;i<size;i++)
		{
			a[i]=snehil.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=snehil.nextInt();
		}
		for(int i=0;i<size;i++)
		{
				if(a[i]==b[size-1-i])
				{
					++key;
				}
			}
		if(key==size)
		{
			System.out.println("correct sequence");
		}
		else
		{
			System.out.println("incorrect sequence");
		}


	} 
} 
