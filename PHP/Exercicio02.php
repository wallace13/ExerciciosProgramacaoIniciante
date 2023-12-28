<?php
$valores = array_fill(0, 4, 0);
$soma = 0;
$multiplicacao = 1;

for ($i=0; $i < sizeof($valores); $i++) { 
    echo "Informe um valor{$i}: ";
    $valores[$i] = floatval(trim(fgets(STDIN))); 
}

foreach ($valores as $key => $value) {
    $soma += $value;
    $multiplicacao *= $value;
}

echo "a) Resultado de suas adições: {$soma}\n";
echo "b) Resultado de suas multiplicações:  {$multiplicacao}";

?>