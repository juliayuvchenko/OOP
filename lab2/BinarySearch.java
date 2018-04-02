
public class BinarySearch {
	
     public static void main(String[] args) {
     int data[] = { 3, 6, 7, 10, 34, 56, 60 };
     int numberToFind = 10;
     int num = data.length;
     int min = 0;
     int max = num;
     
         while((min <= max)&&(min<data.length)&&(max<=data.length)) {
             int middle = (min+max)/2;
             if (data[middle]==numberToFind){
                 System.out.print(middle);
                 return;
             }
             else if (data[middle]<numberToFind)
                 min = middle + 1;
             else if (data[middle]>numberToFind)
                 max = middle-1;
          }
      System.out.print(-1); }
}