<?php
echo "Informe valor da Prestação: ";
$valor = fgets(STDIN); 
echo "Informe o tempo de atraso da Prestação: ";
$tempo = fgets(STDIN); 
echo "Informe o valor da Taxa de Atraso: ";
$taxa = fgets(STDIN); 

$prestacao = $valor+($valor*($taxa/100)*$tempo);

echo "Valor da Prestação com Atraso é de: R$".number_format($prestacao, 2, ',', '.');
?>