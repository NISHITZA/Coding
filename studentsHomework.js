/**
 * @param {number[]} startTime
 * @param {number[]} endTime
 * @param {number} queryTime
 * @return {number}
 */
var busyStudent = function(startTime, endTime, queryTime) 
{
    let res=0;
    for(let i in startTime)
        {
            if(queryTime>=startTime[i] && queryTime<=endTime[i])
                {
                    res++;
                }
        }
    return res;
};
