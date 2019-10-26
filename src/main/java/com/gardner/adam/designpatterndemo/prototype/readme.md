# Prototype

## Concepts
* Avoid costly creation
* Often a refactoring pattern and not a pattern people use up front
* Avoids subclassing
* Typically doesn't use "new"
* Often utilizes an interface
* Usually implemented with a registry (orig object made and then kept in registry then new items closed from it)

## Design
Clone/Cloneable interface to avoid keyword new

Although making a copy each instance is unique

Costly construction not handled by client

Can still utilized parameters for construction

Shallow vs deep copy (shallow = immediate props / deep = every object within)

## UML
![prototypeUML](./prototypeUml.png)


## Demo vs Example
* Example is the simple Example they gave
* Demo is the walkthrough with coding