const prompt = require('prompt-sync')();

var dolar = prompt("Digite o valor em dolar: ");

//1 Dólar dos Estados Unidos/USD (220) = 4,8931 Real/BRL (790)
var real = dolar * 4.8931;

console.log("Valor em real: R$"+ real);