//creare una funzione che dati in input un numero e una stringa restituisca solo i caratteri fino a quel numero
function Conta(x,N) {
    if (N>x.length) {console.log("numero troppo grande");
    return x;
}
    var j=""
    for (var i = 0; i < N; i++) {
    j+=x[i];
    }
    return j
}
console.log(Conta("tavolo",4));