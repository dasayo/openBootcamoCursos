import math
def triangulo(a,b):
    areaTriangulo = lambda b, h: (b*h)/2
    area = areaTriangulo(a,b)
    return area

areaCirculo = lambda r: (math.pi * r**2)/2 

print(f'El area de el triangulo es: {triangulo(5,2)}.')
print(f'El area de el ciculo es: {areaCirculo(10)}.')
