Feature: CruiseControl

Scenario: initialize carEngineON on disableCruiseControl on/enableControl carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And on/enableControl
And carEngineOFF
And shutdown


