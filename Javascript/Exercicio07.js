const prompt = require('prompt-sync')();

var valores = new Array(3);
var soma = 0;
for (let i = 0; i < 3; i++) {
    valores[i] = prompt("Informe um valor" + (i + 1) + ": ");
}

valores.forEach(element => {
    element = parseFloat(element);
    soma += element;
});

console.log("Média Aritmética: "+(soma/valores.length));