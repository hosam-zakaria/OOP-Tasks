/*
==========================================================
        Open/Closed Principle (OCP) Notes
==========================================================

Definition:
------------
Software entities should be:
- Open for Extension
- Closed for Modification

Meaning:
--------
You should be able to add new functionality
without changing existing code.

==========================================================
Wrong Design
==========================================================

class Planner {

    void plan() {

        Car car = new Car();
        Plane plane = new Plane();

        // ...

    }

}

Problem:
--------
If we add Train, we must modify Planner.

Train train = new Train();

=> Violates OCP.

==========================================================
Correct Design
==========================================================

Create an Interface:

interface TransportationMean {

    boolean canTravel(City from, City to);

    int cost(City from, City to);

}

Every transportation implements it:

class Car implements TransportationMean { }

class Ship implements TransportationMean { }

class Plane implements TransportationMean { }

Planner only knows the interface:

class Planner {

    List<TransportationMean> means;

}

Now adding Train:

class Train implements TransportationMean { }

No changes inside Planner.

==========================================================
Why Interface?
==========================================================

The interface acts as a Contract.

Every transportation must implement:

- canTravel()
- cost()

Planner works with the interface only,
not with specific classes.

==========================================================
Interview Answer
==========================================================

Q: Why did you use an Interface?

A:
Because I want Planner to depend on an
abstraction instead of concrete classes.

This allows adding new transportation means
without modifying Planner, satisfying the
Open/Closed Principle.

==========================================================
Memory Trick
==========================================================

Without Interface

Planner
 ├── Car
 ├── Ship
 └── Plane

Every new transportation requires modifying Planner.

----------------------------------------------------------

With Interface

            TransportationMean
                  ▲
      ┌───────────┼───────────┐
      │           │           │
     Car        Ship       Plane
                               ▲
                             Train

                 ▲
              Planner

Planner only knows TransportationMean.

==========================================================
Key Idea
==========================================================

Interface != OCP

The Interface is a TOOL used to achieve OCP.

OCP is the Principle.
Interface is one possible implementation.
==========================================================
*/
