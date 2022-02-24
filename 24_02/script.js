/*dato in ingresso un vettore v di dimensione dim, modifichi v scalando le sue componenti di un fattore di d.
Si ricorda che scalare un vettore di un fattore d significa moltiplicare tutte le sue componenti per il valore d.*/

function Scala(v,d) {
    for (let x = 0; x < v.length; x++) {
      v[x]*=d;
    }
    return v;
};
var v = [1,2,3,4,5,6,7,8,9];
console.log (Scala(v,2));