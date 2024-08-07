// https://leetcode.com/problems/largest-rectangle-in-histogram/description/
// Google, Facebook
// Most difficult question while learning DSA with Kunal
import java.util.Stack;

public class LargestAreaHistogram {
public static void main(String[] args) {
  
}
public int largestRectangleArea(int[] heights) {
 Stack<Integer> stack=new Stack<>();  
 int max=0;

 stack.push(0);

 for (int i = 1; i < heights.length; i++) {
  while (!stack.isEmpty() && heights[i]<heights[stack.peek()]) {
    max=getMax(heights,stack,max,i);
  }

  stack.push(i);
 }

 int i=heights.length;
 while (!stack.isEmpty()) {
  max=getMax(heights,stack,max,i);
 }

 return max;     
}
private int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
  int area;
  int popped=stack.pop();
  if (stack.isEmpty()) {
    area=arr[popped]*i;
  }else{
    area=arr[popped]*(i-1-stack.peek());
  }
  return Math.max(max, area);
}
}

// method -2 /// not efficient

// public static int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         Stack < Integer > st = new Stack < > ();
//         int leftSmall[] = new int[n];
//         int rightSmall[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
//                 st.pop();
//             }

//             if (st.isEmpty()) leftSmall[i] = 0;
//             else leftSmall[i] = st.peek() + 1;
//             st.push(i);
//         }

//         // clear the stack to be re-used
//         while (!st.isEmpty()) st.pop();

//         for (int i = n - 1; i >= 0; i--) {
//             while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
//                 st.pop();
//             }

//             if (st.isEmpty()) rightSmall[i] = n - 1;
//             else rightSmall[i] = st.peek() - 1;

//             st.push(i);
//         }

//         int maxA = 0;
//         for (int i = 0; i < n; i++) {
//             maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
//         }
//         return maxA;

//     }


// method -3 

// static int largestRectangleArea(int histo[]) {
//   Stack < Integer > st = new Stack < > ();
//   int maxA = 0;
//   int n = histo.length;
//   for (int i = 0; i <= n; i++) {
//       while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
//           int height = histo[st.peek()];
//           st.pop();
//           int width;
//           if (st.empty())
//               width = i;
//           else
//               width = i - st.peek() - 1;
//           maxA = Math.max(maxA, width * height);
//       }
//       st.push(i);
//   }
//   return maxA;
// }