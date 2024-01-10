<?php
echo "Digite o valor em dolar: ";
$dolar = fgets(STDIN); 

//1 Dólar dos Estados Unidos/USD (220) = 4,8931 Real/BRL (790)
$real = $dolar * 4.8931;

echo "Valor em real: R$".$real;

?>