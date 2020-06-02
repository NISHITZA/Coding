//https://leetcode.com/problems/height-checker
/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) 
{
    let temp = heights.slice();
    let res=0;
    temp.sort(compareTo);
    console.log(temp)
    for(let i in temp){
        if(temp[i]!=heights[i])
            res++;
    }
    return res;
    
};
function compareTo(a,b)
{
    if(a>b)return 1;
    if(a==b)return 0;
    if(a<b)return -1;
}
