package DivideAndConquer;

public class searchInRotatedSortedArray {
    public static int search(int arr[],int tar,int si,int ei)
    {
        //kam
        int mid=si+(ei-si)/2; // mid=si+ei/2
        // case found
        if (arr[mid]==tar)
        {
            return mid;
        }
        //case 1 mid on Left 1
        if (arr[si] <= arr[mid]) {
            //case a if left
            if (arr[si]<=tar&&tar<=arr[mid])
            {
                return search(arr,tar,si,mid-1);
            }
            else {
                //case b right
                return search(arr,tar,mid+1,ei);
            }




        }
        else {
            // case 2 right ma vetyo vane
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr,tar,mid+1,ei-1);
            }
            //case d: left ma vetyo vane
            else {
                return search(arr,tar,si,mid-1);
            }


        }
    }
    //input:sorted,rotated array with distinct number(not repreated) in acceding order it is rotated at a pivot point.Find the index of given element
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;// output<4
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
