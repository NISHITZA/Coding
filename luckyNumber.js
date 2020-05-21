var findLucky = function(arr) {
    let map=new Map();
    for(let key of arr)
        {

            if(map.has(key))
                {
                    map.set(key,map.get(key)+1);
                }
            else
                {
                    map.set(key,1);
                }
        }
    let max=-1;
    let ans=0;
    map.forEach((value,key,map)=>{
        if(value==key)
            {
                ans=value
                if(ans>max)
                    {
                        max=ans;
                    }
            }
    });
    return max;
};
