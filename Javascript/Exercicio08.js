const prompt = require('prompt-sync')();

var distancia = prompt("Digite a Distancia a ser Percorrida: ");
var consumo = prompt("Digite o Consumo Médio do Automóvel: ");

console.log("Litros Necessarios: "+distancia/consumo+"L");