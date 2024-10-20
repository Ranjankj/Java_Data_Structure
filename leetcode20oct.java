1. https://leetcode.com/problems/set-matrix-zeroes/description/
  so for optimized approach 
  time -> O(nm)
  space -> O(1)
  we have to do it in place without using extra space.
  
  for that we mark the zero in the 0th row and col.
  
  algo 
  1. first check the 0th row and col. (initialize two vaiable for that isRowHaveZero &  isColHaveZero)
  2. then traverse the matrix from (1, 1) and if a cell is zero set the corresponding row and col to zero.
  3. then traverse again the matrix from (1,1) and for a cell if there is a zero in row or col then set the cell to zero.
  4. and finally if isRowHaveZero or   isColHaveZero is zero make the entire row and col to zero.

2.https://leetcode.com/problems/next-permutation/description/
  algo
  1. Initialize a variable to find the break point `int index=-1;` (suffix array)
  2. Iterate from the back to find the break point where `nums[i]<nums[i+1];`(set index= i).
  3. find the just maximum element from nums[index] in the suffix array. (last occurance of that element).
  4. swap the nums[index] and nums[justmaxindex].
  5. reverse the suffix array.
  
  eg => [1,2,3,5,4]
  					 0,1, 2,3,4
  1. break point is 3 (index 2).
  2. just maximum element of 3 in the suffix[5,4] array is 4.
  3. swap both=>> [1,2,4,5,3] (after swapping).
  4. reverse the suffix array. [12,4,3,5]. (done).. :)


  
