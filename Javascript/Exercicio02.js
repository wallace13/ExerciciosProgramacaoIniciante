const prompt = require('prompt-sync')();

var valores = new Array(4);
var soma = 0;
var multiplicacao = 1;

for (let i = 0; i < 4; i++) {
    valores[i] = prompt("Informe um valor" + (i + 1) + ": ");
}

valores.forEach(element => {
    element = parseFloat(element);
    soma += element;
    multiplicacao *= element;
});

console.log("a) Resultado de suas adições: "+soma);
console.log("b) Resultado de suas multiplicações: "+multiplicacao);