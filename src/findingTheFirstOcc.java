public class findingTheFirstOcc {
    public static int Firstocc(int arr[],int num,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==num){
            return index;
        }
        return Firstocc(arr,num,index+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,4326,36,83,83};
        System.out.print(Firstocc(arr,36,0));

    }
}
