import java.util.*;

public class BucketSort{
  int data[];

  public BucketSort(int size){
    data = new int[size];
    for(int i = 0; i < size; i++){
      data[i] = Math.random()*100;
    }
  }

  public void sort(){
    //Divide into Buckets
    ArrayList<Integer>[] buckets = new ArrayList[10];//One arraylist for each bucket
    for(int i = 0; i < buckets.length; i++)//For each Bucket
			buckets[i] = new ArrayList<Integer>();//Inititialize the ArrayList
    for(int i = 0; i < data.length; i++){
      buckets[data[i]/10].add(data[i]);//Add the data into the correct bucket, found by dividing the number by 10
    }
    for(int i = 0; i < buckets.length; i++)//For each Bucket
      Collections.sort(buckets[i]);//Sort it. You can implement your own sort, but I decide to keep this lesson short and use Collections.sort()
    //Add back to data
    int counter = 0;
    for(int i = 0; i < buckets.length; i++)//For each Bucket
      for(int j = 0; j < buckets[i].size();j++){
        data[counter] = buckets[i].get(j).intValue();
        counter++;
      }
  }

  public String toString(){
    for(int i = 0; i < data.length; i++)
      System.out.print(data[i] + " ");
  }

  public static void main(String[]args){
    BucketSort bs = new BucketSort(20);

  }
}
