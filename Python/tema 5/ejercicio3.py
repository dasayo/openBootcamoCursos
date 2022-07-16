def esBisiesto(age: int) -> bool:
    if (age % 4 == 0) and (age % 400 == 0 or not(age % 100 == 0) ):
        return True
    return False

bisiesto = int(input('Ingrese un año: '))
print(f'El año {bisiesto} es biciesto.' if esBisiesto(bisiesto) else f'El año {bisiesto} no es bisiesto.')
