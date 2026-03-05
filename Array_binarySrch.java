import java.util.*;
public class Array_binarySrch {
    public static int binarysearch(int arr[],int sechkey){
       int l=0,h=arr.length-1;
       while(l<h){
        int mid=(l+h)/2;
        if(arr[mid]==sechkey){
            return mid;
        }else if(arr[mid]>sechkey){
            h=mid-1;
        }else{
            l=mid+1;
        }
        }
       return -1;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,9,1,0,8,9};
        int sechkey=10;
        Arrays.sort(a);
        int result=binarysearch(a, sechkey);
        System.out.println("Element found at index: " + result);

    }
}
