import math

def esPrimo(a: float) -> bool:
    if a == 2:
        return True
    elif a > 2 and not (a % 2 == 0):
        i = 3
        while a % i != 0 and a != i:
            i+=2
        if a % i == 0 and a == i:
            return True
        else:
            return False

numero = int(input('Ingrese un nuemero: '))
primo = f'El numero {numero} es primo' if esPrimo(numero) else f'el numero {numero} no es primo'
print(primo)
