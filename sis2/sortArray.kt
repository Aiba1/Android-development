class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val (evens, odds) = nums.partition { it % 2 == 0 }
        return (evens + odds).toIntArray()
    }
}