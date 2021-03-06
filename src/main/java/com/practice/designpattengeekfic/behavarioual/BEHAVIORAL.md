# Behavioral Pattern

Communication and Assignment of Responsibilities between our objects

---

### Chain of Responsibility

---
### Command Pattern

> Turn a request or behaviour into a stand-alone object that contains everything about that request.

> It is used to Encapsulate all the relevant information needed to perform an action or trigger an event.

---
### Template Method

> Turns an algorithm into `series of individual steps`

* Keep the structure of your base algorithm intact
* Eliminates code duplication by pulling up the steps with similar implementation to the super class.

---
### Mediator 

> Defines an object that encapsulates how a set of other objects interact with one another

* This pattern restricts direct communication between objects and forces them to collaborate via Mediator, 
  hence reducing the dependency between them

* Extract all relationships between your classes into a separate class

---
### Memento

> Delegates creating the states snapshots to the actual owner of the state
> Hence, the original class can make snapshot since it has full access to its own state

---
### Observer

> Notify multiple objects, or subscribes, about any events that happen to the object they're observing, or publisher

---
### State

> Allows an object alter its behaviour when its internal state changes

---
### Strategy

> Defines a family of BEHAVIOUR, puts each of them into a SEPARATE CLASS, and make their OBJECTS INTERCHANGEABLE.
> This makes the strategy replaceable and interchangeable at RUNTIME by clients
---
### Iterator

> Extracts the iterator behaviour of a collection into a separate object called an iterator

> Traverse elements without exposing the underlying representation
---
### Visitor

> 