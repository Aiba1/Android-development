class Solution {
    fun isPalindrome(s: String): Boolean {
        val Value = s.filter{it.isLetterOrDigit()}.lowercase()
        return Value == Value.reversed()
    }
}