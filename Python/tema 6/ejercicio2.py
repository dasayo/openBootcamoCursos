class Alumno:
    def __init__(self, nombre, nota):
        self._nombre = nombre
        self._nota = nota

    def setNota(self,nota):
        self._nota = nota

    def getNota(self):
        return self._nota

