// Linear Search
import java.util.ArrayList;

public class Q2 {
  public static void main(String[] args) {
    int [] arr={8,6,2,87,87,14,25};
    int target=87;
    // System.out.println(find(arr, target, 0));
    // System.out.println(findIndex(arr, target, 0));
    // System.out.println(findIndexFromLast(arr, target, arr.length-1));
    // // findAllIndex(arr, target, 0);
    // // System.err.println(list);
    // ArrayList<Integer> list=new ArrayList<>();
    // ArrayList<Integer> ans=findAllIndex(arr, target, 0,list);
    // System.out.println(list);
    // System.out.println(list);

    System.out.println(findAllIndex2(arr, target, 0));



  }
  static boolean find(int [] arr, int target, int index){
    if (index==arr.length) {
      return false;
    }

    return arr[index]==target || find(arr, target, index+1);
  }
  static int findIndex(int [] arr, int target, int index){
    if (index==arr.length) {
      return -1;
    }
if (arr[index]==target) {
  return index;
} else {
  return findIndex(arr, target, index+1);
  
}
  }
  static int findIndexFromLast(int [] arr, int target, int index){
    if (index==-1) {
      return -1;
    }
if (arr[index]==target) {
  return index;
} else {
  return findIndexFromLast(arr, target, index-1);
  
}
  }

  // static ArrayList<Integer> list=new ArrayList<>();
//   static void  findAllIndex(int [] arr, int target, int index){
//     if (index==arr.length) {
//       return;
//     }
// if (arr[index]==target) {
//   list.add(index);
// }
//  findAllIndex(arr, target, index+1);
//   }

static ArrayList<Integer>  findAllIndex(int [] arr, int target, int index, ArrayList<Integer> list){
  if (index==arr.length) {
    return list;
  }
if (arr[index]==target) {
list.add(index);
}
return findAllIndex(arr, target, index+1,list);
}


static ArrayList<Integer>  findAllIndex2(int [] arr, int target, int index){
  ArrayList<Integer> list=new ArrayList<>();
  if (index==arr.length) {
    return list;
  }
if (arr[index]==target) {
list.add(index);
}
ArrayList<Integer> ansFromBelowCalls=findAllIndex2(arr, target, index+1);
list.addAll(ansFromBelowCalls);
return list;


}
}

