# Basic RMI example with Java
Here **MathOperations** is the Remote interface and **MathOperationsC** is the class that implements the interface.
 Compile the files using this command:
```
javac *.java
```
compile stub and skeleton using this command:
```
rmic MathOperationsC
```
You will see the stub.class in the same directory.
Start rmiregistry on **windows**:
```
start rmiregistry
```

on **Unix**:
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
Stop rmiregistry on **unix**:
```
killall -9 rmiregistry
```
