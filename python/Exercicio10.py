valor = float(input("Informe valor da Prestação: "))
tempo = float(input("Informe o tempo de atraso da Prestação: "))
taxa = float(input("Informe o valor da Taxa de Atraso: "))

prestacao = valor+(valor*(taxa/100)*tempo)

print(f"Valor da Prestação com Atraso é de: R${prestacao:.2f}")