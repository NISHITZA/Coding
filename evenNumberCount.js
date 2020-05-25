/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) 
{
    let result=0;
    for(i of nums)
        {
            let val=counter(i);
            console.log(val);
            if(val%2==0)
                result++;
        }
    return result;
    
};
function counter(num)
{
    let count=0;
    console.log("counter");
    while(num>=1)
        {
            count++;
            console.log(count);
            num=num/10;
        }
    return count;
};
