var merge = function(n1, m, n2, n) 
{
    let res=[];
    let i=0;
    let j=0;
    let k=0;
    while(i<m && j<n)
        {
            if(n1[i]<n2[j])
                {
                    res[k]=n1[i];
                    k++;
                    i++;
                    console.log(res);
                }
            if(n1[i]==n2[j])
                {
                    res[k]=n1[i];
                    k++;
                    res[k]=n2[j];
                    i++;
                    j++;
                    k++;
                    console.log(res);
                }
            if(n1[i]>n2[j])
                {
                    res[k]=n2[j]
                    k++;
                    j++;
                    console.log(res);
                }
        }
    while(i<m)
        {
            res[k]=n1[i];
            i++;
            k++;
        }
    while(j<n)
        {
            res[k]=n2[j];
            j++;
            k++;
        }
    return res;
};
