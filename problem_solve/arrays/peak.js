// Peak element

function findPeakElement(nums) {
   let left = 0;
   let right = nums.length

   while (left < right) {
       let mid = left + (right + left) / 2

       if (nums[mid] > nums[mid + 1]) {
           right = mid - 1;
       } else {
           left = mid + 1;
       }
   }
   return left
}

var arr = [1, 2,3,6,5,8]
console.log(arr[findPeakElement(arr)])