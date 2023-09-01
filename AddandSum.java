class AddandSum{
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,4};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg = (double)sum/n;

        System.out.println("Addition of 1 4 3 2 4 is:"+sum);
        System.out.println("Average of 1 4 3 2 4 is:"+avg);
    }
}