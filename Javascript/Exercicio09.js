const prompt = require('prompt-sync')();

var number = parseFloat(prompt("Digite um número Inteiro: "));

console.log("a) O próprio número:             "+ number);
console.log("b) O quadrado deste número:      "+ (number*2));
console.log("c) A raiz quadrada deste número: "+ Math.sqrt(number));