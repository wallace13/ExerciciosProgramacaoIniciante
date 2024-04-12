<?php
echo "Informe a temperatura em graus Fahrenhei: ";
$fahrenhei = fgets(STDIN); 

$celsius = ($fahrenhei - 32)* 5/9;

echo "Temperatura em Fahrenhei: ".$fahrenhei;
echo "Temperatura em Celsius:   ".$celsius;
?>