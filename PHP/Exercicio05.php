<?php
echo "Informe seu salário atual: ";
$salarioAtual = fgets(STDIN); 

$salarioAtualizado = $salarioAtual * (1+0.15);

echo "Salário atualizado: R$".number_format($salarioAtualizado, 2, ',', '.');

?>