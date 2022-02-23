function pippo() {
    var input = document.getElementsByTagName("input");
    var cognome = input[0];
    var nome=input[1];
    if (cognome.value=="") { 
        alert("Il campo non puo essere vuoto");
        return;
    };
    
}