# READ ME - Assumptions
extreme large test cases - assuming only 2000 items. 
assumed that the offers can be removed any time and more offers could be added/altered. 
That's why kept that as a new class (following Open closed principle)

The solution is not considering any future changes, as per the ask. For example, the Offers and prices are fixed to the values given in the question. 
Both the prices and the offers are subject to change, the code needs bit more refactoring so that they can be configured somewhere or dependency injected. 
But this code is a solution to the ask, (ASK says : build the simplest possible solution which meets our requirement.). 
Followed the TDD principles to the core.