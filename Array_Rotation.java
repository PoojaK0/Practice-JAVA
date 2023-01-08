/*
John Watson knows of an operation called a right circular rotation on an array of integers.
One rotation operation moves the last array element to the first position and shifts all remaining elements right one. 
To test Sherlock's abilities, Watson provides Sherlock with an array of integers. 
Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Sample Input 
3 2 3
1 2 3
0
1
2
Sample Output 
2
3
1
*/


    
public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

for(int i=0; i<k; i++){
  a.add(0,a.get(a.size()-1));
  a.remove(a.size()-1);
}

List<Integer> arr= new ArrayList<>();
  
for(int i : queries)
  arr.add(a.get(i));

return arr;

}
