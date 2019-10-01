<?php 
// Recursive PHP program to count 
// number of digits in a number 
  
function countDigit($n) 
{ 
    if ($n == 0) 
        return 0; 
    return 1 + countDigit((int)($n / 10)); 
} 
  
// Driver Code  
$n = 345289467; 
print ("Number of digits : " .  
            (countDigit($n))); 
  
?> 