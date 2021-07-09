Feature: CruiseControl

Scenario: initialize carEngineON resume carEngineOFF shutdown 

Given initialize
When carEngineON
And resume
And carEngineOFF
And shutdown


Scenario: initialize carEngineON on disableCruiseControl accelerator on/enableControl disableCruiseControl carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And accelerator
And on/enableControl
And disableCruiseControl
And carEngineOFF
And shutdown


Scenario: initialize carEngineON on on carEngineOFF accelerator shutdown 

Given initialize
When carEngineON
And on
And on
And carEngineOFF
And accelerator
And shutdown


