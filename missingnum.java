public class missingnum {
    public static void main(String[]args){
        int[]arr={1,2,4,5};
        int sum1 =0;
        int sum2 =0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        System.out.println("sum of the array is  "+sum1);
        for(int i=0;i<=5;i++){
            sum2=sum2+i;
        }
        res=sum1-sum2;
        System.out.println("the missing integer is "+res);

    }
}
