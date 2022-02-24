/* inverti (s) che, data in input una stringa s restituisca in output la stringa s con i caratteri invertiti */


function inverti(s) {
    var v="";
    for (var i = s.length - 1; i >= 0; i--) {
        v+=s[i];
        
        
    } 
    return v;
}


console.log(inverti("tavolo"));