class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            a[i]= a[i]+1;
            a[i]=a[i]%10;
            if(a[i]!=0)
                return a;

        }
        a=new int[n+1];
        a[0]=1;
        return a;
    }
}