Feature: OrdSet

Scenario: unionFilled remove remove removeU 

When unionFilled
And remove
And remove
And removeU


Scenario: createSet add add remove add remove remove add add add  

When createSet
And add
And add
And remove
And add
And remove
And remove
And add
And add
And add


Scenario: createSet remove add remove remove add add  

When createSet
And remove
And add
And remove
And remove
And add
And add


Scenario: createSet add remove remove remove add add removeU 

When createSet
And add
And remove
And remove
And remove
And add
And add
And removeU


Scenario: createU remove  

When createU
And remove


Scenario: createU add removeU 

When createU
And add
And removeU


Scenario: createU remove add remove add remove removeU 

When createU
And remove
And add
And remove
And add
And remove
And removeU


Scenario: createEmpty remove add add remove add remove add add remove remove remove add add  

When createEmpty
And remove
And add
And add
And remove
And add
And remove
And add
And add
And remove
And remove
And remove
And add
And add


Scenario: createEmpty add add add add  

When createEmpty
And add
And add
And add
And add


Scenario: createU  

When createU


Scenario: unionFilled removeU 

When unionFilled
And removeU


