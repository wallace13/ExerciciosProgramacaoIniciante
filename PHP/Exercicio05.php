<?php
echo "Informe seu salário atual: ";
$salarioAtual = fgets(STDIN); 

//1 Dólar dos Estados Unidos/USD (220) = 4,8931 Real/BRL (790)
$salarioAtualizado = $salarioAtual * (1+0.15);

echo "Salário atualizado: R$".number_format($salarioAtualizado, 2, ',', '.');

?>