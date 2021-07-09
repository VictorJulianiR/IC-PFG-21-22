Feature: OrdSet

Scenario: unionFilled remove removeU 

When unionFilled
And remove
And removeU


Scenario: createSet add remove remove remove remove add add  

When createSet
And add
And remove
And remove
And remove
And remove
And add
And add


Scenario: createU  

When createU


Scenario: createEmpty add add add add removeU 

When createEmpty
And add
And add
And add
And add
And removeU


