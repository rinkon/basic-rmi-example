# Basic RMI example with Java
compile the files using this command:
```
javac *.java
```
compile stub and skeleton using this command:
```
rmic MathOperationsC
```

Start rmiregistry on windows:
```
start rmiregistry
```

on Mac:
```
rmiregistry &
```


Run the server:

```
java RMIServer
```


On another terminal run the client:
```
java RMIClient
```
Stop rmiregistry on mac:
```
killall -9 rmiregistry
```
