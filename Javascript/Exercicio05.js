const prompt = require('prompt-sync')();

var salarioAtual = prompt("Informe seu salário atual: ");

var salarioAtualizado = salarioAtual * (1+0.15);

console.log("Salário atualizado: R$"+ salarioAtualizado.toFixed(2));
