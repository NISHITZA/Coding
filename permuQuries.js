/**
 * @param {number[]} queries
 * @param {number} m
 * @return {number[]}
 */
var processQueries = function(queries, m) {
    var P = [];
    var output = [];
    for(var i=1; i<=m; i++){
        P.push(i)
    }
    for(var k=0; k<queries.length; k++){
        var a = P.indexOf(queries[k]);
        P.splice(a, 1);
        P.unshift(queries[k])
        output.push(a)
    }
    return output;
};
