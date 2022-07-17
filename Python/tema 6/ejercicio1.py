class Vehiculo:
    def __init__(self):
        self._color = 'verde'
        self._ruedas: int = 4
        self._puertas: int  = 2

    def __del__(self):
        print('destruyendo')
        pass

    def getColor(self):
        return self._color

    def getRuedas(self):
        return self._ruedas

    def getPuertas(self):
        return self._puertas

class Coche(Vehiculo):

    def __init__(self):
        super().__init__()
        self._velocidad: float = 276
        self._cilindrada: float = 5083

    def getCilindrada(self):
        return self._cilindrada

    def getVelocidad(self):
        return  self._velocidad

mustang = Coche()

print('El color del vehiculo es: ',mustang.getColor())
print('EL nuemero de puertas es: ',mustang.getPuertas())
print('El numero de ruedas es ',mustang.getRuedas())
print('La velocidad de maxima es: ',mustang.getVelocidad())
print('El cilindraje del vehiculo es: ',mustang.getCilindrada())
