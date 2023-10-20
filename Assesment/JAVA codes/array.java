import java.util. Arrays;
import java.util. Random;
class array 
{
    public static void shuffle(int n[])
    {
        for(int i=n.length-1; i>=1; i--)
        {
            Random rand=new Random();
            int j =rand.nextInt(i+1);
            swap_elements(n,i,j);
        }
    }
    private static void swap_elements (int[] n, int i, int j){
int temp=n[i];
n[i]=n[j];
n[j]=temp;
    }
    public static void main(String[] args){
        int[] n={1,2,3,4,5,6,7};
        System.out.println("original Array:"+Arrays.toString(n));
        shuffle(n);
        System.out.println("Shuffle array:"+ Arrays.toString(n));
    }
}