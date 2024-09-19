public class Bubblesort {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                flag=1;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={30,10,20,50,40};
        bubblesort(arr);


    }
}
