import math
def triangulo(a,b):
    areaTriangulo = lambda b, h: (b*h)/2
    area = areaTriangulo(a,b)
    return area

areaCirculo = lambda r: (math.pi * r**2)/2 

print(triangulo(2,2))
print(areaCirculo(4))
