# dp2kol
drugie kolokwium wzorce projektowe

includes:
- null object
- memento
- kompozyt ( + memento )
- proxy




Null Object Pattern 
	
	In Null Object pattern, a null object replaces check of NULL object instance. 
	Instead of putting if check for a null value, Null Object reflects a do nothing relationship. 
	Such Null object can also be used to provide default behaviour in case data is not available.
	
	In Null Object pattern, we create an abstract class specifying various operations to be done, 
	concrete classes extending this class and a null object class providing 
	do nothing implemention of this class and will be used seemlessly where we need to check null value.
	
	
Memento

	Need to restore an object back to its previous state (e.g. "undo" or "rollback" operations).

	
Composite
	
	Application needs to manipulate a hierarchical collection of "primitive" and "composite" objects. 
	Processing of a primitive object is handled one way, and processing of a composite object is handled 
	differently. Having to query the "type" of each object before attempting to process it is not desirable.
	
	
Proxy

    Provide a surrogate or placeholder for another object to control access to it.
    Use an extra level of indirection to support distributed, controlled, or intelligent access.
    Add a wrapper and delegation to protect the real component from undue complexity.

	