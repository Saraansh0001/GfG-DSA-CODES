=
class Main {
    public static void main(String[] args) {
        int [] arr = { 1,7,8,9,11 };
        int [] arr2 = { 2,3,4,5,19 };
        
        int n = arr.length ;
        int m = arr2.length ;
        
        int [] arr3 =  new int[m+n] ;
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        
        while ( i<n && j<m )
        {
            if ( arr[i] < arr2[j] ) 
            {
                arr3[k] = arr[i];
                i++;
            } else
            {
                arr3[k] = arr2[j];
                j++;
            }
            k ++ ;
        }
        
        while ( k < m+n-1 && i<n ){
            arr3[k] = arr[i] ;
            k++ ;
            i++;
        }
        
        
        while ( k < m+n-1 && j<m ){
            arr3[k] = arr2[j] ;
            k++;
            j++;
        }
        
        for (int x = 0; x < arr3.length; x++){
            System.out.print(arr3[x] + " ");
        }
    }
}
