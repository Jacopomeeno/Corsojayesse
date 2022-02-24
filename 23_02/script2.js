//sostituisci__carattere (s,c1,c2), dati in input una stringa s, e due caratteri c1 e c2, crei e restituisca in output
//una stringa contenente tutti i caratteri di s1 nella quale il carattere c1 deve essere sostituito dal carattere c2.

function sostituisci(s, c1, c2) {
    var f="";

    for (var x = 0; x < s.length; x++) {
        if (s[x]!=c1) {
            f+=s[x];
        }
        else{f+=c2;}
        
        return f;
        
    }
}

sostituisci("lago","g","t");
var h = sostituisci ("lago","g","t");
console.log(h);