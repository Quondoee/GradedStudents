# Section 7-10 Notes

# Field Initializers
Specify fields initial value as part of the fields declaration - can be an equation , can include other fields , can include method calls

Constructors can be chained

public class Passenger {
public Passenger (int freebags) {
this.freeBags = freeBags
}

public Passenger ( int freeBags , int checkedBags) {
this(freebags) ; 
this.checkedBags = checkedBags;
}
public Passenger( double perBagfee ) {
this.perBagfee = perBagfee;
}

#creating array of classes
Mathequation[] equations = new MathEquations[4]
equations[0] = new Mathequation()
array created from class MathEquations.

#Static Members
- Field = A value not associated witha specific instance ( All instances access the same value)
- Method = Performs an action not tied to a specific instance (has access to STATIC MEMBERS ONLY)
