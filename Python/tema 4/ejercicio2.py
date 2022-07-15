inicial = int(input('ingrese el numero inicial: '))
final = int(input('ingrese el numero final: '))
for i in range(inicial,final+1):
    if not(i % 2 ==0):
        print(i)
