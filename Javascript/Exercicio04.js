const prompt = require('prompt-sync')();

var number = parseInt(prompt("Digite um número Inteiro: "));

console.log("Número Informado:  "+ number);
console.log("Número Antecessor: "+ (number-1));
console.log("Número Sucessor:   "+ (number+1));