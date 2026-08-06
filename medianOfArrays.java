class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int [] arr = new int[n1+n2];
        int count=0;
        for(int i=0;i<n1;i++){
            arr[count]=nums1[i];
            count++;
        }
        for(int i=0;i<n2;i++){
            arr[count]=nums2[i];
            count++;
        }
        Arrays.sort(arr);

        int size=n1+n2;
        double ans=0;
        if(size%2==0){
            ans=(arr[size/2]+arr[(size/2) -1]);
            ans=ans/2;
        }else{
                ans=arr[size/2];
        }

        return ans;
    }
}