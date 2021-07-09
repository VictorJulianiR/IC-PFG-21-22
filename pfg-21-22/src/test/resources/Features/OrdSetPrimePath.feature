Feature: OrdSet

Scenario: createSet remove add add remove add add remove remove add add remove removeU 

When createSet
And remove
And add
And add
And remove
And add
And add
And remove
And remove
And add
And add
And remove
And removeU


Scenario: createEmpty remove add add  

When createEmpty
And remove
And add
And add


Scenario: unionFilled removeU 

When unionFilled
And removeU


Scenario: createU  

When createU


Scenario: createEmpty add remove add add  

When createEmpty
And add
And remove
And add
And add


Scenario: createU add removeU 

When createU
And add
And removeU


Scenario: createSet add  

When createSet
And add


Scenario: createU remove remove add add  

When createU
And remove
And remove
And add
And add


Scenario: createEmpty add add  

When createEmpty
And add
And add


Scenario: createSet add add removeU 

When createSet
And add
And add
And removeU


Scenario: createEmpty add add add removeU 

When createEmpty
And add
And add
And add
And removeU


