class Sort {
  public static int Array[];

  public static void sort(int A[]){
    int min;
    for (int i=0;i<A.length;i++){
      min=A[i];
      int pivotV=A[i];
      int temp=i;
      for(int j=i;j<A.length;j++){
        if(A[j]<min) {
          min =A[j];
          temp =j;
        }
      }
      A[i]=min;
      A[temp]=pivotV;
    }
  }
  public static void printArray(int A[]){
    for(int i=0;i<A.length;i++){
      System.out.print(A[i]+" ");
    }
    System.out.print("\n");
  }
  public static void main(String[] args) {
    
    Array = new int [] {5, 7 ,2, 3, 2,12, 1};
    System.out.print("Original Array: ");
    printArray(Array);
    sort(Array);
    System.out.print("Sorted Array: ");
    printArray(Array);
  }
}