let Url = 'http://192.168.2.32:4000/test';

function promiseGetData(method,url) {
    return new Promise ((resolve, reject) => {
        let xhr = new XMLHttpRequest();
        xhr.open(method, url);
        xhr.send(null);

        xhr.onload =() => {
            resolve(console.log(xhr.response));
        }
    });

}

function simpleSendData(method,url){
    let data = {
        email: "jacopo@test.com",
        numero: 3339876543
    };
    let xhr = new XMLHttpRequest();

    xhr.open(method, url);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.responseType = 'json';

    xhr.send(JSON.stringify(data));
    xhr.onload = () => {
        if(xhr.status >= 400){
            console.log("errore");
        }
    else{
        console.log("a posto");}
}
}

//console.log(promiseGetData())
promiseGetData("GET","http://192.168.2.32:4000/test")
