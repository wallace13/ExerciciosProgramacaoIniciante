const prompt = require('prompt-sync')();

var valor = parseFloat(prompt("Informe valor da Prestação: "));
var tempo = parseFloat(prompt("Informe o tempo de atraso da Prestação: "));
var taxa = parseFloat(prompt("Informe o valor da Taxa de Atraso: "));

var prestacao = valor+(valor*(taxa/100)*tempo);

console.log("Valor da Prestação com Atraso é de: R$"+ prestacao.toFixed(2));