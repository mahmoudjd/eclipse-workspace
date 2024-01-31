package uebung12;

public class Sort {
	public static int vertausch; //Anzah der Vertauschsoperationen

	
	/***
	 * Um den Array durch Insertion zu sortieren
	 ***/
	public static int[] insertionSort(int[] list)
	{
		int i , j ,key ,tmp ;
		vertausch = 0;
		for (i = 1 ; i< list.length ; i++)
		{
			key = list [i];
			j = i-1 ;
			while(j>= 0 && key < list [j] )
			{
				//Vertauschen (Swap)
				
				tmp = list[j];
				list[j] = list[j+1];
				list[j+1]= tmp ;
				j--;
				vertausch++;
			}
		}
		return list ;
	}
	
	/***
	 * Um den Array durch Selection zu sortieren
	 ***/
	public static int[] selectionSort(int[] array)
	{
		vertausch = 0;
		int i , j ,minValue, minIndex, tmp=0;
		for (i = 0; i< array.length; i++)
		{
			minValue = array[i];
			minIndex = i ;
			for (j = i ; j <array.length; j++)
			{
				if (array[j]<minValue)
				{
					minValue = array[j];
					minIndex= j ;
					vertausch++;
				}
			}
			if (minValue<array[i])
			{
				tmp = array[i];
				array[i]=array[minIndex];
				array[minIndex]= tmp;
				vertausch++;
			}
		}
		return array;
	}
	
	/***
	 *  Um den Array auszugeben
	 ***/
	public static  void Print(int[] array)
	{
		for(int a : array)
			System.out.print(a+"  ");
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr = {56, 22, 79,27, 9, 30, 61, 4, 69, 38, 52, 89, 23, 17, 68, 30};
		
		Sort.Print(Sort.insertionSort(arr));
		//Sort.Print(Sort.selectionSort(arr));
		System.out.println("Anzahl der Vertauschungen : "+Sort.vertausch);
		
		/**
		 * Die Anzahl der Vertauschungen bei Insertion-Sort : 57 
		 * Die Anzahl der Vertauschungen bei Selection-Sort : 39
		 **/
	
	}
	
	
}
