# Učimo Javu

## Instalacija

Instalacija je najteži korak učenja [Jave](https://java.com/en/download/) :) Kad to uspete, već ste na pola puta. Na linuxu može ovako:

```
sudo apt-get install default-jre
sudo apt-get install default-jdk
```

## Kompajliranje i pokretanje

Izvorni Java fajlovi imaju ekstenziju `.java`. Izvorni kod kompajliramo komandom `javac` (skraćeno od *Java compiler*):

```
javac Zdravo.java
```

Kao rezultat dobijamo kompajlirani fajl `Zdravo.class`, koji pokrećemo komandom `java` (bez navođenja ekstenzije):

```
java Zdravo
```

Konvencija je da nazivi fajla budu isti kao nazivi klase u njemu.
