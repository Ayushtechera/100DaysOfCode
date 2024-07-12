public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,77,90,200};
        int target = 77;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s, int e){
        if(s > e){
            return -1;
        }                         

        int mid = s + (e-s)/2;

        if(target == arr[mid]){
            return mid; 
        }

        if(target > arr[mid]){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, 0, mid-1);

    }
}
