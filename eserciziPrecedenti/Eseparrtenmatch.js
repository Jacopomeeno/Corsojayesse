var s1="casa";
var s2="casale";
var x1="monte";
var x2="montagna";

function pmatch (x,z) {
    var M=s1.length;
    var m=s2.lenght;
    for (var y = 0; y <= m-M; y++) {
        var i;
       for (var i = 0; i < M; i++) {
           if (z[y+i]!=s1(i)) {
               continue;
           }; return true;
           
       };
       var h=pmatch(s1,s2)
       ;
            
        }
        
    }
