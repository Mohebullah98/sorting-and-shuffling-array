import java.util.*;
class Main {
  public static int Array[];
  
  public static void printArray(int Array[]){
    for(int i=0;i<Array.length;i++){
      System.out.print(Array[i]+" ");
    }
    System.out.print("\n");
  }
  public static void sort(int Array[]){
    int pivot = 0;
    int index =0;
    for(int i=0;i<Array.length;i++){
      int min = Array[pivot];
      index=pivot;
      for(int j=pivot;j<Array.length;j++){
        if (Array[j]<min) {
          min = Array[j];
          index=j;
      }
    }
    int temp = Array[pivot];
    Array[pivot]=min;
    Array[index]=temp;
    pivot++;
    

  }
  }
  public static int RandomIntBetween(int min, int max){
    Random random = new Random();
    return random.nextInt(max-min)+min;
  }
  public static void Shuffle(int Array[]){
    int temp=0;
    for(int i=0;i<Array.length;i++){
      temp= Array[i];
      int nextInt= RandomIntBetween(i,Array.length);
      Array[i]=Array[nextInt];
      Array[nextInt]=temp;
    }
  }
  public static void main(String[] args) {
  Array = new int[] {5 , 8 , 11, 4 ,2 ,1 , 6};
  printArray(Array);
  sort(Array);
  System.out.print("Sorted Array: ");
  printArray(Array);
  Shuffle(Array);
  System.out.print("\nShuffled Array: ");
  printArray(Array);
  }
}
