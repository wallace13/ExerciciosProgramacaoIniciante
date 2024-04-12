<?php
$valores = array_fill(0, 3, 0);
$soma = 0;
for ($i=0; $i < sizeof($valores); $i++) { 
    echo "Informe um valor{$i}: ";
    $valores[$i] = floatval(trim(fgets(STDIN))); 
}

foreach ($valores as $key => $value) {
    $soma += $value;
}

echo "Média Aritmética: ".($soma/sizeof($valores));

?>