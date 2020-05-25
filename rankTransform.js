/**
 * @param {number[]} arr
 * @return {number[]}
 */
var arrayRankTransform = function(arr) {
    let map=new Map();
    let temp=arr.slice(0,arr.length);
    temp.sort(compareTo);
    console.log(temp);
    let rank=1;
    for(let i of temp)
        {
            if(!map.has(i))
                {
                    map.set(i,rank);
                    rank++;
                }
        }
    console.log(map);
    let  res=[];
    for(let i of arr)
        {
            let val=map.get(i);
            res.push(val);
        }
  
    return res;
    
    
};
function compareTo(a,b)
{
    if (a>b) return 1;
    if( a==b)return 0;
    if(a<b)return -1;
}
