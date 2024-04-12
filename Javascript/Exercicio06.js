const prompt = require('prompt-sync')();

var fahrenhei = prompt("Informe a temperatura em graus Fahrenhei: ");

var celsius = (fahrenhei - 32)* 5/9;

console.log("Temperatura em Fahrenhei: "+ fahrenhei);
console.log("Temperatura em Celsius:   "+ celsius);
