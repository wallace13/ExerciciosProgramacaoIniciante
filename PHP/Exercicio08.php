<?php
echo "Digite a Distancia a ser Percorrida: ";
$distancia = fgets(STDIN); 
echo "Digite o Consumo Médio do Automóvel: ";
$consumo = fgets(STDIN); 

echo "Litros Necessarios: ".(floatval($distancia)/floatval($consumo))."L";

?>