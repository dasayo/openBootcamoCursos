altura = float(input('Por favor ingresa tu altura: '))
peso = float(input('Por favor ingresa tu peso: '))
imc = round(peso/(altura**2),2)
print(f'Tu indice de masa corpora es: {imc}.')
