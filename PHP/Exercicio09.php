<?php
echo "Digite um número Inteiro: ";
$number = fgets(STDIN); 

echo "a) O próprio número:             ".floatval($number)."\n";
echo "b) O quadrado deste número:      ".(floatval($number)*2)."\n";
echo "c) A raiz quadrada deste número: ".sqrt(floatval($number))."\n";
?>